package edu.jhu.en605.fcriscu1.ncidc.client;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.apache.axis.utils.StringUtils;

import com.jidesoft.treemap.view.TreeMapView;
import com.macrofocus.treemap.MTreeMap;
import com.macrofocus.treemap.controller.MTreeMapController;

import edu.jhu.en605.fcriscu1.ncidc.client.controller.GeneTreeMapController;
import edu.jhu.en605.fcriscu1.ncidc.dao.DAOFactory;
import edu.jhu.en605.fcriscu1.ncidc.dao.DiseaseIndexDAO;
import edu.jhu.en605.fcriscu1.ncidc.dao.GeneEntryDAO;
import edu.jhu.en605.fcriscu1.ncidc.message.MessageBus;
import edu.jhu.en605.fcriscu1.ncidc.message.TreeMapGeneSelectionMessage;
import edu.jhu.en605.fcriscu1.ncidc.message.listener.TreeMapGeneSelectionEventListener;
import edu.jhu.en605.fcriscu1.ncidc.service.DataMiningService;

import gov.nih.nlm.nci.diseaseindex.generated.GeneAliasCollection;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;
import gov.nih.nlm.nci.diseaseindex.generated.Sentence;
/*
 * Public class that represents the primary Swing client application for accessing
 * the NCI Data Curator services. This application uses a TreeMap class to map
 * the genes in the NCI Cancer Disease Index file. For this POC only a limited number of genes
 * from the file are displayed.
 * 
 */
public class NcidcClientApp extends JFrame implements TreeMapGeneSelectionEventListener{
	
	private List<GeneEntry> geneEntryList;
	private  MTreeMap treeMap;
	String uuid;
	private String lastSelectedGene;
	private JTable geneTextTable;
	private JTable geneAliasTable;
	private GeneEntry geneEntry;
	private String initialGeneSelection;
	private DataMiningService dataMiningService;

	public NcidcClientApp() {
		super();
		this.uuid = MessageBus.instance.registerTreeMapGeneSelectionEventListener(this);
		this.dataMiningService = new DataMiningService();
		this.initialGeneSelection = "BCAR1";
		this.setGeneEntryBySymbol(this.initialGeneSelection);
		this.lastSelectedGene = "123"; // known dummy value
		this.geneTextTable = new JTable();
		this.geneTextTable.getSelectionModel().addListSelectionListener(new RowListener());
		this.geneAliasTable = new JTable();
		SelectedGeneEntry.instance.init();
		DiseaseIndexDAO dao = new DiseaseIndexDAO();
		this.geneEntryList = dao.getGeneEntries();
		System.out.println("Found " + geneEntryList.size() +" genes");
		this.initTreeMap();
		this.prepareDisplay();
	}

	
	private void prepareDisplay() {
		//final JFrame frame = new JFrame();
        this.setSize(800,1000);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("TreeMap", this.constructTreeMapPanel());
        tabs.addTab("Gene Entry Data", this.constructTablePanel());
        tabs.addTab("Gene Aliases", this.constructGeneAliasPanel());
        //frame.add(tabs);
        this.add(new JScrollPane(tabs));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        //Display the window.
        this.pack();
        this.setVisible(true);
       // add(frame);   // the class extends JPanel and is itself a Swing component
	}
	
	
	private JComponent constructTreeMapPanel() {
		JPanel panel = new JPanel(false);
		panel.setPreferredSize(new Dimension(800,1000));
		panel.setLayout(new GridLayout(1,1));
		panel.add(this.treeMap);
		return panel;
	}
	
	private JComponent constructTablePanel() {
		JPanel panel = new JPanel(false);
		panel.setPreferredSize(new Dimension(600,500));
		panel.setLayout(new GridLayout(1,1));
		
		 this.geneTextTable.setModel(this.generateTableModel(this.initialGeneSelection)) ;                        
		
		JScrollPane scrollPane = new JScrollPane(this.geneTextTable);
		
		panel.add(scrollPane);
		return panel;
	}
	
	private JComponent constructGeneAliasPanel() {
		JPanel panel = new JPanel(false);
		panel.setPreferredSize(new Dimension(800,1000));
		panel.setLayout(new GridLayout(1,1));
		
		 this.geneAliasTable.setModel(this.generateAliasTableModel(this.initialGeneSelection)) ;                        
			
			JScrollPane scrollPane = new JScrollPane(this.geneAliasTable);
			
			panel.add(scrollPane);
			return panel;
		
	}
	
	private JComponent constructURLPanel(String url) {
		JPanel panel = new JPanel(false);
		panel.setPreferredSize(new Dimension(800,1000));
		panel.setLayout(new GridLayout(1,1));
		try {
			URL geneURI = new URL("http://www.uniprot.org/uniprot/P38398.xml?include=yes");
			JEditorPane htmlPane = new JEditorPane(geneURI);
			htmlPane.setEditable(false);
			
			panel.add(htmlPane);
		}  catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return panel;
		
	}
	
	
	private void initTreeMap() {
		TableModel tm = this.constructGeneEntryTableModel();
		this.treeMap = new MTreeMap(tm);
		 treeMap.setSizeByName("AnnotationCount");
	        treeMap.setColor(1);
	        treeMap.setBackgroundByName("HUGO");
	        treeMap.setLabels();
	        
	        TreeMapView view = (TreeMapView) treeMap.getView();
	        GeneTreeMapController controller = new GeneTreeMapController();
	        controller.setView(view);
	        treeMap.setController((MTreeMapController) controller);
	        
		
	}
	
	private TableModel constructGeneEntryTableModel() {
		Object[] columnNames = new Object[]{"HUGO","AnnotationCount", "Comment"};
        final Class[] columnTypes = new Class[]{String.class, Integer.class,String.class};
        // Creating a standard Swing TableModel
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, this.geneEntryList.size()) {
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        for ( GeneEntry entry : this.geneEntryList){
        	
        	tableModel.addRow(this.parseGeneEntry(entry));
			
		}
        return tableModel;
	}
	
	private Vector parseGeneEntry(GeneEntry entry){
		Vector rowVector= new Vector();
		rowVector.add(entry.getHUGOGeneSymbol());
		rowVector.add(new Integer(entry.getSentence().size())); // int number of annotations
		rowVector.add("For options - right click:" ); // string
		return rowVector;
	}
	
	public void processMessage(TreeMapGeneSelectionMessage message) {
		if (this.lastSelectedGene.equals(message.getHugoSymbol())){
			return;
		}
		System.out.println("Selected gene = " +message.getHugoSymbol());
		this.lastSelectedGene = message.getHugoSymbol();
		this.setGeneEntryBySymbol(message.getHugoSymbol());
		this.geneTextTable.setModel(this.generateTableModel(message.getHugoSymbol()));
		this.geneAliasTable.setModel(this.generateAliasTableModel(message.getHugoSymbol()));
	}
	
	private TableModel generateAliasTableModel(String hugoSymbol){
		if (null == this.geneEntry){
			return null;
		}
		GeneAliasCollection gac = this.geneEntry.getGeneAliasCollection();
		if (null == gac ){
			Object[][]data = new Object[] [] {
					{hugoSymbol,"The selected gene does not have any aliases"}
			};
			Object[] columnNames = new Object[]{"HUGO Symbol","Statement"};
			final Class[] columnTypes = new Class[]{String.class, String.class};
			// Creating a standard Swing TableModel
	        TableModel tableModel = new DefaultTableModel(data, columnNames) {
	            public Class<?> getColumnClass(int columnIndex) {
	                return columnTypes[columnIndex];
	            }
	        };
	        return tableModel;
		}
		 
		
		Object[] columnNames = new Object[]{"Gene Alias"};
		final Class[] columnTypes = new Class[]{String.class};
		DefaultTableModel tableModel = new DefaultTableModel(columnNames,1 )
		 {
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        int rowIndex = 0;
        for ( String alias : gac.getGeneAlias()){
        	
        		Object[]  rowData = {alias};
        		tableModel.insertRow(rowIndex, rowData);
        		rowIndex++;
        	
        }
        return tableModel;
	}
	
	
	private TableModel generateTableModel(String hugoSymbol){
		if (null == this.geneEntry){
			return null;
		}
		List<Sentence> sentenceList = this.geneEntry.getSentence();
		if (null == sentenceList || sentenceList.isEmpty()){
			Object[][]data = new Object[] [] {
					{hugoSymbol,"The selected gene was not found in the database"}
			};
			Object[] columnNames = new Object[]{"HUGO Symbol","Statement"};
			final Class[] columnTypes = new Class[]{String.class, String.class};
			// Creating a standard Swing TableModel
	        TableModel tableModel = new DefaultTableModel(data, columnNames) {
	            public Class<?> getColumnClass(int columnIndex) {
	                return columnTypes[columnIndex];
	            }
	        };
	        return tableModel;
		}
		 
		
		Object[] columnNames = new Object[]{"NCI Gene Term", "Disease Data" ,"Statement","PubMed ID"};
		final Class[] columnTypes = new Class[]{String.class, String.class, String.class, String.class};
		DefaultTableModel tableModel = new DefaultTableModel(columnNames,1 )
		 {
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        int rowIndex = 0;
        for ( Sentence sentence : sentenceList){
        	String geneData = sentence.getGeneData().getMatchedGeneTerm();
        	String diseaseData = sentence.getDiseaseData().getNCIDiseaseConceptCode() +": "
        		+sentence.getDiseaseData().getMatchedDiseaseTerm();
        	String statement = sentence.getStatement();
        	String pubMed = sentence.getPubMedID();
        	
        		Object[]  rowData = {geneData, diseaseData, statement, pubMed};
        		tableModel.insertRow(rowIndex, rowData);
        		rowIndex++;
        	
        }
        return tableModel;
	}
	private void setGeneEntryBySymbol(String hugoSymbol){
		GeneEntryDAO dao = DAOFactory.instance.getGeneEntryDAO();
		GeneEntry ge = dao.getGeneEntryByHugoSymbol(hugoSymbol);
		if ( null == ge ){
			System.out.println("No gene enty for " +hugoSymbol +" found in database");
			this.geneEntry = null;
		}
		System.out.println("The Gene Entry has been set to " +ge);
		this.geneEntry = ge;
	}
	
	
	
	public static void main(String[] args) {
		 //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
	        UIManager.put("swing.boldMetal", Boolean.FALSE);
	        createAndShowGUI();
            }
        });
    }


	 private static void createAndShowGUI() {
	        
		 NcidcClientApp app = new NcidcClientApp();

	        
	    }
	 
	 private void outputSelection() {
	        System.out.println("Lead:  "
	        		+this.geneTextTable.getSelectionModel().getLeadSelectionIndex() +" "
	        		+this.geneTextTable.getColumnModel().getSelectionModel().
	                        getLeadSelectionIndex());
	                        System.out.println("Rows:");
	        for (int r : this.geneTextTable.getSelectedRows()) {
	        	System.out.println( r);
	        	for (int c= 0 ; c < this.geneTextTable.getColumnCount(); c++) {
		        	System.out.println("Column: " + c +" "+this.geneTextTable.getValueAt(r, c));
		        }
	        }
	     
	        
	     
	    }


	 private class RowListener implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent event) {
			outputSelection();
			
		}
		 
	 }
    


}
