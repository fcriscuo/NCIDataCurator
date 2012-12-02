package edu.jhu.en605.fcriscu1.ncidc.util;

import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory.ContainerType;

/*
 * Public interface to hold common values used throughout the application
 * 
 */
public interface CommonNames {
	public static String Application_Location = "C:\\softwaredev\\NCIDataCurator";
	public static String DBXML_Repository_Location = Application_Location +
		"\\DBXML_repository";
	public static String DBXML_Environment_Location = 
		DBXML_Repository_Location +"\\env";
	// NCI Container
	public static String DBXML_Container_Location = 
		DBXML_Repository_Location +"\\nci_container";
	public static String NCI_Data_Container_Filename = 
		DBXML_Container_Location +"\\NCIdata.bdbxml"; 
	// ApplicationAnnotations Container
	public static String Annotations_Container_Location = 
		DBXML_Repository_Location +"\\annotations_container";
	public static String Annotations_Container_Filename = 
		Annotations_Container_Location +"\\Annotations.bdbxml"; 
	public static String Application_Annotations_XML_DOCNAME = "ApplicationAnnotations.xml";
	// Sequence Container
	public static String Sequence_Container_Location = 
		DBXML_Repository_Location +"\\sequence_container";
	public static String Sequence_Container_Filename = 
		Sequence_Container_Location +"\\Sequence.bdbxml"; 
	// Reference Container
	public static String Reference_Container_Location = 
		DBXML_Repository_Location +"\\reference_container";
	public static String Reference_Container_Filename = 
		Reference_Container_Location +"\\Reference.bdbxml"; 
	// Test Container
	public static String DBXML_Test_Container_Location = 
		DBXML_Repository_Location +"\\test_container";
	public static String Test_Container_Filename = 
		DBXML_Test_Container_Location +"\\TestContainer.bdbxml"; 
	public static String Test_Container_Input_Filename = 
		Application_Location +"\\xml\\test_disease.xml";
	public static ContainerType NCI_CONTAINER_TYPE = ContainerType.NCI_DATA;
	public static String NCI_DISEASE_INDEX_INPUT_FILENAME = Application_Location 
		+"\\NCI_data\\NCI_CancerIndex_allphases_disease.xml";
	public static String SHORT_DISEASE_INDEX_INPUT_FILENAME = Application_Location 
	+"\\NCI_data\\disease_short.xml";
	public static String SHORT_DISEASE_INDEX_XML_DOCNAME = "ShortDiseaseIndex.xml";
	
	public static String TOGOWS_GENE_REST_BASE_URL = "http://togows.dbcls.jp/entry/gene/LLACC";
	
	public static String HGNC_BASE_URL = "http://www.genenames.org/data/hgnc_data.php?hgnc_id=HGNCID";
	
	public static String WIKI_GENES_BASE_URL = "http://www.wikigenes.org/e/gene/e/LLACC.html";
	
	public static String NCBI_GENE_TESTS_BASE_URL = "http://www.ncbi.nlm.nih.gov/sites/GeneTests/lab/gene/HUGO";

	public static String FASTA_XML_OPEN_ELEMENT = "<FASTA>";
	public static String FASTA_XML_CLOSE_ELEMENT = "</FASTA>";
	
	
}
