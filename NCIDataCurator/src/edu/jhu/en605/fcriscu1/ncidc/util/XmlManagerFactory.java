package edu.jhu.en605.fcriscu1.ncidc.util;

import java.io.File;
import java.io.FileNotFoundException;

import com.sleepycat.db.DatabaseException;
import com.sleepycat.db.Environment;
import com.sleepycat.db.EnvironmentConfig;
import com.sleepycat.dbxml.XmlContainer;
import com.sleepycat.dbxml.XmlException;
import com.sleepycat.dbxml.XmlManager;
import com.sleepycat.dbxml.XmlManagerConfig;

/*
 * Java Singleton implemented as an enum to define the
 * DB XML Environment object. Code based on example provided in
 * 
 * 
 */

public enum XmlManagerFactory {
	instance;
	
	private XmlManager theManager;
	private Environment theEnvironment;
	
	static {
		instance.init();
	}
	
	private void init() {
		this.theEnvironment = this.establishEnvironment();
		System.out.println("XML Environment established");
		this.theManager = this.initializeXmlManager();
		
		System.out.println("XML Manager initialized");
	}
	
	public XmlManager getXmlManager() {
		return this.theManager;
	}
	
	private Environment establishEnvironment() {
		try {
			File envHome = new File(CommonNames.DBXML_Environment_Location);
			EnvironmentConfig envConf = new EnvironmentConfig();
			envConf.setAllowCreate(true);
			envConf.setInitializeCache(true);
			envConf.setInitializeLocking(true);
			envConf.setInitializeLogging(true);
			envConf.setTransactional(true);
			envConf.setMaxLocks(100000);
			envConf.setMaxLockers(5000);
			envConf.setMaxMutexes(10000);	
			return new Environment(envHome, envConf);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (DatabaseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
		
	}
	
	private XmlManager initializeXmlManager() {
		XmlManager manager = null;
		try {
			XmlManagerConfig managerConfig = new XmlManagerConfig();
			managerConfig.setAllowExternalAccess(true);
			managerConfig.setAdoptEnvironment(true);
			
			 manager =  new XmlManager(this.theEnvironment, managerConfig);
			 // the default container type is node based
			 manager.setDefaultContainerType(XmlContainer.NodeContainer);
		} catch (XmlException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return manager;
		
	}
	
	public void closeManager() {
		if (null != this.theManager){
			try {
				
				this.theEnvironment.close();    // close the environment
				this.theManager.close();
				System.out.println("XmlManager closed.");
			} catch (XmlException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} catch (DatabaseException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
	}
	
	

}
