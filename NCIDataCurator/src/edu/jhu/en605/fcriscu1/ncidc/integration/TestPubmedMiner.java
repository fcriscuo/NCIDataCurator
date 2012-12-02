package edu.jhu.en605.fcriscu1.ncidc.integration;

import edu.jhu.en605.fcriscu1.ncidc.refcontainer.dataminer.PubmedMiner;

public class TestPubmedMiner {

	/*
	 * Integration test for PubmedMiner
	 */
	public TestPubmedMiner() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// attempt to retrieve a pubmed article and persist it into the database
		String pubmedId  = "1198386";
		PubmedMiner miner = new PubmedMiner();
		miner.minePubmedEntryByPubmedId(pubmedId, "ATP6AP1");

	}

}
