package core.designpatterns.behavioral.observer;

import java.util.Arrays;
import java.util.List;

import core.designpatterns.data.ftx.PaymentData;

public class PaymentImpl implements Payment {
	static long paymentKey = 10000;
	List<Observer> observers =  Arrays.asList(new AccountDisposition(), new AccountNoteline(), new Logging(), new Monitoring());

	@Override
	public long add(PaymentData paymentData) {
		paymentKey = paymentKey + 1;
		System.out.println("Adding new payment: " + paymentKey);
		paymentData.setPaymentDueId(paymentKey);
		paymentData.setOperation(DispositionEnum.PMT_ADD.toString());
		notifyAllObservers(paymentData);
		return paymentKey;

	}

	@Override
	public void cancel(PaymentData paymentData) {
		paymentData.setOperation(DispositionEnum.PMT_CAN.toString());
		System.out.println("Cancelling new payment");
		notifyAllObservers(paymentData);

	}

	
	private void notifyAllObservers(PaymentData paymentData) {
		for(Observer observer : observers) {
			observer.process(paymentData);
		}
	}
}
