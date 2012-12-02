package edu.jhu.en605.fcriscu1.ncidc.dao;

import java.util.List;

import edu.jhu.fcriscu1.ncidc.generated.annotation.ApplicationAnnotation;

public interface ApplicationAnnotationDAO {
	
	public List<ApplicationAnnotation> getApplicationAnnotationsByGeneSymbol(String hugoSymbol );
	public List<ApplicationAnnotation> getApplicationAnnotationsByApplicationUserId(String userId );
	public void persistApplicationAnnotation(ApplicationAnnotation aa);
	
	

}
