package core.designpatterns.behavioral.observer;

import core.designpatterns.data.ftx.PaymentData;

public interface Payment {
	public long add(PaymentData paymentData);
	public void cancel(PaymentData paymentData);
}
