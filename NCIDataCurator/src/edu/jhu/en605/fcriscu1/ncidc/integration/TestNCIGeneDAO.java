package edu.jhu.en605.fcriscu1.ncidc.integration;

import edu.jhu.en605.fcriscu1.ncidc.dao.DAOFactory;
import edu.jhu.en605.fcriscu1.ncidc.dao.NCIGeneDAO;
import gov.nih.nci.cabio.domain.Gene;


public class TestNCIGeneDAO {
	
	private NCIGeneDAO dao;

	public TestNCIGeneDAO() {
		this.dao = DAOFactory.instance.getNCIGeneDAO();
	}

		private void performTests() {
			this.testGetGene();
		}
		
		private void testGetGene() {
			String hugoSymbol = "BRCA1";
			Gene gene = this.dao.getGeneByHugoSymbol(hugoSymbol); 
			System.out.println("Retrieve Gene for " +hugoSymbol);
			System.out.println(gene.getFullName());
			
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestNCIGeneDAO test = new TestNCIGeneDAO();
		test.performTests();
	}

}
