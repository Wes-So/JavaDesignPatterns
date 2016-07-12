package core.designpatterns.behavioral.strategy.dispositions;

import core.designpatterns.behavioral.strategy.DispositionProcessing;

public class PROM implements DispositionProcessing {

	@Override
	public void addDisposition() {
		System.out.println("Added PROM disposition");

	}

	@Override
	public void removeDisposition() {
		System.out.println("Removed PROM disposition");

	}

}
