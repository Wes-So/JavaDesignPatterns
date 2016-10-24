package core.designpatterns.behavioral.strategy.dispositions;

import core.designpatterns.behavioral.strategy.DispositionProcessing;

public class Default implements DispositionProcessing {

	@Override
	public void addDisposition() {
		System.out.println("Added default disposition");

	}

	@Override
	public void removeDisposition() {
		System.out.println("Removed default disposition");

	}

}
