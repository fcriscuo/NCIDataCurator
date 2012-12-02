package edu.jhu.en605.fcriscu1.ncidc.dao;

import gov.nih.nci.cabio.domain.Gene;

public interface NCIGeneDAO {
	
	public void mineGeneFromNCI(String hugoSymbol);
	
	public Gene getGeneByHugoSymbol(String hugoSymbol);
	


}
