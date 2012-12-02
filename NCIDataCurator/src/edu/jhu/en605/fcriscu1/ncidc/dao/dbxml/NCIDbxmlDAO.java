package edu.jhu.en605.fcriscu1.ncidc.dao.dbxml;

import java.util.List;

import com.sleepycat.dbxml.XmlContainer;
import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlDocumentConfig;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlManager;

import edu.jhu.en605.fcriscu1.ncidc.util.CommonNames;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlManagerFactory;
import edu.jhu.en605.fcriscu1.ncidc.util.XmlContainerFactory.ContainerType;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;

public abstract class NCIDbxmlDAO {
	
	
	private XmlManager manager;
	private XmlContainer conatiner;
	private XmlDocument document;
	private String containerAlias;
	
	private static final ContainerType containerType = ContainerType.NCI_DATA;

	protected NCIDbxmlDAO() {
		this.manager = XmlManagerFactory.instance.getXmlManager();
		this.conatiner = XmlContainerFactory.instance.GetXmlContainerByType(containerType);
		this.containerAlias = XmlContainerFactory.instance.getAliasByContainerType(containerType);
		this.openNCIDocument();
	}
	
	public void closeDB() {	
		
			try {
				this.conatiner.close();
			} catch (XmlException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			System.out
			.println("Requesting XmlManager be closed by factory class...");
				XmlManagerFactory.instance.closeManager();
		
	}
	
	private void openNCIDocument(){
		XmlDocumentConfig docConfig = new XmlDocumentConfig();
		docConfig.setLazyDocs(false);	
		try {
			this.document = this.conatiner.getDocument(CommonNames.SHORT_DISEASE_INDEX_XML_DOCNAME);
		} catch (XmlException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
			e.printStackTrace();
		}
	}
	
	protected XmlDocument getDocument() {
		return this.document;
	}
	
	protected String getContainerAlais() {
		return this.containerAlias;
	}
	
	protected XmlContainer getContainer(){
		return this.conatiner;
	}
	
	protected XmlManager getManager(){
		return this.manager;
	}

	

}
