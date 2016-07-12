package core.designpatterns.data.account;

public class DispositionDataGenerator {
	public DispositionData createBPRMData(){
		DispositionData disp = new DispositionData();
		disp.setDisposition("BPRM");
		return disp;
	}
	
	public DispositionData createPROMData(){
		DispositionData disp = new DispositionData();
		disp.setDisposition("PROM");
		return disp;
	}
	
	public DispositionData createDefaultData(){
		DispositionData disp = new DispositionData();
		disp.setDisposition("LSC");
		return disp;
	}	
}
