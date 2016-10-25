package core.designpatterns.behavioral.observer;

import core.designpatterns.data.ftx.PaymentData;

public class Logging implements Observer {

	@Override
	public void process(PaymentData paymentData) {
		System.out.println("Logged the following " + paymentData.getPaymentDueId());
		
	}

}
