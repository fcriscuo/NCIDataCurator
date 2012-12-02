package edu.jhu.en605.fcriscu1.ncidc.dao;

import java.util.List;

import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;

/*
 *  Public interface to publish data access methods to persisted GeneEntry objects.
 *  The use of an interface supports decoupling clients from actual persistence 
 *  implementations. Only read access to GeneEntry object is supported.
 */

public interface GeneEntryDAO {
	
	public GeneEntry getGeneEntryByHugoSymbol(String hugoSymbol);
	public List<GeneEntry> getAllGeneEntries();
	

}
