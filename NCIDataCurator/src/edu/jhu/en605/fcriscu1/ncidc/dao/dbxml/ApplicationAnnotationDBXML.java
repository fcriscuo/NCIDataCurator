package edu.jhu.en605.fcriscu1.ncidc.dao.dbxml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

import com.sleepycat.dbxml.XmlDocument;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlInputStream;

import edu.jhu.en605.fcriscu1.ncidc.dao.ApplicationAnnotationDAO;
import edu.jhu.en605.fcriscu1.ncidc.util.CommonNames;
import edu.jhu.fcriscu1.ncidc.generated.annotation.ApplicationAnnotation;

public class ApplicationAnnotationDBXML extends AnnotationContainerDbxmlDAO
		implements ApplicationAnnotationDAO {

	private String xmlDocumentName;

	public ApplicationAnnotationDBXML() {
		super();
	}

	@Override
	public List<ApplicationAnnotation> getApplicationAnnotationsByGeneSymbol(
			String hugoSymbol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApplicationAnnotation> getApplicationAnnotationsByApplicationUserId(
			String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public method to add a new annotation to database
	 * every annotation is stored as a separate document with a unique name
	 * (non-Javadoc)
	 * @see edu.jhu.en605.fcriscu1.ncidc.dao.ApplicationAnnotationDAO#persistApplicationAnnotation(edu.jhu.fcriscu1.ncidc.generated.annotation.ApplicationAnnotation)
	 */
	@Override
	public void persistApplicationAnnotation(ApplicationAnnotation aa) {
		this.xmlDocumentName = "AA_" + UUID.randomUUID().toString() + ".xml";

		try {
			JAXBContext jc = JAXBContext
					.newInstance(applicationAnnotationJAXBPackageName);
			Marshaller m = jc.createMarshaller();

			ByteArrayOutputStream os = new ByteArrayOutputStream();
			m.marshal(aa, os);
			// marshall the Java object to XML on an output stream
			XmlInputStream is;
			// read in the XML to a new document
			is = this.getManager().createInputStream(
					new ByteArrayInputStream(os.toByteArray()));

			this.getContainer().putDocument(this.xmlDocumentName, is);
			System.out.println("ApplicationAnnotation document: " +this.xmlDocumentName +" created");

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}


}
