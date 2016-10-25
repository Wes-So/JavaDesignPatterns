package core.designpatterns.behavioral.observer;

import core.designpatterns.data.ftx.PaymentData;

public class Monitoring implements Observer {

	@Override
	public void process(PaymentData paymentData) {
		System.out.println("Added to the monitoring database " + paymentData.getPaymentDueId());

	}

}
