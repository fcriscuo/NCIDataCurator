package edu.jhu.en605.fcriscu1.ncidc.client.action;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import org.apache.commons.lang.StringUtils;

import com.jidesoft.treemap.model.TreeMapModel;
import com.jidesoft.treemap.view.TreeMapView;
import com.macrofocus.interval.bounded.BoundedInterval;
import com.macrofocus.resources.ResourcesModel;

import edu.jhu.en605.fcriscu1.ncidc.client.SelectedGeneEntry;
import edu.jhu.en605.fcriscu1.ncidc.util.CommonNames;
import edu.jhu.en605.fcriscu1.ncidc.util.CommonUtils;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;

public class HgncDrillDownAction extends AbstractAction {

	private TreeMapView view;
	private static final String label = "Display HGNC";

	public HgncDrillDownAction(TreeMapView treemapview) {
		this(treemapview, null);
	}

	private HgncDrillDownAction(TreeMapView treemapview,
			ResourcesModel resourcesmodel) {
		super(label);
		this.view = treemapview;

	}

	public HgncDrillDownAction(String name) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public HgncDrillDownAction(String name, Icon icon) {
		super(label, icon);
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent actionevent) {
		// use the current selected GeneEntry to access the HGNC Web server
		GeneEntry geneEntry = SelectedGeneEntry.instance.getGeneEntry();
		// drill down to locus link
		String hgncId = geneEntry.getSequenceIdentificationCollection().getHgncID();
		if (null != hgncId) {
			// replace the placeholder in the common URL with the selected id
			String url = StringUtils.replace(CommonNames.HGNC_BASE_URL, "HGNCID", hgncId);
			
			CommonUtils.displayURIInBrowser(url);
		}
	}

}
