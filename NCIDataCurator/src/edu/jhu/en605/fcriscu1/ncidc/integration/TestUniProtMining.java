package edu.jhu.en605.fcriscu1.ncidc.integration;

import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import com.sleepycat.dbxml.XmlContainer;
import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlManager;
import com.sleepycat.dbxml.XmlQueryContext;
import com.sleepycat.dbxml.XmlResults;
import com.sleepycat.dbxml.XmlValue;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import edu.jhu.en605.fcriscu1.ncidc.util.CommonUtils;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlManagerFactory;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory.ContainerType;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.RetrievedSequenceEntry;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.SequenceProvenanceChain;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.SequenceReference;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.SequenceReferenceIdentifier;


import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrTokenizer;

public class TestUniProtMining {
	private XmlManager manager;
	private XmlContainer conatiner;
	
	private static final ContainerType containerType = ContainerType.TEST;


	/**
	 * Java integration test to validate mining UniProt using REST interface
	 * Persisted object is a SequenceReference 
	 */
	public TestUniProtMining() {
		this.manager = XmlManagerFactory.instance.getXmlManager();
		this.conatiner = XmlContainerFactory.instance.GetXmlContainerByType(containerType);
	}

	private void preformTests() {
		//System.out.println(this.retrieveUniProtSequenceEntry("P38398"));
		//org.uniprot.jaxb.generated.Uniprot uniprot = this.unmarshallUniProtData("P38398");
		//SequenceReference seqRef = this.marshallUniProtDataToSequenceReference(uniprot, "BRCA1");
		//this.persistSequenceReference(seqRef);
		this.testSequenceRetrieval("P38398");
		
	}
	
	private void testSequenceRetrieval(String accession) {
		String containerAlias = XmlContainerFactory.instance.getAliasByContainerType(containerType);
		String documentName = "SeqRef_UniProt_" +accession +".xml";
		// construct query
		String docQuery = "for $x in doc(\"" +containerAlias
			+"/"  +documentName +"\")/SequenceReference"
			+" where $x/SequenceReferenceIdentifier/AccessionID=\""
			+accession +"\" return $x/LastRetrievalDate/string()";
		System.out.println("Test query: " +docQuery);
		try {
			XmlQueryContext context = this.manager.createQueryContext();
			XmlResults results = this.manager.query(docQuery, context);
			System.out.println("Found " +results.size() +" SequenceReference(s)");
			while (results.hasNext()){
				XmlValue value = results.next();
				String retDate = value.asString();
				StrTokenizer token = new StrTokenizer(retDate,"-");
				String retMonth=  (String) token.getTokenList().get(1);
				int currentMonth = new GregorianCalendar().get(Calendar.MONTH) +1;
				if (new Integer(retMonth).intValue() == currentMonth){
					System.out.println("The Sequence Reference " +documentName +" has not expired");
				} else {
					System.out.println("current:" +currentMonth +" retMonth " +retMonth);
				}
			}
		} catch (XmlException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void deleteExistingDocument(String documentName){
		 try {
			XmlDocument doc = this.conatiner.getDocument(documentName);
			doc = null;
			this.conatiner.deleteDocument(documentName);
			System.out.println("Existing document: " +documentName +" deleted");
		} catch (XmlException e) {
			// ignore
		}
	}
	
	
	/*
	 * private method to persist the new constructed SequenceReference into the
	 * DB XML database
	 */
	private void persistSequenceReference(SequenceReference seqRef){
		try {
			JAXBContext jc = JAXBContext.newInstance( "edu.jhu.fcriscu1.ncidc.generated.sequenceref" );
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
			StringWriter sw = new StringWriter();
			m.marshal(seqRef,sw);
			String s1 = sw.toString();
			String s2 =StringUtils.replace(s1, "&lt;", "<");
			String s3 =StringUtils.replace(s2, "&gt;", ">");
		    System.out.println("Marshalled Sequence Reference:");
		    System.out.println(s3);
		    String documentName = "SeqRef_" +seqRef.getSequenceReferenceIdentifier().getSequenceSource()
		    	+"_" + seqRef.getSequenceReferenceIdentifier().getAccessionID() +".xml";
		    this.deleteExistingDocument(documentName);
		    this.conatiner.putDocument(documentName, s3);
		    System.out.println("SequenceReference " +documentName +" persisted");
		} catch (PropertyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/*
	 * private method to map retrieved UniProt sequence data to 
	 * JAXB class for a SequenceReference
	 */
	private SequenceReference marshallUniProtDataToSequenceReference
	(org.uniprot.jaxb.generated.Uniprot uniprot, String hugoSymbol){
		
		SequenceReference seqRef = new SequenceReference();
		seqRef.setHugoSymbol(hugoSymbol);
		seqRef.setLastRetrievalDate(CommonUtils.setCurrentDateInXMLGregorianCalendar());
		seqRef.setSequenceProvenanceChain(this.mapProvenceChain(uniprot.getEntry().get(0)));
		seqRef.setSequence(this.getUniProtSequence(uniprot.getEntry().get(0)));
		seqRef.setSequenceType("Protein");
		seqRef.setSequenceReferenceIdentifier(this.mapSequenceIdentifier(uniprot.getEntry().get(0)));
		// copy the entire entry into the SequenceReference
		seqRef.setRetrievedSequenceEntry(this.mapRetrievedSequence(uniprot));
	
		return seqRef;
	}
	/*
	 * private method to mrashall the UniProt JAXB tree to an XML String 
	 * and copy it to a Retrieved Sequence object
	 * 
	 */
	private RetrievedSequenceEntry mapRetrievedSequence(org.uniprot.jaxb.generated.Uniprot uniprot){
		RetrievedSequenceEntry seqEntry = new RetrievedSequenceEntry();
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance( "org.uniprot.jaxb.generated" );
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		    StringWriter sw = new StringWriter();
		    m.marshal(uniprot,sw);
		      String s = sw.toString();
		      // remove the <xml tag>
		       int entryPos = StringUtils.indexOf(s, "<uniprot");
		       String entryXml = StringUtils.substring(s, entryPos);
		       
		       seqEntry.setSequenceEntryXML(entryXml);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		return seqEntry;
	}
	
	private SequenceReferenceIdentifier mapSequenceIdentifier(org.uniprot.jaxb.generated.Entry entry){
		SequenceReferenceIdentifier refId = new SequenceReferenceIdentifier();
		refId.setSequenceSource("UniProt");
		refId.setAccessionID(entry.getAccession().get(0));
		
		return refId;
	}
	
	
	
	private String getUniProtSequence(org.uniprot.jaxb.generated.Entry entry){
		return entry.getSequence().getValue();
	}
	
	
	/*
	 * private method to use data within the Uniprot entry to contruct a
	 * a provenance chain. Uniprot is considered a primary source
	 * 
	 */
	private SequenceProvenanceChain mapProvenceChain(org.uniprot.jaxb.generated.Entry entry){
		SequenceProvenanceChain chain = new SequenceProvenanceChain();
		chain.setPrimarySource(true);
		chain.setSequenceDataset(entry.getDataset());
		chain.setSequenceSource("UniProt");
		
		String url ="http://www.uniprot.org/uniprot/"
			+entry.getAccession().get(0) 
			+".xml?include=yes";
		chain.setSourceURL(url);
		
		
		return chain;
		
	}
	
	
	private org.uniprot.jaxb.generated.Uniprot unmarshallUniProtData(String accession) {
		try {
			JAXBContext jc = JAXBContext.newInstance("org.uniprot.jaxb.generated");
			Unmarshaller u = jc.createUnmarshaller();
			URL url = new URL("http://www.uniprot.org/uniprot/" 
				+accession +".xml?include=yes");
			org.uniprot.jaxb.generated.Uniprot uniprot = (org.uniprot.jaxb.generated.Uniprot) u.unmarshal(url);
			if (null != uniprot && !uniprot.getEntry().isEmpty()){
				for (org.uniprot.jaxb.generated.Entry entry : uniprot.getEntry() ){
					for (String name : entry.getName()) {
						System.out.println("UniProt AC: " +accession +" name: " +name);
					}
				}
			}
			
			return uniprot;
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * Use a REST service to retrieve a sequence in XML format from
	 * UniProt using an accession id as a query parameter
	 * 
	 */
	private String retrieveUniProtSequenceEntry(String accession) {
		Client client = Client.create();
		System.out.println("Retrieving UniProt Accession "+accession +" from UniProt");
		WebResource webResource = client.resource("http://www.uniprot.org/uniprot/" 
				+accession +".xml?include=yes");
		String document = webResource.get(String.class);
		return document;
	}
	
	public static void main(String[] args) {
		 TestUniProtMining test = new  TestUniProtMining();
		 test.preformTests();

	}

}
