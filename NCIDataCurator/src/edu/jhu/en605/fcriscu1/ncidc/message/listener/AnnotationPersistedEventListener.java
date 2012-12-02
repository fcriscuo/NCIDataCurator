package edu.jhu.en605.fcriscu1.ncidc.message.listener;

import edu.jhu.en605.fcriscu1.ncidc.message.AnnotationPersistedMessage;


/*
 * Interface contract for components that will respond to ApplicationAnnotation 
 * persistence events
 */
public interface AnnotationPersistedEventListener {
      public void processMessage(AnnotationPersistedMessage message);
}
