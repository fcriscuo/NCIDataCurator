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

public class LocusLinkDrillDownAction extends AbstractAction {

	private TreeMapView view;
	private static final String label = "Display NCBI Gene";

	public LocusLinkDrillDownAction(TreeMapView treemapview) {
		this(treemapview, null);
	}

	private LocusLinkDrillDownAction(TreeMapView treemapview,
			ResourcesModel resourcesmodel) {
		super(label);
		this.view = treemapview;

	}

	public LocusLinkDrillDownAction(String name) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	public LocusLinkDrillDownAction(String name, Icon icon) {
		super(label, icon);
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent actionevent) {
		// use the current selected GeneEntry to access NCBI Gene via TogoWS
		GeneEntry geneEntry = SelectedGeneEntry.instance.getGeneEntry();
		// drill down to locus link
		String locusLinkId = geneEntry.getSequenceIdentificationCollection().getLocusLinkID();
		if (null != locusLinkId) {
			// replace the placeholder in the common URL with the selected id
			String url = StringUtils.replace(CommonNames.TOGOWS_GENE_REST_BASE_URL, "LLACC", locusLinkId);
			
			CommonUtils.displayURIInBrowser(url);
		}
	}

}
