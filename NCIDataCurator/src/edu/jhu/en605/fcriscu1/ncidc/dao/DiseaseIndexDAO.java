package edu.jhu.en605.fcriscu1.ncidc.dao;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntryCollection;

public class DiseaseIndexDAO {

	/*
	 * Public data access object to support access to NCI Disease Index XML
	 * data
	 */
	
	private GeneEntryCollection geCollection;
	public DiseaseIndexDAO() {
		this.geCollection = this.unMarshallDiseaseIndexXML();

	}
	public GeneEntryCollection getGeneEntryCollection() {
		return this.geCollection;
	}
	
	private GeneEntryCollection unMarshallDiseaseIndexXML() {
		try {
			JAXBContext jc = JAXBContext.newInstance("gov.nih.nlm.nci.diseaseindex.generated");
			Unmarshaller u = jc.createUnmarshaller();
			
			return  (GeneEntryCollection) u.unmarshal(new File( "NCI_data/disease_short.xml"));

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	public List<GeneEntry> getGeneEntries() {
		if ( null != this.geCollection){
			return this.geCollection.getGeneEntry();
		}
		return null;
	}

}
