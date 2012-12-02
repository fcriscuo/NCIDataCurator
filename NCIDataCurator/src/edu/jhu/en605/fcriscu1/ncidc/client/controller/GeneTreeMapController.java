package edu.jhu.en605.fcriscu1.ncidc.client.controller;

import javax.swing.JPopupMenu;

import com.macrofocus.helper.ActionHelper;
import com.macrofocus.treemap.action.DrillDownAction;
import com.macrofocus.treemap.action.DrillUpAction;
import com.macrofocus.treemap.action.ZoomInAction;
import com.jidesoft.treemap.controller.DefaultTreeMapController;
import com.jidesoft.treemap.controller.TreeMapController;
import com.jidesoft.treemap.view.TreeMapView;
import com.macrofocus.treemap.action.ZoomOutAction;
import com.macrofocus.treemap.controller.DefaultMTreeMapController;
import com.macrofocus.treemap.controller.MTreeMapController;

import edu.jhu.en605.fcriscu1.ncidc.client.action.AnnotationAction;
import edu.jhu.en605.fcriscu1.ncidc.client.action.GeneTreeMapDrillDownAction;
import edu.jhu.en605.fcriscu1.ncidc.client.action.HgncDrillDownAction;
import edu.jhu.en605.fcriscu1.ncidc.client.action.LocusLinkDrillDownAction;
import edu.jhu.en605.fcriscu1.ncidc.client.action.NCBIGeneTestsDrillDownAction;
import edu.jhu.en605.fcriscu1.ncidc.client.listener.GeneTreeMapMouseListener;

public class GeneTreeMapController implements TreeMapController, MTreeMapController {

	private TreeMapView view;
    private HgncDrillDownAction dda;
    private LocusLinkDrillDownAction dua;
    private NCBIGeneTestsDrillDownAction zia;
    private AnnotationAction zoa;
    private GeneTreeMapMouseListener listener;
	
    
    public GeneTreeMapController() {
    	this.listener = new GeneTreeMapMouseListener(this);    }
    
    public TreeMapView getView() {
    	return this.view;
    }
    
    
	@Override
	public void setView(TreeMapView aView) {
		this.view = aView;
		aView.addMouseListener(listener);
		this.dda = new HgncDrillDownAction(this.view);
		
		this.dua = new LocusLinkDrillDownAction(this.view);
		this.zia = new NCBIGeneTestsDrillDownAction(this.view);
		this.zoa = new AnnotationAction(this.view);
		javax.swing.ActionMap actionmap = this.view.getActionMap();
        javax.swing.InputMap inputmap = this.view.getInputMap(1);
        ActionHelper.registerKeyboardAction(inputmap, actionmap, dda);
        ActionHelper.registerKeyboardAction(inputmap, actionmap, dua);
        ActionHelper.registerKeyboardAction(inputmap, actionmap, zia);
        ActionHelper.registerKeyboardAction(inputmap, actionmap, zoa);
        JPopupMenu jpopupmenu = new JPopupMenu();
        jpopupmenu.add(dda);
        jpopupmenu.add(dua);
        jpopupmenu.add(zia);
        jpopupmenu.add(zoa);
        this.view.setComponentPopupMenu(jpopupmenu);
		
	}

	

}
