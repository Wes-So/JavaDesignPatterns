package core.designpatterns.behavioral.strategy;

import core.designpatterns.behavioral.strategy.dispositions.Default;

public class DispositionContext {
	
	private DispositionProcessing dispProcessing = new Default();
	
	
	public void addDisposition(){ 
		dispProcessing.addDisposition();
	}
	
	public void removeDisposition(){ 
		dispProcessing.removeDisposition(); 
	}	
	 
	public DispositionProcessing getDispProcessing() {
		return dispProcessing;
	}

	public void setDispProcessing(DispositionProcessing dispProcessing) {
		this.dispProcessing = dispProcessing;
	}

}
