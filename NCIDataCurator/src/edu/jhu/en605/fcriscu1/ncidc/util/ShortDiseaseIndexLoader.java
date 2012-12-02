package edu.jhu.en605.fcriscu1.ncidc.util;

import com.sleepycat.dbxml.XmlException;

public class ShortDiseaseIndexLoader {

	public ShortDiseaseIndexLoader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputName = null;
		if (args.length > 0 ) {
			inputName = args[0];
			System.out.println("Using supplied file: " +inputName +" for input");
		} else {
			inputName = CommonNames.SHORT_DISEASE_INDEX_INPUT_FILENAME;
			System.out.println("Using default file: " +inputName +" for input");
		}
		
		XMLFileLoader loader = XMLFileLoader.createInstance(CommonNames.NCI_CONTAINER_TYPE, 
				inputName, 
				CommonNames.SHORT_DISEASE_INDEX_XML_DOCNAME);
		try {
			if (loader.isValid() && loader.isDocumentExists()){
				loader.replaceExistingDocumentInConatiner();
			} else if(loader.isValid()){
				loader.loadXmlFileIntoContainer();
			} else {
				System.out.println("XMLLoader is invalid.");
			}
		} catch (XmlException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
			e.printStackTrace();
		}

	}

}
