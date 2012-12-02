package edu.jhu.en605.fcriscu1.ncidc.dao.dbxml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.axis.utils.StringUtils;
import org.w3c.dom.Node;

import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import edu.jhu.en605.fcriscu1.ncidc.dao.NCIGeneDAO;
import gov.nih.nci.cabio.domain.Gene;

/*
 * 
 * Concrete implementation of NCIGeneDAO interface that supports database
 * access to Gene documents in the NCI Container. This class extends NCIDbxmlDAO
 * which is responsible for interacting with the XmlContainer and XmlManager
 */

public class NCIGeneDbxmlDAO extends NCIDbxmlDAO implements NCIGeneDAO {

	public NCIGeneDbxmlDAO() {
		super();
	}

	/*
	 * public method that will load retrieve a Gene object from the NCI repository
	 * by its HUGO symbol and load it into the XML database. It will be assigned a
	 * document name based on its HUGO symbol. If the document already exists in the database,
	 * it will be replaced.
	 * 
	 * (non-Javadoc)
	 * @see edu.jhu.en605.fcriscu1.ncidc.dao.NCIGeneDAO#mineGeneFromNCI(java.lang.String)
	 */
	@Override
	public void mineGeneFromNCI(String hugoSymbol)  {
		
		if (StringUtils.isEmpty(hugoSymbol)){
			System.out.println("MineGeneFromNCI invoked with null or invalid parameter");
			return;
		}
		XmlDocument xmlDocument;
		try {
			xmlDocument = this.retreiveGeneXMLFromNCI(hugoSymbol);
		} catch (XmlException e) {
			System.out.println ("Gene symbol " + hugoSymbol +" not found at NCI");
			return ;
		}
		String documentName = "Gene_" +hugoSymbol +".xml";
		this.persistGeneDocument(xmlDocument);
		
	}
	
	private XmlDocument retreiveGeneXMLFromNCI(String hugoSymbol) throws XmlException {
		System.out.println("Retrieving Gene for symbol " +hugoSymbol);
		Client client = Client.create();
		WebResource webResource = client.resource("http://cabioapi.nci.nih.gov/cabio43/GetXML?query=Gene[@hugoSymbol=" 
				+hugoSymbol +"]");
		if (null == webResource){
			return null;
		}
		String documentName = "Gene_" +hugoSymbol +".xml";
		XmlDocument xmlDocument = this.getManager().createDocument();
		xmlDocument.setName(documentName);
		xmlDocument.setContent(webResource.get(String.class));
		return xmlDocument;
	}
	
	private void persistGeneDocument (XmlDocument xmlDocument){
		String documentName = null;
		try {
			documentName = xmlDocument.getName();
			this.getContainer().getDocument(documentName);
			this.getContainer().deleteDocument(documentName);
			System.out.println("Deleted document " +documentName +" from database, prior to reloading"); 
		} catch (XmlException e1) {
			//ignore exception, document is not in database
		}
		try {
			this.getContainer().putDocument(xmlDocument);
			System.out.println("Docuement " +documentName +" loaded into database.");
		} catch (XmlException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
		}

	}

	@Override
	public Gene getGeneByHugoSymbol(String hugoSymbol) {
		if (StringUtils.isEmpty(hugoSymbol)){
			System.out.println("getGeneByHugoSymbol invoked with null or invalid parameter");
			return null;
		}
		XmlDocument geneDocument = null;
		String documentName = "Gene_" +hugoSymbol +".xml";
		// look for the Gene in the database; if it isn't there get it from NCI
		try {
			geneDocument = this.getContainer().getDocument(documentName);
		} catch (XmlException e) {
			try {
				geneDocument  = this.retreiveGeneXMLFromNCI(hugoSymbol);
				this.persistGeneDocument(geneDocument);
			} catch (XmlException e1) {
				System.out.println ("Gene symbol " + hugoSymbol +" not found at NCI");
				return null;
			}
		}
		// at this point we have a Gene XML document
		return this.unMarshallGeneXmlDocument(geneDocument);
	}

	 private Gene unMarshallGeneXmlDocument(XmlDocument geneDocument){
		 JAXBContext jc;
		try {
			jc = JAXBContext.newInstance( "gov.nih.nlm.cabio.jaxb.generated.domain" );
			 Unmarshaller u = jc.createUnmarshaller();
			 
			 return (Gene) u.unmarshal( geneDocument.getContentAsInputStream());
		} catch (JAXBException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
			e.printStackTrace();
		} catch (XmlException e) {
			System.out.println(e.getErrorCode() +" " +e.getMessage());
			e.printStackTrace();
		}
	      return null;

	 }
}
