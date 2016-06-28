package core.designpatterns.decorator.optionA;

import core.designpatterns.data.ftx.CheckPaymentData;

public abstract class CheckPaymentDecorator implements CheckPayment {
	
	protected CheckPayment wrappedCheckPayment; 
	
	public CheckPaymentDecorator(CheckPayment wrappedCheckPayment){
		this.wrappedCheckPayment = wrappedCheckPayment;
	
	}

	@Override
	public void create(CheckPaymentData data) {
		wrappedCheckPayment.create(data);
	}

}
