package edu.jhu.en605.fcriscu1.ncidc.util;

import java.io.File;

import org.apache.commons.lang.StringUtils;

import com.sleepycat.dbxml.XmlContainer;
import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlInputStream;
import com.sleepycat.dbxml.XmlManager;

import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory.ContainerType;

/*
 * Java utility application that will load an XML file into a DB XML container and assign it a
 *document name.
 *Parameters: XML file name
 *            DB XML container name
 *            DB XML document name
 * 
 * If there is an existing document with the same name in the container it will
 * be replaced by the contents from the XML file
 */


public class XMLFileLoader {
	
	private XmlManager xmlManager;
	private XmlContainer xmlContainer;
	private File xmlInputFile;
	private String xmlDocumentName;
	
	private boolean valid;
	private boolean documentExists;
	
	private XMLFileLoader() {
		this.setValid(false);
		this.setDocumentExists(false);
	}
	
	public static XMLFileLoader createInstance(ContainerType aType,
			String inputFileName, String docName){
		
		if (null == aType || StringUtils.isEmpty(inputFileName) || 
				StringUtils.isEmpty(docName)){
			System.out.println("XmlFileLoader createInstance invoked with invalid parameter(s)");				
			return new XMLFileLoader();
		}
		
		File inputFile = new File(inputFileName);
		if (!inputFile.exists()){
			System.out.println("XmlFileLoader() invokes with invalid file: " +inputFileName);
			return new XMLFileLoader();
		}
		
		return new XMLFileLoader(aType, inputFile, docName);
	}

	private XMLFileLoader(ContainerType aType, File inputFile, String docName) {
		this.xmlManager = XmlManagerFactory.instance.getXmlManager();
		this.xmlContainer = XmlContainerFactory.instance.GetXmlContainerByType(aType);
		this.xmlDocumentName = docName;
		this.xmlInputFile = inputFile;
		this.setValid(true);
		this.checkForExistingDocument();
	
	}
	
	public void replaceExistingDocumentInConatiner() throws XmlException {
		this.xmlContainer.deleteDocument(this.xmlDocumentName);
		System.out.println("Existing document deleted.");
		this.loadXmlFileIntoContainer();
	}
	
	public void loadXmlFileIntoContainer() throws XmlException {
		XmlInputStream inStream = this.xmlManager.createLocalFileInputStream(this.xmlInputFile.getAbsolutePath());
		this.xmlContainer.putDocument(this.xmlDocumentName, inStream);
		System.out.println("XML doc " +this.xmlDocumentName +" inserted from file " +this.xmlInputFile.getAbsolutePath());
	}
	
	private void checkForExistingDocument(){
		try {
			XmlDocument document = this.xmlContainer.getDocument(xmlDocumentName);
			if (null != document) {
				System.out.println("The specified XML document: " +this.xmlDocumentName
						+" already exists in the container.\n");
				this.setDocumentExists(true);
			} else {
				this.setDocumentExists(false);
			}
		} catch (XmlException e) {
			System.out.println("The specified XML document: " +this.xmlDocumentName
					+" already exists in the container.\n");
			this.setDocumentExists(true);
		}
		
	}

	private void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isValid() {
		return valid;
	}

	private void setDocumentExists(boolean documentExists) {
		this.documentExists = documentExists;
	}

	public boolean isDocumentExists() {
		return documentExists;
	}

}
