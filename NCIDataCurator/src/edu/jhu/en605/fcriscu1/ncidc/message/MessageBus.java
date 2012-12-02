package edu.jhu.en605.fcriscu1.ncidc.message;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.StringUtils;

import edu.jhu.en605.fcriscu1.ncidc.message.listener.AnnotationPersistedEventListener;
import edu.jhu.en605.fcriscu1.ncidc.message.listener.LogMessageListener;
import edu.jhu.en605.fcriscu1.ncidc.message.listener.TreeMapGeneSelectionEventListener;

/*
 * 
 * Java enum to support a Singleton that serves as a message bus between
 * disconnected message producers and consumers;
 */


public enum MessageBus {
	instance;
	
	// log message listeners
	private Map<String, LogMessageListener> logMessageListeners = new ConcurrentHashMap<String, LogMessageListener>();
	// gene selection event listeners
	private Map<String,TreeMapGeneSelectionEventListener> treeMapEventListenerMap =
		new ConcurrentHashMap<String,TreeMapGeneSelectionEventListener >();
	// application annotation persistence event listeners
	private Map<String,AnnotationPersistedEventListener> annotationEventListenerMap =
		new ConcurrentHashMap<String,AnnotationPersistedEventListener>();
	
	/*****************************************************************************
	 * AnnotationPersistedEvent
	 * 
	 */
	public void AnnotationPersistedEventListener( String uuid) {
		if (!StringUtils.isEmpty(uuid )&& annotationEventListenerMap.containsKey(uuid) ){
			annotationEventListenerMap.remove(uuid);
		}
	}
	
	public String registerAnnotationPersistedEventListener( AnnotationPersistedEventListener listener){
		if ( null != listener) {
			String uuid = UUID.randomUUID().toString();
			annotationEventListenerMap.put(uuid, listener);
			return uuid;
		}
		return null;
	}
	/*
	 * Publish gene symbol selection event to all registered listeners
	 * Normally a notice to each listener should be done on a new thread so that
	 * an errant listener does not block other listeners or the main application.
	 * but for this POC, I'll follow the KISS methodology
	 */
	public void publishAnnotationPersistedEvent(AnnotationPersistedMessage message){
		if ( null !=message &&  !treeMapEventListenerMap.isEmpty()){
			Collection<AnnotationPersistedEventListener> listenerList =
				(Collection<AnnotationPersistedEventListener>) annotationEventListenerMap.values();
			for (AnnotationPersistedEventListener listener : listenerList)
			{
				listener.processMessage(message);
			}
		}
	}
	
	
	/*****************************************************************************
	 * TreeMapGeneSelectionEvent
	 * 
	 */
	public void removeTreeMapGeneSelectionEventListener( String uuid) {
		if (!StringUtils.isEmpty(uuid )&& treeMapEventListenerMap.containsKey(uuid) ){
			treeMapEventListenerMap.remove(uuid);
		}
	}
	
	public String registerTreeMapGeneSelectionEventListener( TreeMapGeneSelectionEventListener listener){
		if ( null != listener) {
			String uuid = UUID.randomUUID().toString();
			treeMapEventListenerMap.put(uuid, listener);
			return uuid;
		}
		return null;
	}
	/*
	 * Publish gene symbol selection event to all registered listeners
	 * Normally a notice to each listener should be done on a new thread so that
	 * an errant listener does not block other listeners or the main application.
	 * but for this POC, I'll follow the KISS methodology
	 */
	public void publishTreeMapGeneSelectionEvent(TreeMapGeneSelectionMessage message){
		if ( null !=message &&  !treeMapEventListenerMap.isEmpty()){
			Collection<TreeMapGeneSelectionEventListener> listenerList =
				(Collection<TreeMapGeneSelectionEventListener>) treeMapEventListenerMap.values();
			for (TreeMapGeneSelectionEventListener listener : listenerList)
			{
				listener.processMessage(message);
			}
		}
	}
	
	/*************************************************************************
	 * LogMessages
	 */
	// remove log message listener
	public void removeLogMessageListener(String uuid){
		if (!StringUtils.isEmpty(uuid) && logMessageListeners.containsKey(uuid)){
			logMessageListeners.remove(uuid);
		} 
	}
	
	// register error log listener
	public String registerLogMessageListener (LogMessageListener listener){
		if(null != listener){
			String uuid = UUID.randomUUID().toString();
			logMessageListeners.put(uuid, listener);
			return uuid;
		}
		
		return null;
	}

	// publish  log message to registered listeners
	private void publishLogMessage(String message){
		if (!message.isEmpty() && !logMessageListeners.isEmpty()){
			Collection <LogMessageListener> listenerList = (
					Collection<LogMessageListener>) logMessageListeners.values();
			for (LogMessageListener listener : listenerList){			
				listener.processLogMessage(message);
			}
		}
	}

	// support for application annotation persistence events
	
	
}
