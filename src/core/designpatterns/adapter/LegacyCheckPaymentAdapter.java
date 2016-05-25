package core.designpatterns.adapter;

public class LegacyCheckPaymentAdapter extends CheckPayment {

	private LegacyCheckPayment legacyCheckPayment;
	
	public LegacyCheckPaymentAdapter(LegacyCheckPayment legacyCheckPayment){
		this.legacyCheckPayment = legacyCheckPayment;
	}
	
	@Override
	public String createCheckPayment(){
		return legacyCheckPayment.createCheckPayment();
	}
	
}
