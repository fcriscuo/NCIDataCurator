package edu.jhu.en605.fcriscu1.ncidc.client.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.jidesoft.treemap.view.TreeMapView;
import com.macrofocus.resources.ResourcesModel;

import edu.jhu.en605.fcriscu1.ncidc.client.AnnotationEntryForm;

public class AnnotationAction extends AbstractAction {
	

	private TreeMapView view;
	private static final String label = "Create Annotation";

	public AnnotationAction(TreeMapView treemapview) {
		this(treemapview, null);
	}

	public AnnotationAction(TreeMapView treemapview,
			ResourcesModel resourcesmodel) {
		super(label);
		this.view = treemapview;
	}

	public AnnotationAction(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Schedule a job for the event dispatching thread:
		// creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});

	}
	
	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Annotation Entry Form");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Add content to the window.
		frame.add(new AnnotationEntryForm());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

}
