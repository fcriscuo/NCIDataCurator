package edu.jhu.en605.fcriscu1.ncidc.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;

/*
 * A collection of static tasks that will be needed throughout the application
 */

public class CommonUtils {

	public static XMLGregorianCalendar setCurrentDateInXMLGregorianCalendar()  {
		
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
		} catch (DatatypeConfigurationException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	  return null;
	}
	
	public static void displayURIInBrowser( String uriAddress){
		if (StringUtils.isEmpty(uriAddress)){
			System.out.println("CommonUtils.displayURIInBrowser invoked with null or invalid parameter");
			return;
		}
		try {
			java.awt.Desktop.getDesktop().browse(new URI(uriAddress));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (URISyntaxException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}
}
