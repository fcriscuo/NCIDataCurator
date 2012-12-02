package edu.jhu.en605.fcriscu1.ncidc.client.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import edu.jhu.en605.fcriscu1.ncidc.client.controller.GeneTreeMapController;
import edu.jhu.en605.fcriscu1.ncidc.message.MessageBus;
import edu.jhu.en605.fcriscu1.ncidc.message.TreeMapGeneSelectionMessage;



public class GeneTreeMapMouseListener implements MouseListener, MouseMotionListener,
		MouseWheelListener {

	private GeneTreeMapController controller;
	
	public GeneTreeMapMouseListener(GeneTreeMapController hc){
		this.controller = hc;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.controller.getView().getComponentAt(e.getPoint()).requestFocus();
		this.controller.getView().getModel().getProbing().setSelected
			(this.controller.getView().getNode(e.getPoint()));

	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		this.controller.getView().getModel().getProbing().clearSelection();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.controller.getView().getComponentAt(e.getPoint()).requestFocus();
		this.controller.getView().getModel().getProbing().setSelected
			(this.controller.getView().getNode(e.getPoint()));
		
	
		String hugoSymbol = this.controller.getView().getNode(e.getPoint()).toString();
		TreeMapGeneSelectionMessage message = new TreeMapGeneSelectionMessage(hugoSymbol); 
		MessageBus.instance.publishTreeMapGeneSelectionEvent(message);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		this.controller.getView().getModel().getProbing().setSelected
		(this.controller.getView().getNode(e.getPoint()));

	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub

	}

}
