/**
 * 
 */
package edu.jhu.en605.fcriscu1.ncidc.ncicontainer.dataminer;

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
 * data miners for this application.
 * n.b. concrete miner object utilize the NCI_DATA container for database operations
 * @author fcriscuo
 *
 */
public abstract class NCIContainerAbstractMiner {
	XmlManager manager;
	XmlContainer conatiner;
	protected static final ContainerType containerType = ContainerType.NCI_DATA;
	
	NCIContainerAbstractMiner () {
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
		return true;
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

