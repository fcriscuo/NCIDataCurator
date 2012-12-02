package edu.jhu.en605.fcriscu1.ncidc.integration;

import com.sleepycat.dbxml.XmlException;

import edu.jhu.en605.fcriscu1.ncidc.util.CommonNames;
import edu.jhu.en605.fcriscu1.ncidc.util.XMLFileLoader;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory.ContainerType;
/*
 * An integration test to validate functionality of XmlFileLoader.
 * Restricted to using TEST container only
 * 
 * 
 */
public class TestXmlFileLoader {

	private static final ContainerType type = ContainerType.TEST;
	
	public TestXmlFileLoader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String docName = "testDisease.xml";
		XMLFileLoader loader =  XMLFileLoader.createInstance(type,
				CommonNames.Test_Container_Input_Filename, 
				docName);
		try {
			if (loader.isDocumentExists()){
				loader.replaceExistingDocumentInConatiner();
			} else {
				loader.loadXmlFileIntoContainer();
			}
		} catch (XmlException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
			e.printStackTrace();
		}
		

	}

}
