package edu.jhu.en605.fcriscu1.ncidc.integration;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import edu.jhu.en605.fcriscu1.ncidc.dao.ApplicationAnnotationDAO;
import edu.jhu.en605.fcriscu1.ncidc.dao.DAOFactory;
import edu.jhu.fcriscu1.ncidc.generated.annotation.ApplicationAnnotation;


/*
 * Integration tests for the ApplicationAnnotationDAO
 */
public class TestApplicationAnnotationDAO {

	private ApplicationAnnotationDAO dao;
	public TestApplicationAnnotationDAO() {
		this.dao = DAOFactory.instance.getApplicationAnnotationDAO();
	}
	
	private void performTests() {
		this.testPersistAnnotation();
	}

	private void testPersistAnnotation() {
		// unmarshall a sample XML file into an ApplicationAnnotation and then 
		// put it into the database
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance("edu.jhu.fcriscu1.ncidc.generated.annotation");
			Unmarshaller u = jc.createUnmarshaller();
			ApplicationAnnotation aa = (ApplicationAnnotation) u.unmarshal(new File("xml/SampleAnnotation.xml"));
			System.out.println("AA " +aa.getHugoSymbol());
			this.dao.persistApplicationAnnotation(aa);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestApplicationAnnotationDAO test = new TestApplicationAnnotationDAO();
		test.performTests();

	}

}
