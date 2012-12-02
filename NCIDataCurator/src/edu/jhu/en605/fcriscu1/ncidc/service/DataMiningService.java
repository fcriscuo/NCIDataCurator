package edu.jhu.en605.fcriscu1.ncidc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.axis.utils.StringUtils;

import edu.jhu.en605.fcriscu1.ncidc.message.AnnotationPersistedMessage;
import edu.jhu.en605.fcriscu1.ncidc.message.MessageBus;
import edu.jhu.en605.fcriscu1.ncidc.message.listener.AnnotationPersistedEventListener;
import edu.jhu.en605.fcriscu1.ncidc.refcontainer.dataminer.PubmedMiner;
import edu.jhu.en605.fcriscu1.ncidc.seqcontainer.dataminer.RefSeqDataMiner;
import edu.jhu.en605.fcriscu1.ncidc.seqcontainer.dataminer.UniProtDataMiner;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;
import gov.nih.nlm.nci.diseaseindex.generated.Sentence;

/*
 * A public class that is responsible for listening to application annotation persisted events and
 * upon receiving such an event, to invoke known data miners. The object maintains a list of
 * genes whose data has already been mined during this application session and skips
 * repeated data minings
 * 
 * TODO - make the list persistent across application runs
 * TODO - implement a better data miner registration process instead of hard coding individual miners
 * 
 */

public class DataMiningService implements AnnotationPersistedEventListener {

	private String uuid;
	private PubmedMiner pubMedMiner;
	private RefSeqDataMiner refseqMiner;
	private UniProtDataMiner uniprotMiner;
	private List<String> minedGeneSymbols;

	public DataMiningService() {
		// register as listener
		this.uuid = MessageBus.instance
				.registerAnnotationPersistedEventListener(this);
		this.minedGeneSymbols = new ArrayList<String>();
		// instantiate data miners
		this.pubMedMiner = new PubmedMiner();
		this.refseqMiner = new RefSeqDataMiner();
		this.uniprotMiner = new UniProtDataMiner();

	}

	@Override
	public void processMessage(AnnotationPersistedMessage message) {

		// invoke registered data miners
		GeneEntry geneEntry = message.getGeneEntry();
		String hugoSymbol = geneEntry.getHUGOGeneSymbol();
		if (StringUtils.isEmpty(hugoSymbol)) {
			System.out
					.println("DataMiningService invoked with invalid GeneEntry");
			return;
		}
		if (this.minedGeneSymbols.contains(hugoSymbol)) {
			System.out
					.println("DataMiningService has already mined data for gene "
							+ hugoSymbol);
			return;
		}
		System.out.println("DataMiningService mining data for gene: "
				+ geneEntry.getHUGOGeneSymbol());
		DataMiningExecutor.instance.minePubMedData(geneEntry);
		DataMiningExecutor.instance.mineRefSeqData(geneEntry);
		DataMiningExecutor.instance.mineUniprotData(geneEntry);
		;
		this.minedGeneSymbols.add(hugoSymbol);

	}


	/*
	 * Perform mining operations on dedicated threads to avoid disrupting GUI
	 * performance
	 */

	enum DataMiningExecutor {
		instance;

		private ThreadPoolExecutor tpe = new ThreadPoolExecutor(60, 240, 5000L,
				TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

		void minePubMedData(GeneEntry geneEntry) {
			tpe.execute(minePubMedHandler(PubmedMiner.class, geneEntry));
		}

		void mineRefSeqData(GeneEntry geneEntry) {
			tpe.execute(mineRefSeqHandler(RefSeqDataMiner.class, geneEntry));
		}
		
		void mineUniprotData(GeneEntry geneEntry){
			tpe.execute(mineUniprotHandler(UniProtDataMiner.class, geneEntry));
		}

		private static Runnable mineUniprotHandler(
				final Class<UniProtDataMiner> minerClass,
				final GeneEntry geneEntry) {
			return new Runnable() {
				public void run() {
					UniProtDataMiner miner = null;
					try {
						miner = minerClass.newInstance();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String uniprotAcc = geneEntry
							.getSequenceIdentificationCollection()
							.getUniProtID();
					if (StringUtils.isEmpty(uniprotAcc)) {
						return; // no uniprot xref in gene entry
					}
					miner.mineUniProtEntryByAccessionNumber(uniprotAcc,
							geneEntry.getHUGOGeneSymbol());

				}
			};

		}

		private static Runnable mineRefSeqHandler(
				final Class<RefSeqDataMiner> minerClass,
				final GeneEntry geneEntry) {
			return new Runnable() {
				public void run() {
					RefSeqDataMiner miner = null;
					try {
						miner = minerClass.newInstance();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String refseqId = geneEntry
							.getSequenceIdentificationCollection()
							.getRefSeqID();
					if (StringUtils.isEmpty(refseqId)) {
						return; // no refseq xref in gene entry
					}
					miner.mineRefSeqByRefSeqId(refseqId,
							geneEntry.getHUGOGeneSymbol());

				}
			};
		}

		private static Runnable minePubMedHandler(
				final Class<PubmedMiner> minerClass, final GeneEntry geneEntry) {
			return new Runnable() {
				public void run() {
					PubmedMiner miner = null;
					try {
						miner = minerClass.newInstance();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					List<String> pubmedIdList = new ArrayList<String>();
					for (Sentence sentence : geneEntry.getSentence()) {
						String pubmedId = sentence.getPubMedID();
						if (!pubmedIdList.contains(pubmedId)) {
							miner.minePubmedEntryByPubmedId(pubmedId,
									geneEntry.getHUGOGeneSymbol());
							pubmedIdList.add(pubmedId);
						}
					}

				}
			};
		}
	}

}
