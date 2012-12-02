package edu.jhu.en605.fcriscu1.ncidc.util;

import com.sleepycat.dbxml.XmlContainer;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlManager;

/*
 * A Java Singleton implemented as an enum that is responsible
 * for defined XmlContainer objects
 * 
 */

public enum XmlContainerFactory {

	instance;

	public enum ContainerType {
		NCI_DATA, ANNOTATIONS, TEST,SEQUENCE ,REFERENCE
	};

	public XmlContainer GetXmlContainerByType(ContainerType aType) {
		if (null == aType) {
			System.out
					.println("Error: GetXmlContainerByType invoked with null parameter");
			return null;
		}
		XmlContainer container = null;
		XmlManager manager = XmlManagerFactory.instance.getXmlManager();
		try {
			switch (aType) {
			case NCI_DATA:

				if (manager
						.existsContainer(CommonNames.NCI_Data_Container_Filename) > 0) {
					container = manager
							.openContainer(CommonNames.NCI_Data_Container_Filename);
					System.out.println("XmlContainerFactory found existing container for NCI DATA");
				} else {
					container = manager.createContainer(CommonNames.NCI_Data_Container_Filename);
					System.out.println("XmlContainerFactory created new container for NCI DATA");
				}
				// set container alias
				
				break;
			case ANNOTATIONS:

				if (manager
						.existsContainer(CommonNames.Annotations_Container_Filename) > 0) {
					container = manager
							.openContainer(CommonNames.Annotations_Container_Filename);
					System.out.println("XmlContainerFactory found existing container for ANNOTATIONS");
				} else {
					container = manager.createContainer(CommonNames.Annotations_Container_Filename);
					System.out.println("XmlContainerFactory created new container for ANNOTATIONS");
				}
				// set container alias
				
				break;
			case SEQUENCE:
				if (manager
						.existsContainer(CommonNames.Sequence_Container_Filename) > 0) {
					container = manager
							.openContainer(CommonNames.Sequence_Container_Filename);
					System.out.println("XmlContainerFactory found existing container for SEQUENCE");
				} else {
					container = manager.createContainer(CommonNames.Sequence_Container_Filename);
					System.out.println("XmlContainerFactory created new container for SEQUENCE");
				}
				// set container alias
				
				break;
			case REFERENCE:

				if (manager
						.existsContainer(CommonNames.Reference_Container_Filename) > 0) {
					container = manager
							.openContainer(CommonNames.Reference_Container_Filename);
					System.out.println("XmlContainerFactory found existing container for REFERENCE");
				} else {
					container = manager.createContainer(CommonNames.Reference_Container_Filename);
					System.out.println("XmlContainerFactory created new container for REFERENCE");
				}
				// set container alias
				
				break;
			case TEST:
			default:
				if (manager
						.existsContainer(CommonNames.Test_Container_Filename) > 0) {
					container = manager
							.openContainer(CommonNames.Test_Container_Filename);
					System.out.println("XmlContainerFactory found existing container for TEST");
				} else {
					container = manager.createContainer(CommonNames.Test_Container_Filename);
					System.out.println("XmlContainerFactory created new container for TEST");
				}
				// set container alias
				
				break;
			}
			// set the container's alias for queries
			container.addAlias(this.getAliasByContainerType(aType));
		} catch (XmlException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
			e.printStackTrace();
		}
		
		return container;

	}
  
	public String getAliasByContainerType(ContainerType aType){
		if (null == aType) {
			return "TEST";
		}
		switch (aType) {
		case NCI_DATA:
			return "NCI_DATA";
		case ANNOTATIONS:
			return "ANNOTATIONS";
		case SEQUENCE:
			return "SEQUENCE";
		case REFERENCE:
			return "REFERENCE";
		case TEST:
		default:
			return "TEST";
		}
		
	}
	
	
}
