package core.designpatterns.behavioral.strategy.dispositions;

import core.designpatterns.behavioral.strategy.DispositionProcessing;

public class BPRM implements DispositionProcessing {

	@Override
	public void addDisposition() {
		System.out.println("Added BPROM disposition");

	}

	@Override
	public void removeDisposition() {
		System.out.println("Removed BPROM disposition");

	}

}
