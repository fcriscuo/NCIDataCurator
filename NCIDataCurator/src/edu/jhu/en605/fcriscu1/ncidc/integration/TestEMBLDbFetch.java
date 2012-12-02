package edu.jhu.en605.fcriscu1.ncidc.integration;

import edu.jhu.en605.fcriscu1.ncidc.service.EMBLDbFetchService;

/*
 * Integration test for EMBLDBFetchService class 
 */

public class TestEMBLDbFetch {

	public TestEMBLDbFetch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("testing medline as XML");
		//System.out.println(EMBLDbFetchService.instance.fetchMedlineEntryAsXML("1198386"));
		//System.out.println("testing refseq as FASTA");
		System.out.println(EMBLDbFetchService.instance.fetchRefSeqAsFasta("NM_001728"));
		//System.out.println("testing refseq as RefSeq");
		//System.out.println(EMBLDbFetchService.instance.fetchRefSeqAsRefSeq("NM_001728"));
	}

}
