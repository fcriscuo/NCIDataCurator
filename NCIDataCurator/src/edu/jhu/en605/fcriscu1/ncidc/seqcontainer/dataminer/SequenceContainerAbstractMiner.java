/**
 * 
 */
package edu.jhu.en605.fcriscu1.ncidc.seqcontainer.dataminer;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrTokenizer;

import com.sleepycat.dbxml.XmlContainer;
import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlManager;
import com.sleepycat.dbxml.XmlQueryContext;
import com.sleepycat.dbxml.XmlResults;
import com.sleepycat.dbxml.XmlValue;

import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlManagerFactory;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory.ContainerType;
import edu.jhu.fcriscu1.ncidc.generated.sequenceref.SequenceReference;

/**
 * Abstract class to represent components common to all 
 * data miners for this application.
 * n.b. concrete miner object utilize the NCI_DATA container for database operations
 * @author fcriscuo
 *
 */
public abstract class SequenceContainerAbstractMiner {
	XmlManager manager;
	XmlContainer conatiner;
	protected static final ContainerType containerType = ContainerType.SEQUENCE;
	
	SequenceContainerAbstractMiner () {
		this.manager = XmlManagerFactory.instance.getXmlManager();
		this.conatiner = XmlContainerFactory.instance.GetXmlContainerByType(containerType);
	}
	
	protected boolean validDocumentExists(String accession, String documentName){
		
		String containerAlias = XmlContainerFactory.instance.getAliasByContainerType(containerType);
		try {
			XmlDocument document = this.conatiner.getDocument(documentName);
		} catch (XmlException e) {
			// document does not exist
			return false;
		}
		// a document already exits - determine if it is too old
		String docQuery = "for $x in doc(\"" +containerAlias
		+"/"  +documentName +"\")/SequenceReference"
		+" where $x/SequenceReferenceIdentifier/AccessionID=\""
		+accession +"\" return $x/LastRetrievalDate/string()";
	
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
				return true;
			} else {
				// only delete when new data is retrieved
				System.out.println("Expired document " +documentName +" will be deleted");
				return false;
			}
		}
	} catch (XmlException e) {
		System.out.println(e.getErrorCode() +" " +e.getMessage());
		e.printStackTrace();
	}
		return false;
	}

	protected void deleteExistingDocument(String documentName){
		 try {
			XmlDocument doc = this.conatiner.getDocument(documentName);
			doc = null;
			this.conatiner.deleteDocument(documentName);
			System.out.println("Existing document: " +documentName +" deleted");
		} catch (XmlException e) {
			// ignore - no file to delete
		}
	}
	
	/*
	 * protected class to persist a new or replacement SequenceReference object into
	 * the Sequence container
	 */
	protected void persistSequenceReference(SequenceReference seqRef, String documentName){
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
	
	
}

