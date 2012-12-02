package edu.jhu.en605.fcriscu1.ncidc.ncicontainer.dataminer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.axis.utils.StringUtils;

import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlInputStream;

import gov.nih.nci.cabio.domain.Gene;
import gov.nih.nci.common.util.XMLUtility;

import gov.nih.nci.system.applicationservice.ApplicationException;
import gov.nih.nci.system.applicationservice.ApplicationService;
import gov.nih.nci.system.client.ApplicationServiceProvider;
import gov.nih.nci.system.client.util.xml.XMLUtilityException;


/*
 * 
 * public class to mine an NCI Gene object and supporting data from NCI
 * Class uses caBIO Java API due to JAXB unmarshaller dealing with
 * xlink elements in REST response
 */
public class NCIGeneMiner extends NCIContainerAbstractMiner {

	
	private ApplicationService appService;
	private boolean connected;
	private XMLUtility xmlUtility;
	
	public NCIGeneMiner() {
		super();
		try {
			this.appService = ApplicationServiceProvider.getApplicationService();

	        this.xmlUtility = new XMLUtility();
			this.setConnected(true);
		} catch (Exception e) {
			this.setConnected(false);
			System.out.println("Failed to connect to NCI ApplicationService " +e.getMessage());
			e.printStackTrace();
		}
	}
	
	/*
	 * public method to mine and return a JAXB mapped Gene based on the
	 * supplied hugoSymbol
	 */
	public gov.nih.nlm.cabio.jaxb.generated.domain.Gene mineGeneByHugoSymbol(String hugoSymbol){
		if (StringUtils.isEmpty(hugoSymbol)){
			System.out.println("mineGeneByHugoSymbol invoked with invalid parameter");
			return null;
		}
	
		
		Gene queryGene = new Gene();
		queryGene.setSymbol(hugoSymbol);
		try {
			List resultList = this.appService.search(Gene.class, queryGene);
			if (resultList.isEmpty()) {
				System.out.println("Unable to find gene symbol: " +hugoSymbol +" in NCI database");
				return null;
			}
			// hugo symbol should be unique so only take first one
			for (Iterator resultsIterator = resultList.iterator(); resultsIterator.hasNext();) {
                 Gene returnedGene = (Gene) resultsIterator.next();
               
                	this.persistSelectedGene(returnedGene);
			}
			
		} catch (ApplicationException e) {
			System.out.println("Error mining gene symbol: " +hugoSymbol +" from NCI database");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		return null;
	}
	
	/*
	 * Convert the NCI gene object to an XML document and persist into database
	 * 
	 */
	private void persistSelectedGene(Gene selectedGene) {
		String documentName = "NCI_Gene_" +selectedGene +".xml";
		if (this.validDocumentExists(selectedGene.getHugoSymbol(), documentName)) {
			System.out.println("NCIGeneMiner: " +selectedGene.getHugoSymbol()
					+" already mined into database");
			return;
		}
		// the NCI API has a built in XML marshaller
		
		try {
			  System.out.println("Persisting gene : " + selectedGene.getSymbol());
			
			this.conatiner.putDocument(documentName,this.xmlUtility.toXML(selectedGene));
			System.out.println("NCI Gene for " +selectedGene.getHugoSymbol() 
					+" pesisted to database");
			
		} catch (XMLUtilityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	private void setConnected(boolean connected) {
		this.connected = connected;
	}

	public boolean isConnected() {
		return connected;
	}

}
