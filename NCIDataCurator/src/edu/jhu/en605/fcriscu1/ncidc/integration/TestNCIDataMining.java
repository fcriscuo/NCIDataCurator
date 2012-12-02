package edu.jhu.en605.fcriscu1.ncidc.integration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.sleepycat.dbxml.XmlContainer;
import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlDocumentConfig;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlInputStream;
import com.sleepycat.dbxml.XmlManager;
import com.sleepycat.dbxml.XmlQueryContext;
import com.sleepycat.dbxml.XmlResults;
import com.sleepycat.dbxml.XmlValue;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import edu.jhu.en605.fcriscu1.ncidc.util.CommonNames;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory.ContainerType;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlManagerFactory;
import org.apache.commons.lang.StringUtils;

/*
 * An integration test to validate retreiving data from NCI using the caBIO API
 * and entering them into the local DB XML repository
 * 
 */
public class TestNCIDataMining {
	
	private XmlManager manager;
	private XmlContainer conatiner;
	
	private static final ContainerType containerType = ContainerType.TEST;

	public TestNCIDataMining() {
		this.manager = XmlManagerFactory.instance.getXmlManager();
		this.conatiner = XmlContainerFactory.instance.GetXmlContainerByType(containerType);
	}
	
	private void performTests(){
		try {
			//this.retrieveGeneUsingRest("BRCA2");
			//this.retrievePubMedUsingRest("16381885");
			this.loadDiseaseIndexFile();
			this.mineNCIForGenes();
			this.listDocuments();
			this.conatiner.close();
			//this.closeManagerUsingFactory();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	
	private void retrieveGeneUsingRest(String hugoSymbol) {
		System.out.println("Retrieving Gene for symbol " +hugoSymbol);
		Client client = Client.create();
		WebResource webResource = client.resource("http://cabioapi.nci.nih.gov/cabio43/GetXML?query=Gene[@hugoSymbol=" 
				+hugoSymbol +"]");
		String document = webResource.get(String.class);
		String documentName = "Gene_" +hugoSymbol +".xml";
		try {
			this.conatiner.putDocument(documentName, document);
			System.out.println("Docuement " +documentName +" added.");
		} catch (XmlException e) {
			System.out.println(documentName +" is already in the container. skipping entry");
		}
	}
	
	
	private void retrievePubMedUsingRest(String pubMedId) {
		Client client = Client.create();
		System.out.println("Retrieving PubMed ID "+pubMedId +" from TogoWS");
		WebResource webResource = client.resource("http://togows.dbcls.jp/entry/pubmed/" 
				+pubMedId +".xml");
		String document = webResource.get(String.class);
		String documentName = "PubMed_" +pubMedId +".xml";
		try {
			this.conatiner.putDocument(documentName, document);
			System.out.println("Docuement " +documentName +" added.");
		} catch (XmlException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void mineNCIForGenes() {
		List<String> hugoList = this.getHugoSymbols();
		if (null == hugoList || hugoList.isEmpty()){
			System.out.println("No gene symbols were found");
			return;
		} else {
			System.out.println("Found " +hugoList.size() +" gene symbols");
		}
		
		for (String hugoSymbol : hugoList){
			
			this.retrieveGeneUsingRest(hugoSymbol);
		}
		
		
	}
	
	
	
	public List<String> getHugoSymbols() {
		try {
			XmlDocumentConfig docConfig = new XmlDocumentConfig();
			docConfig.setLazyDocs(false);
			
			XmlDocument doc = this.conatiner.getDocument("testDisease.xml");
			System.out.println("Retrieved doc: " +doc.getName());
			// get the alias we used for this container when we created it
			String containerAlias = XmlContainerFactory.instance.getAliasByContainerType(containerType);
			
			XmlQueryContext context = this.manager.createQueryContext();
			
		    String baseDocQuery = "doc(\"ALIASNAME/testDisease.xml\")/GeneEntryCollection/GeneEntry/HUGOGeneSymbol/string()";
		    String docQuery = StringUtils.replaceOnce(baseDocQuery, "ALIASNAME", containerAlias);
		    
			System.out.println("Test query: " +docQuery);
			List<String> hugoList = new ArrayList<String>();
			XmlResults results = this.manager.query(docQuery, context);
			System.out.println("Found " +results.size() +" Gene Entry Collection(s)");
			while (results.hasNext()){
				XmlValue value = results.next();
				hugoList.add(value.asString());
				System.out.println(value.asString());
			}
			 
		   return hugoList;
			
		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
		
		
	}

	private void closeManagerUsingFactory() {
		System.out
				.println("Requesting XmlManager be closed by factory class...");
		XmlManagerFactory.instance.closeManager();
	}

	private void loadDiseaseIndexFile() {
		String docName = "testDisease.xml";
		System.out.println("Loading disease index file into container");
		File docFile = new File(CommonNames.Test_Container_Input_Filename);
		if (!docFile.exists()){
			System.out.println("File " +CommonNames.Test_Container_Input_Filename 
					+"does not exist");
			return;
		}
		
		try {
			if ( null != this.conatiner.getDocument(docName)) {
				System.out.println("Deleting existing copy of " +docName);
				this.conatiner.deleteDocument(docName);
			}
		} catch (XmlException e1) {
			// ignore document not found
		}
		
		try {
			XmlInputStream inStream = this.manager.createLocalFileInputStream(CommonNames.Test_Container_Input_Filename);
			this.conatiner.putDocument(docName, inStream);
			System.out.println("XML doc " +docName +" inserted from file " +CommonNames.Test_Container_Input_Filename);
		
		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	public void listDocuments() {
		try {
			XmlResults results = this.conatiner.getAllDocuments(new XmlDocumentConfig());
			//System.out.println("The container has " +results.size() +" documents");
			while (results.hasNext()) {
				XmlValue value = results.next();
				System.out.println("Document " +value.asDocument().getName());
			}
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestNCIDataMining test = new TestNCIDataMining();
		test.performTests();

	}

}
