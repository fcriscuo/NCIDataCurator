package edu.jhu.en605.fcriscu1.ncidc.client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import edu.jhu.en605.fcriscu1.ncidc.service.ApplicationAnnotationService;

/*
 * 
 * Java Swing class to provide a data entry form for defining a new ApplicationAnnotation
 * Some fields are hard coded to reduce testing efforts but they can be changed
 * 
 * Disclosure: code based on TextSampleDemo.java
 * http://download.oracle.com/javase/tutorial/uiswing/examples/components/TextSamplerDemoProject/src/components/TextSamplerDemo.java
 */

public class AnnotationEntryForm extends JPanel implements ActionListener {

	private String userId;
	private String userName;
	private String email;
	private boolean active;
	protected JLabel actionLabel;
	private JButton saveButton;
	private JTextArea annotationText;
	private DocumentListener textListener;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField emailTextField;
	
	private JFrame formFrame;

	public AnnotationEntryForm() {
		this.setLayout(new BorderLayout());
		this.userId = "A123";
		this.userName = "Fred";
		this.email = "fcriscu1@jhu.edu";
		this.textListener = new TextFieldListener();
		this.formFrame = new JFrame();

		// ID
		this.idTextField = new JTextField(this.userId, 10);

		idTextField.setActionCommand(userId);
		idTextField.addActionListener(this);
		JLabel idFieldLabel = new JLabel("User ID: ");
		idFieldLabel.setLabelFor(idTextField);
		// Name
		this.nameTextField = new JTextField(this.userName, 30);
		nameTextField.setActionCommand(userName);
		nameTextField.addActionListener(this);
		JLabel nameFieldLabel = new JLabel("User Name: ");
		nameFieldLabel.setLabelFor(nameTextField);
		// email
		this.emailTextField = new JTextField(this.email, 40);
		emailTextField.setActionCommand(email);
		emailTextField.addActionListener(this);
		JLabel emailFieldLabel = new JLabel("User email: ");
		emailFieldLabel.setLabelFor(emailTextField);

		// Create a label to put messages during an action event.
		actionLabel = new JLabel("Complete form and press Save.");
		actionLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

		this.saveButton = new JButton("Save Annotation");
		this.saveButton.setEnabled(false);
		saveButton.addActionListener(this);

		// Create a text area.
		this.annotationText = new JTextArea();
		this.annotationText.getDocument()
				.addDocumentListener(this.textListener);
		annotationText.setLineWrap(true);
		annotationText.setWrapStyleWord(true);
		JScrollPane areaScrollPane = new JScrollPane(annotationText);
		areaScrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane.setPreferredSize(new Dimension(750, 200));
		areaScrollPane.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createCompoundBorder(
						BorderFactory.createTitledBorder("Annotation Text"),
						BorderFactory.createEmptyBorder(5, 5, 5, 5)),
				areaScrollPane.getBorder()));

		// Lay out the text controls and the labels.
		JPanel textControlsPane = new JPanel();
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		textControlsPane.setLayout(gridbag);

		JLabel[] labels = { idFieldLabel, nameFieldLabel, emailFieldLabel };
		JTextField[] textFields = { idTextField, nameTextField, emailTextField, };
		addLabelTextRows(labels, textFields, gridbag, textControlsPane);

		c.gridwidth = GridBagConstraints.NORTHWEST; // last
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 1.0;
		textControlsPane.add(actionLabel, c);
		textControlsPane.add(saveButton);
		textControlsPane.add(areaScrollPane);
		textControlsPane.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createTitledBorder("NCIDC Anotation"),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		add(textControlsPane);

	}

	void checkForContent() {
		if (this.idTextField.getText().isEmpty()
				|| this.nameTextField.getText().isEmpty()
				|| this.emailTextField.getText().isEmpty()) {
			this.saveButton.setEnabled(false);
			return;
		}
		if (this.annotationText.getText().isEmpty()) {
			this.saveButton.setEnabled(false);
		} else {
			this.saveButton.setEnabled(true);
		}
	}

	private void addLabelTextRows(JLabel[] labels, JTextField[] textFields,
			GridBagLayout gridbag, Container container) {
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.EAST;
		int numLabels = labels.length;

		for (int i = 0; i < numLabels; i++) {
			c.gridwidth = GridBagConstraints.RELATIVE; // next-to-last
			c.fill = GridBagConstraints.NONE; // reset to default
			c.weightx = 0.0; // reset to default
			container.add(labels[i], c);

			c.gridwidth = GridBagConstraints.REMAINDER; // end row
			c.fill = GridBagConstraints.HORIZONTAL;
			c.weightx = 1.0;
			container.add(textFields[i], c);
		}
	}

	public AnnotationEntryForm(LayoutManager arg0) {
		super(arg0);

	}

	public AnnotationEntryForm(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public AnnotationEntryForm(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == saveButton) {
			ApplicationAnnotationService.instance.persistApplicationAnnotation(
					this.idTextField.getText(),
					this.nameTextField.getText(),
					this.emailTextField.getText(),
					this.annotationText.getText());
				
			this.annotationText.setText(null);
		}
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		
		// Create and set up the window.
		JFrame frame = new JFrame("Annotation Entry Form");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	/*
	 * add main method to support stand alone testing of component
	 */
	public static void main(String[] args) {
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

	private class TextFieldListener implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			checkForContent();

		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			checkForContent();

		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			checkForContent();

		}

	}

}
