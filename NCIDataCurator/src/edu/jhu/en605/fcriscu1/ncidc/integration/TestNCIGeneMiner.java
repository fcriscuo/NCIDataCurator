package edu.jhu.en605.fcriscu1.ncidc.integration;

import edu.jhu.en605.fcriscu1.ncidc.ncicontainer.dataminer.NCIGeneMiner;

public class TestNCIGeneMiner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NCIGeneMiner miner = new NCIGeneMiner();
		miner.mineGeneByHugoSymbol("BSG");
	}

}
