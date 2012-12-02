package edu.jhu.en605.fcriscu1.ncidc.dao.dbxml;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlDocumentConfig;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlQueryContext;
import com.sleepycat.dbxml.XmlResults;
import com.sleepycat.dbxml.XmlValue;

import edu.jhu.en605.fcriscu1.ncidc.dao.GeneEntryDAO;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntry;
import gov.nih.nlm.nci.diseaseindex.generated.GeneEntryCollection;

/*
 * Concrete implementation of GeneEntryDAO that retrieves GeneEntry objects
 * from a Berkeley XML database. The retrieved objects are mapped to the JAXB 
 * GeneEntry class that mirrors the NCI schema for consistency across all
 * DAO implementations
 */

public class GeneEntryDBXML extends NCIDbxmlDAO implements GeneEntryDAO {
	private static final String geneEntryJAXBPackageName = "gov.nih.nlm.nci.diseaseindex.generated";

	public GeneEntryDBXML() {
		super();
	}

	public GeneEntry getGeneEntryByHugoSymbol(String hugoSymbol) {
		XmlResults results = null;
		
		try {

			XmlQueryContext context = this.getManager().createQueryContext();

			String baseDocQuery = "doc(\"ALIASNAME/"+
			this.getDocument().getName()
			+"\")/GeneEntryCollection/GeneEntry[HUGOGeneSymbol=\""
					+ hugoSymbol + "\"]";
			
			String docQuery = StringUtils.replaceOnce(baseDocQuery,
					"ALIASNAME", this.getContainerAlais());

			 results = this.getManager().query(docQuery, context);
			// there should only be one entry for a given HUGO symbol
			if (results.hasNext()) {
				
				XmlValue value = results.next();
				return this.unMarshallGeneEntryXML(value);
				
			}

		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			results.delete();
			
		}
		return null;

	}
	
	@Override
	public List<GeneEntry> getAllGeneEntries() {
		XmlResults results = null;
		try {

			XmlQueryContext context = this.getManager().createQueryContext();

			String baseDocQuery = "doc(\"ALIASNAME/"+
			this.getDocument().getName()
			+"\")/GeneEntryCollection";
			
			String docQuery = StringUtils.replaceOnce(baseDocQuery,
					"ALIASNAME", this.getContainerAlais());

			results = this.getManager().query(docQuery, context);
			// there should only be one result
			if (results.hasNext()) {
				
				XmlValue value = results.next();
				return this.unMarshallGeneEntryCollectionXML(value);
			}

		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			results.delete();
		}
		return null;

	}

	public List<GeneEntry> getAllGeneEntries(XmlValue xml) {
		try {
			JAXBContext jc = JAXBContext.newInstance(geneEntryJAXBPackageName);
			Unmarshaller u = jc.createUnmarshaller();
			StringBuffer sb = new StringBuffer("<?xml version=\"1.0\"?>");
			sb.append(xml.asString());
			
			GeneEntryCollection gec = (GeneEntryCollection) u.unmarshal(  new StreamSource( new StringReader( sb.toString() ) ) );
			
		} catch (JAXBException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	
	


	private List<GeneEntry> unMarshallGeneEntryCollectionXML(XmlValue xml) {
		try {
			JAXBContext jc = JAXBContext.newInstance(geneEntryJAXBPackageName);
			Unmarshaller u = jc.createUnmarshaller();
			StringBuffer sb = new StringBuffer("<?xml version=\"1.0\"?>");
			sb.append(xml.asString());
			
			GeneEntryCollection gec = (GeneEntryCollection) u.unmarshal(  new StreamSource( new StringReader( sb.toString() ) ) );
			
			return gec.getGeneEntry();
		} catch (JAXBException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;

	}
	
	private GeneEntry unMarshallGeneEntryXML(XmlValue xml) {
		try {
			JAXBContext jc = JAXBContext.newInstance(geneEntryJAXBPackageName);
			Unmarshaller u = jc.createUnmarshaller();
			StringBuffer sb = new StringBuffer("<?xml version=\"1.0\"?>");
			sb.append(xml.asString());
			
			GeneEntry ge = (GeneEntry) u.unmarshal(  new StreamSource( new StringReader( sb.toString() ) ) );
			System.out.println(ge.getHUGOGeneSymbol());
			return ge;
		} catch (JAXBException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;

	}

	
}
