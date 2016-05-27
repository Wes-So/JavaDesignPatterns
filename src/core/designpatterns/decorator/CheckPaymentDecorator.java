package core.designpatterns.decorator;

import core.designpatterns.data.CheckPaymentData;

public class CheckPaymentDecorator extends CheckPayment {
	protected CheckPayment checkPayment;
	
	public CheckPaymentDecorator(CheckPayment checkPayment) {
		this.checkPayment = checkPayment;
	}
	
	@Override
	public CheckPaymentData create(CheckPaymentData checkPaymentData){
		return checkPayment.create(checkPaymentData);
	}
}
