package edu.jhu.en605.fcriscu1.ncidc.message;

public class TreeMapGeneSelectionMessage {
	
	
	private String hugoSymbol;
	
	public TreeMapGeneSelectionMessage(String aSymbol){
		this.setHugoSymbol(aSymbol);
	}

	private void setHugoSymbol(String hugoSymbol) {
		this.hugoSymbol = hugoSymbol;
	}

	public String getHugoSymbol() {
		return hugoSymbol;
	}

}
