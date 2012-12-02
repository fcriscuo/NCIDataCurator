/**
 * 
 */
package edu.jhu.en605.fcriscu1.ncidc.refcontainer.dataminer;

import java.util.Calendar;
import java.util.GregorianCalendar;

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

/**
 * Abstract class to represent components common to all 
 * data miners whose data is persisted in the REFERENCE Container.
 *
 * @author fcriscuo
 *
 */
public abstract class RefContainerAbstractMiner {
	XmlManager manager;
	XmlContainer conatiner;
	protected static final ContainerType containerType = ContainerType.REFERENCE;
	
	RefContainerAbstractMiner () {
		this.manager = XmlManagerFactory.instance.getXmlManager();
		this.conatiner = XmlContainerFactory.instance.GetXmlContainerByType(containerType);
	}
	
	protected boolean validDocumentExists(String identifier, String documentName){
		
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
		+" where $x/ReferenceReferenceIdentifier/ReferenceID=\""
		+identifier +"\" return $x/LastRetrievalDate/string()";
	
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
				// only delete existing document when new data is retrieved
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
}

