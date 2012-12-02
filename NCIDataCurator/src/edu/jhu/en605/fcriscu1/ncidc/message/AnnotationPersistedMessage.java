package edu.jhu.en605.fcriscu1.ncidc.message;

import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;

public class AnnotationPersistedMessage {
	
	private GeneEntry geneEnty;
	
	public AnnotationPersistedMessage(GeneEntry anEntry) {
		this.geneEnty =anEntry;
	}
	
	public GeneEntry getGeneEntry() {
		return this.geneEnty;
	}

}
