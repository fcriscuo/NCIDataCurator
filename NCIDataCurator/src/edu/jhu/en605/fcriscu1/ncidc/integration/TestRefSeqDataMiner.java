package edu.jhu.en605.fcriscu1.ncidc.integration;

import edu.jhu.en605.fcriscu1.ncidc.seqcontainer.dataminer.RefSeqDataMiner;

public class TestRefSeqDataMiner {

	/*
	 * Intergration test for RefSeqDataMiner
	 */
	public TestRefSeqDataMiner() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RefSeqDataMiner miner = new RefSeqDataMiner();
		miner.mineRefSeqByRefSeqId("NM_003824", "FADD");

	}

}
