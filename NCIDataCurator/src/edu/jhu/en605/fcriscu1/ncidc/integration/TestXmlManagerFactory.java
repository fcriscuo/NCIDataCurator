package edu.jhu.en605.fcriscu1.ncidc.integration;

import java.io.File;

import com.sleepycat.db.DatabaseException;
import com.sleepycat.dbxml.XmlContainer;
import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlDocumentConfig;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlInputStream;
import com.sleepycat.dbxml.XmlManager;
import com.sleepycat.dbxml.XmlQueryContext;
import com.sleepycat.dbxml.XmlResults;
import com.sleepycat.dbxml.XmlValue;

import edu.jhu.en605.fcriscu1.ncidc.util.CommonNames;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlManagerFactory;

/*
 * Public class that represents an integration test for
 * the XmlManagerFactory class
 * 
 */

public class TestXmlManagerFactory {

	XmlManager manager;

	public TestXmlManagerFactory() {
		this.manager = this.initManager();
	}

	private void executeTests() {
		if (null != this.manager) {
			this.testContainer();
			this.closeManagerUsingFactory();
		}
	}

	private void testContainer() {
		XmlContainer testContainer = null;
		System.out.println("Creating test container: "
				+ CommonNames.Test_Container_Filename);
		try {
			if (this.manager
					.existsContainer(CommonNames.Test_Container_Filename) > 0) {
				this.manager.removeContainer(CommonNames.Test_Container_Filename);
				System.out.println("Exixting test container removed.");
			}
				testContainer = this.manager
						.createContainer(CommonNames.Test_Container_Filename);
				System.out.println("Test container created.");
				
			
			this.testPutContainerString(testContainer);
			this.testPutContainerFile(testContainer);
			testContainer.close();
			System.out.println("Test container closed.");
			this.manager.removeContainer(CommonNames.Test_Container_Filename);
			System.out.println("Test container removed.");
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void testPutContainerString(XmlContainer testContainer) {
		String testString = "<Node0><Node1>Node1 text </Node1>"
			+"<Node2><Node3>Node3 text</Node3><Node3>Node3 text 2</Node3>"
			+"<Node3>Node3 text 3</Node3><Node4>300</Node4></Node2></Node0>";
		String docName = "testDoc1";
		
		try {
			testContainer.putDocument(docName, testString);
			System.out.println("Docuement " +docName +" added.");
			
			testContainer.deleteDocument(docName);
			System.out.println("Document  " +docName +" deleted.");
		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		}
	
	private void testPutContainerFile(XmlContainer testContainer) {
		String docName = "testDisease.xml";
		System.out.println("Testing file input into container");
		File docFile = new File(CommonNames.Test_Container_Input_Filename);
		if (!docFile.exists()){
			System.out.println("File " +CommonNames.Test_Container_Input_Filename 
					+"does not exist");
			return;
		}
		try {
			XmlInputStream inStream = this.manager.createLocalFileInputStream(CommonNames.Test_Container_Input_Filename);
			testContainer.putDocument(docName, inStream);
			System.out.println("XML doc " +docName +" inserted from file " +CommonNames.Test_Container_Input_Filename);
		System.out.println("Issuing XML query");
		this.performTestQuery(testContainer);
		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	
	public void performTestQuery (XmlContainer testContainer) {
		try {
			XmlDocumentConfig docConfig = new XmlDocumentConfig();
			docConfig.setLazyDocs(false);
			
			XmlDocument doc = testContainer.getDocument("testDisease.xml");
			System.out.println("Retrieved doc: " +doc.getName());
			
			testContainer.addAlias("NCIDATA");
			
			XmlQueryContext context = this.manager.createQueryContext();
			
			
		    String queryString ="collection(\"NCIDATA\")/GeneEntryCollection/GeneEntry/HUGOGeneSymbol";
			String docQuery = "doc(\"NCIDATA/testDisease.xml\")/GeneEntryCollection/GeneEntry[HUGOGeneSymbol=\"GBP1\"]";
				
			System.out.println("Test query: " +docQuery);
			
			XmlResults results = this.manager.query(docQuery, context);
			System.out.println("Found " +results.size() +" Gene Entry Collection(s)");
			while (results.hasNext()){
				XmlValue value = results.next();
				System.out.println(value.asString());
			}
			 
		
			
		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

	private void closeManagerUsingFactory() {
		System.out
				.println("Requesting XmlManager be closed by factory class...");
		XmlManagerFactory.instance.closeManager();
	}

	private void openTestContainer() {

	}

	private XmlManager initManager() {
		System.out.println("Reguesting XmlManager from factory class...");
		XmlManager manager = XmlManagerFactory.instance.getXmlManager();
		if (manager != null) {
			System.out.println("Acquired XmlManager from factory class...");
			try {

				System.out.println("Enviroment home = "
						+ manager.getEnvironment().getHome().getAbsoluteFile());

			} catch (XmlException e) {
				System.out.println(e.getErrorCode() + " " + e.getMessage());
				e.printStackTrace();
			} catch (DatabaseException e) {
				System.out.println(e.getErrno() + " " + e.getMessage());
				e.printStackTrace();
			}

		} else {
			System.out.println("Error - XmlManager is null");

		}
		return manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestXmlManagerFactory test = new TestXmlManagerFactory();
		test.executeTests();
	}

}
