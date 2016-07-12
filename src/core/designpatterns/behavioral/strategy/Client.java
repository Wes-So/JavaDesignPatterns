package core.designpatterns.behavioral.strategy;

import core.designpatterns.behavioral.strategy.dispositions.BPRM;
import core.designpatterns.behavioral.strategy.dispositions.Default;
import core.designpatterns.behavioral.strategy.dispositions.DispositionEnum;
import core.designpatterns.behavioral.strategy.dispositions.PROM;
import core.designpatterns.data.account.DispositionData;
import core.designpatterns.data.account.DispositionDataGenerator;

public class Client {

	public static void main(String[] args) { 
		
		DispositionContext disposition = new DispositionContext();
		DispositionDataGenerator dataGen = new DispositionDataGenerator();

		//BPRM
		DispositionData bprmData = dataGen.createBPRMData();
		disposition.setDispProcessing(getDispEnum(bprmData.getDisposition()));
		disposition.addDisposition();
		disposition.removeDisposition(); 
		
		//Default
		DispositionData defaultData = dataGen.createDefaultData();
		disposition.setDispProcessing(getDispEnum(defaultData.getDisposition()));
		disposition.addDisposition();
		disposition.removeDisposition(); 
	}
	
	private static DispositionProcessing getDispEnum(String dispCode) {
		DispositionEnum dispEnum = null;
		try {
			dispEnum = DispositionEnum.valueOf(dispCode.toUpperCase());			
		} catch (IllegalArgumentException iae){
			dispEnum = DispositionEnum.DEFAULT;
		}
		
		switch(dispEnum){
			case BPRM: 
				return new BPRM(); 
			case PROM:
				return new PROM();
			default: 
				return new Default(); 
		}
	}	
	 

}
