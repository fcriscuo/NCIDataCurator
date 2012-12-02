package edu.jhu.en605.fcriscu1.ncidc.service;

import org.apache.axis.utils.StringUtils;

import com.sleepycat.dbxml.XmlException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/*
 * A Singleton supporting a number of REST requests to bioinformatics services
 * 
 */

public enum RESTService {
	instance ;
	
	
	public String getPubMedEntryAsXML(String pubMedId){
		if(StringUtils.isEmpty(pubMedId)){
			System.out.println("getPubMedEntryAsXML invoked with invalid parameter");
			return null;
		}
		
			Client client = Client.create();
			System.out.println("Retrieving PubMed ID "+pubMedId +" from TogoWS");
			WebResource webResource = client.resource("http://togows.dbcls.jp/entry/pubmed/" 
					+pubMedId +".xml");
			return webResource.get(String.class);	
	}
	
	public String getOmimAsText(String omimId){
		if(StringUtils.isEmpty(omimId)){
			System.out.println("getOmimAsText invoked with invalid parameter");
			return null;
		}
		
			Client client = Client.create();
			System.out.println("Retrieving PubMed ID "+omimId +" from TogoWS");
			WebResource webResource = client.resource("http://togows.dbcls.jp/entry/omim/" 
					+omimId);
			return webResource.get(String.class);	
	}
	
	
	/*
	 * Uses EMBL REST service to get PubMed entry as HTML
	 */
	public String getPubMedEntryAsHTML(String pubMedId){
		if(StringUtils.isEmpty(pubMedId)){
			System.out.println("getPubMedEntryAsHTML invoked with invalid parameter");
			return null;
		}
		
			Client client = Client.create();
			System.out.println("Retrieving PubMed ID "+pubMedId +" from EMBL");
			WebResource webResource = client.resource("http://www.ebi.ac.uk/Tools/webservices/rest/dbfetch/medline/" 
					+pubMedId );
			return webResource.get(String.class);	
	}
	
	/*
	 * Retrieve NCI Gene using REST
	 * 
	 */
	public String retrieveNCIGeneByHugoSymbol(String hugoSymbol) {
		if(StringUtils.isEmpty(hugoSymbol)){
			System.out.println("retrieveNCIGeneByHugoSymbol invoked with invalid parameter");
			return null;
		}
		Client client = Client.create();
		WebResource webResource = client.resource("http://cabioapi.nci.nih.gov/cabio43/GetXML?query=Gene[@hugoSymbol=" 
				+hugoSymbol +"]");
		return webResource.get(String.class);
		
	}

}
