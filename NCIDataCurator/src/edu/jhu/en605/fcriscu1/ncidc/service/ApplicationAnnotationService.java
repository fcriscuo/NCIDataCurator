package edu.jhu.en605.fcriscu1.ncidc.service;

import org.apache.axis.utils.StringUtils;

import edu.jhu.en605.fcriscu1.ncidc.client.SelectedGeneEntry;
import edu.jhu.en605.fcriscu1.ncidc.dao.ApplicationAnnotationDAO;
import edu.jhu.en605.fcriscu1.ncidc.dao.DAOFactory;
import edu.jhu.en605.fcriscu1.ncidc.message.AnnotationPersistedMessage;
import edu.jhu.en605.fcriscu1.ncidc.message.MessageBus;
import edu.jhu.en605.fcriscu1.ncidc.util.CommonUtils;
import edu.jhu.fcriscu1.ncidc.generated.annotation.ApplicationAnnotation;
import edu.jhu.fcriscu1.ncidc.generated.annotation.ApplicationUser;

/*
 * Java service to support access via DAOs to ApplicationAnnotation objects.
 * 
 */

public enum ApplicationAnnotationService {
	instance;
	private ApplicationAnnotationDAO dao;
	
	
	static {
		instance.init();
	}
	
	private void init() {
		this.dao = DAOFactory.instance.getApplicationAnnotationDAO();
	}
	
	
	public void persistApplicationAnnotation (String userId, String userName ,String email, String text ) {
		if ( StringUtils.isEmpty(userId) || StringUtils.isEmpty(userName) || StringUtils.isEmpty(email)
				|| StringUtils.isEmpty(text)){
					System.out.println("persistApplicationAnnotation invoked with invalid parameter(s)");
					return;
			}
		ApplicationAnnotation  aa = this.constructNewApplicationAnnotation(userId, userName, email, text);
		this.dao.persistApplicationAnnotation(aa);
		System.out.println("ApplicationAnnotation for gene " +SelectedGeneEntry.instance.getGeneEntry().getHUGOGeneSymbol()
				+" persisted");
		// post the persistence event
		AnnotationPersistedMessage message = new AnnotationPersistedMessage(SelectedGeneEntry.instance.getGeneEntry());
		MessageBus.instance.publishAnnotationPersistedEvent(message);
		System.out.println("AnnotationPersitedEvent published to message bus");
	}
	
	public ApplicationAnnotation constructNewApplicationAnnotation (String userId, String userName ,String email, String text ) {
		
		// construct a JAXB ApplicationAnnotation object;
		ApplicationUser aau = new ApplicationUser();
		aau.setActive(true);
		aau.setUserID(userId);
		aau.setUserName(userName);
		aau.setPrimaryEmail(email);
		ApplicationAnnotation aa = new ApplicationAnnotation();
		aa.setApplicationUser(aau);
		aa.setAnnotationText(text);
		String gs = SelectedGeneEntry.instance.getGeneEntry().getHUGOGeneSymbol();
		aa.setSequenceNumber(this.getSequenceNumberByGeneSymbol(gs));
		aa.setHugoSymbol(gs);
		aa.setDateCreated(CommonUtils.setCurrentDateInXMLGregorianCalendar());
		return aa;
		
	}
	
	private int getSequenceNumberByGeneSymbol(String hugoSymbol) {
		return 1;
	}
	

}
