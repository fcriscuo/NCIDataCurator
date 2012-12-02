package edu.jhu.en605.fcriscu1.ncidc.client;

import org.apache.axis.utils.StringUtils;

import edu.jhu.en605.fcriscu1.ncidc.dao.DAOFactory;
import edu.jhu.en605.fcriscu1.ncidc.dao.GeneEntryDAO;
import edu.jhu.en605.fcriscu1.ncidc.message.MessageBus;
import edu.jhu.en605.fcriscu1.ncidc.message.TreeMapGeneSelectionMessage;
import edu.jhu.en605.fcriscu1.ncidc.message.listener.TreeMapGeneSelectionEventListener;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;

/*
 * 
 *  Java Singleton to represent the GeneEntry currently selected in the Swing client.
 *  Provides common access to the  object to multiple action handlers
 */
public enum SelectedGeneEntry  {
	instance;
	private GeneEntryListener listener;
	
	
	
	 void init() {
		listener = new GeneEntryListener();
	}
	
	
	
	public GeneEntry getGeneEntry() {
		return this.listener.getGeneEntry();
	}
	

	static class GeneEntryListener implements TreeMapGeneSelectionEventListener{
		private String uuid;
		private GeneEntry geneEntry;
		public GeneEntryListener () {
			this.uuid = MessageBus.instance.registerTreeMapGeneSelectionEventListener(this);
			System.out.println("Listener UUID = " +uuid);
			
		}
		
		public GeneEntry getGeneEntry() {
			return this.geneEntry;
		}
	
			public void processMessage(TreeMapGeneSelectionMessage message) {
				System.out.println("GeneEntry Listener invoked");
				String hugoSymbol = message.getHugoSymbol();
				if (StringUtils.isEmpty(hugoSymbol)){
					System.out.println("SelectedGeneEntry: invalid HUGO symbol");
					this.geneEntry = null;  
				}
				GeneEntryDAO dao = DAOFactory.instance.getGeneEntryDAO();
				this.geneEntry = dao.getGeneEntryByHugoSymbol(hugoSymbol);
				System.out.println("SelectedGeneEntry set to" +hugoSymbol);
			}
	}

}
