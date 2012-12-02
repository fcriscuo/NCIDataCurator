package edu.jhu.en605.fcriscu1.ncidc.integration;

import java.util.List;

import edu.jhu.en605.fcriscu1.ncidc.dao.DAOFactory;
import edu.jhu.en605.fcriscu1.ncidc.dao.GeneEntryDAO;
import edu.jhu.en605.fcriscu1.ncidc.dao.dbxml.GeneEntryDBXML;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;

public class TestGeneEnrtyDAO {

	public TestGeneEnrtyDAO() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeneEntryDAO dao = DAOFactory.instance.getGeneEntryDAO();

		dao = new GeneEntryDBXML();
		GeneEntry gEntry = dao.getGeneEntryByHugoSymbol("NF2");
		if (null != gEntry) {
			System.out.println(gEntry.getHUGOGeneSymbol() + " has "
					+ gEntry.getSentence().size() + " annotations");
		}
		List<GeneEntry> gec = dao.getAllGeneEntries();
		if (null != gec) {
			System.out.println("The database has " +gec.size() +" genes.");
		}
		
		

	}

}
