package edu.jhu.en605.fcriscu1.ncidc.service;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.utils.StringUtils;

import uk.ac.ebi.webservices.wsdbfetch.WSDBFetchServer;
import uk.ac.ebi.webservices.wsdbfetch.WSDBFetchServerService;
import uk.ac.ebi.webservices.wsdbfetch.WSDBFetchServerServiceLocator;

/*
 * Public Singleton responsible for making requests to EMBL via their
 * DbFetch Web services. 
 */

public enum EMBLDbFetchService {
	instance;
	private WSDBFetchServer srvProxy = null;
	
	static {
		instance.init();
	}
	
	private void init() {
		try {
			this.srvProxyConnect();
		} catch (ServiceException e) {
			System.out.println("Failes to connect to EMBL service proxy");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void srvProxyConnect() throws ServiceException {
		if(this.srvProxy == null) {
			WSDBFetchServerService service =  new WSDBFetchServerServiceLocator();
			this.srvProxy = service.getWSDbfetch();
		}
	}

	/** Get the web service proxy.
	 *
	 * @return The web service proxy.
	 * @throws javax.xml.rpc.ServiceException
	 */
	public WSDBFetchServer getSrvProxy() throws ServiceException {
		this.srvProxyConnect(); // Ensure the service proxy exists
		return this.srvProxy;
	}
	
	public String fetchRefSeqAsRefSeq(String refseqId){
		if( StringUtils.isEmpty(refseqId)){
			System.out.println("fetchRefSeqAsFasta invoked with invalid parameter");
			return null;
		}
		String entryId = "refseq:" +refseqId;
		try {
			return this.fetchData(entryId, "refseq", null);
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	public String fetchRefSeqAsFasta(String refseqId){
		if( StringUtils.isEmpty(refseqId)){
			System.out.println("fetchRefSeqAsFasta invoked with invalid parameter");
			return null;
		}
		String entryId = "refseq:" +refseqId;
		try {
			return this.fetchData(entryId, "fasta", null);
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String fetchMedlineEntryAsXML(String medlineId) {
		if( StringUtils.isEmpty(medlineId)){
			System.out.println("fetchMedlineEntryAsXML invoked with invalid parameter");
			return null;
		}
		String entryId = "medline:" +medlineId;
		try {
			return this.fetchData(entryId, "medlinexml", null);
		} catch (RemoteException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	public String fetchData(String entryId, String formatName, String styleName) throws java.rmi.RemoteException, ServiceException {
		String retVal = null;
		if(entryId == null) return retVal;
		if(formatName == null) formatName = "default";
		if(styleName == null) styleName = "default";
		srvProxyConnect(); // Ensure we have a service proxy
		retVal = this.srvProxy.fetchData(entryId, formatName, styleName);
		return retVal;
	}

}
