package edu.jhu.en605.fcriscu1.ncidc.dao;

import edu.jhu.en605.fcriscu1.ncidc.dao.dbxml.ApplicationAnnotationDBXML;
import edu.jhu.en605.fcriscu1.ncidc.dao.dbxml.GeneEntryDBXML;
import edu.jhu.en605.fcriscu1.ncidc.dao.dbxml.NCIGeneDbxmlDAO;


/*
 * Java Singleton that will return a DAO implementation based on the
 * data access technology being used. Current only access to 
 * DB XML is implemented
 * 
 * 
 */
public enum DAOFactory {
	instance;
	
	public enum DAO_TYPE {JAXB, DBXML, JDBC, REST};
	
	public GeneEntryDAO getGeneEntryDAO(){
		 return new GeneEntryDBXML();
	}
	
	public ApplicationAnnotationDAO getApplicationAnnotationDAO (){
		return new ApplicationAnnotationDBXML();
	}
	
	public NCIGeneDAO getNCIGeneDAO() {
		return new NCIGeneDbxmlDAO();
	}
	

}
