package edu.jhu.en605.fcriscu1.ncidc.client.action;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import com.jidesoft.treemap.model.TreeMapModel;
import com.jidesoft.treemap.view.TreeMapView;
import com.macrofocus.interval.bounded.BoundedInterval;
import com.macrofocus.resources.ResourcesModel;

import edu.jhu.en605.fcriscu1.ncidc.client.SelectedGeneEntry;

public class GeneTreeMapDrillDownAction extends AbstractAction {

	private TreeMapView view;
	private static final String label = "RefSeq Enrty";

	public GeneTreeMapDrillDownAction(TreeMapView treemapview) {
		this(treemapview, null);
	}

	private GeneTreeMapDrillDownAction(TreeMapView treemapview,
			ResourcesModel resourcesmodel) {
		super(label);
		this.view = treemapview;

	}

	public GeneTreeMapDrillDownAction(String name) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public GeneTreeMapDrillDownAction(String name, Icon icon) {
		super(label, icon);
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent actionevent) {
		TreeMapModel treemapmodel = view.getModel();
		Object obj = treemapmodel.getCurrentRoot();
		treemapmodel.getProbing().clearSelection();
		Point point = view.getMousePosition();
		if (point != null) {
			ArrayList arraylist = new ArrayList();
			Iterator iterator = treemapmodel.breadthFirstIterator(obj)
					.iterator();
			while (iterator.hasNext()) {
				Object obj1 = (Object) iterator.next();

				if (!view.getRenderedShape(obj1).contains(point.x, point.y))
					continue;

				if (treemapmodel.isLeaf(obj1)) {
					System.out.println("Selected object found obj1 "
							+ obj1.toString());
					System.out.println("Current select gene is " 
							+SelectedGeneEntry.instance.getGeneEntry().getHUGOGeneSymbol());
				
			}
		}
	}

}
}