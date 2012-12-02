package edu.jhu.en605.fcriscu1.ncidc.refcontainer.dataminer;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import edu.jhu.en605.fcriscu1.ncidc.generated.referenceref.ReferenceProvenanceChain;
import edu.jhu.en605.fcriscu1.ncidc.generated.referenceref.ReferenceReference;
import edu.jhu.en605.fcriscu1.ncidc.generated.referenceref.ReferenceReferenceIdentifier;
import edu.jhu.en605.fcriscu1.ncidc.generated.referenceref.RetrievedReferenceEntry;
import edu.jhu.en605.fcriscu1.ncidc.service.EMBLDbFetchService;
import edu.jhu.en605.fcriscu1.ncidc.util.CommonUtils;
import gov.nih.nlm.ncbi.generated.medline.MedlineCitation;
import gov.nih.nlm.ncbi.generated.medline.MedlineCitationSet;


import org.apache.commons.lang.StringUtils;

import com.sleepycat.dbxml.XmlException;

public class PubmedMiner extends RefContainerAbstractMiner {

	/*
	 * Public class to mine data from a PubMed resource, map the data to a new
	 * ReferenceReference object and persist that later into the Reference container 
	 * as a new XML document.
	 * Extends RefContainerAbstractMiner to get a handle to the correct DB XML Container
	 */
	
	public PubmedMiner() {
		super();
	}
	
	/*
	 * public method to invoke mining of a specified PubMed reference for
	 * a gene entry.Since the XML document also includes the Hugo symbol, there
	 * is a possiblity for redundancy if the same pubmed entry has already been
	 * mined for another gene entry
	 * 
	 * TODO: modify design to support a list of HUGO symbols to avoid redundancy
	 */
	public String minePubmedEntryByPubmedId( String pubmedId, String hugoSymbol){
		if (StringUtils.isEmpty(pubmedId ) || StringUtils.isEmpty(hugoSymbol)){
			System.out.println(this.getClass().getSimpleName() 
					+" invoked with null or invalid parameter(s)");
			return null;
		}
		String docName = "RefRef_PubMed_" +hugoSymbol +"_"+pubmedId +".xml";
		// check to see if a valid (i.e. non expired) document exists
		if ( !this.validDocumentExists(pubmedId, docName)){
			MedlineCitation citation  = this.unmarshallPubmedData(pubmedId);
			ReferenceReference refRef = this.marshallPubmedDataToReferenceReference(citation, hugoSymbol);
			this.persistReferenceReference(refRef, docName);
			
		}
		
		return docName;
	}
	/* private method to get pubmed article from source and map it to JAXB 
	 * object graph
	 */
	private MedlineCitation unmarshallPubmedData (String pubmedId) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance("gov.nih.nlm.ncbi.generated.medline");
			Unmarshaller u = jc.createUnmarshaller();
			// use the EMBLDbFetchservice to get the pubmed data as an xml string
			String pubmedXML = EMBLDbFetchService.instance.fetchMedlineEntryAsXML(pubmedId);
			if (org.apache.axis.utils.StringUtils.isEmpty(pubmedXML)){
				System.out.println("unmarshallPubmedData failed to find PubMed entry for " +pubmedId);
				return null;
			}
			StringBuffer sb = new StringBuffer();
			if (!StringUtils.startsWith(pubmedXML, "<?xml")){
				sb.append("<?xml version=\"1.0\" +\"?>");
				sb.append(pubmedXML);
			} else {
				sb.append(pubmedXML);
			}
			MedlineCitationSet mlSet = (MedlineCitationSet) u.unmarshal( new StreamSource( new StringReader( sb.toString() ) ) );
			if (mlSet.getMedlineCitation().isEmpty()){
				return null;
			}
			MedlineCitation citation = mlSet.getMedlineCitation().get(0);
			System.out.println("PubMed article " +citation.getPMID() +"retrieved");
			return citation;
			
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	private ReferenceReferenceIdentifier mapReferenceIdentifier(MedlineCitation citation){
		ReferenceReferenceIdentifier id = new ReferenceReferenceIdentifier();
		id.setReferenceID(citation.getPMID());
		id.setReferenceType("PubMed");
		
		return id;
		
	}
	
	private ReferenceProvenanceChain mapProvenceChain(MedlineCitation citation){
		ReferenceProvenanceChain chain = new ReferenceProvenanceChain();
		chain.setPrimarySource(false);
		chain.setReferenceDataset("PubMed");
		chain.setReferenceSource("EMBL");
		String id =citation.getPMID();
		String url ="http://www.ebi.ac.uk/Tools/webservices/rest/dbfetch/medline/"
			+id +"/medlinexml";
			
		chain.setSourceURL(url);
		// if this is a secondary source, then include the provenance for the primary source
		if (!chain.isPrimarySource()){
			chain.getReferenceProvenanceChains().add(this.mapPrimaryProvenceChain(citation));
		}
		
		return chain;
		
	}
	
	/*
	 * private method to persist the new constructed SequenceReference into the
	 * DB XML database
	 */
	private void persistReferenceReference(ReferenceReference refRef, String documentName){
		try {
			JAXBContext jc = JAXBContext.newInstance( "edu.jhu.en605.fcriscu1.ncidc.generated.referenceref" );
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
			StringWriter sw = new StringWriter();
			m.marshal(refRef,sw);
			String s1 = sw.toString();
			String s2 =StringUtils.replace(s1, "&lt;", "<");
			String s3 =StringUtils.replace(s2, "&gt;", ">");
		    System.out.println("Marshalled ReferenceReference:");
		    System.out.println(s3);
		   
		    this.deleteExistingDocument(documentName);
		    this.conatiner.putDocument(documentName, s3);
		    System.out.println("ReferenceReference " +documentName +" persisted");
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
	private ReferenceReference marshallPubmedDataToReferenceReference
	(MedlineCitation citation, String hugoSymbol){
		
		ReferenceReference refRef = new ReferenceReference();
		refRef.setHugoSymbol(hugoSymbol);
		refRef.setLastRetrievalDate(CommonUtils.setCurrentDateInXMLGregorianCalendar());
		refRef.setReferenceProvenanceChain(this.mapProvenceChain(citation));	
		
		refRef.setReferenceReferenceIdentifier(this.mapReferenceIdentifier(citation));
		// copy the entire entry into the SequenceReference
		refRef.setRetrievedReferenceEntry(this.mapRetrievedReference(citation));
	
		return refRef;
	}
	
	
	
	private RetrievedReferenceEntry mapRetrievedReference(MedlineCitation citation){
		RetrievedReferenceEntry refEntry = new RetrievedReferenceEntry();
		
		try {
			JAXBContext jc = JAXBContext.newInstance("gov.nih.nlm.ncbi.generated.medline");
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		    StringWriter sw = new StringWriter();
		    m.marshal(citation,sw);
		    String s = sw.toString();
		    // remove the <xml tag>
		       int entryPos = StringUtils.indexOf(s, "<Medline");
		       String entryXml = StringUtils.substring(s, entryPos);
		       refEntry.setReferenceEntryXML(entryXml);
		    
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return refEntry;
	}
	
	private ReferenceProvenanceChain mapPrimaryProvenceChain(MedlineCitation citation){
		ReferenceProvenanceChain chain = new ReferenceProvenanceChain();
		chain.setPrimarySource(true);
		chain.setReferenceDataset("PubMed");
		chain.setReferenceSource("NCBI");
		String id = citation.getPMID();
		String url ="http://www.ncbi.nlm.nih.gov/entrez/eutils/efetch.fcgi/db=pubmed&query="
			+id;
			
		chain.setSourceURL(url);
		
		
		return chain;
		
	}
}
