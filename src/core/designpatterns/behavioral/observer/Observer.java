package core.designpatterns.behavioral.observer;

import core.designpatterns.data.ftx.PaymentData;

public interface Observer {
	public void process(PaymentData paymentData);
}
