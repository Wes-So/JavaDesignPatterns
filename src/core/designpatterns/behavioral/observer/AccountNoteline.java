package core.designpatterns.behavioral.observer;

import core.designpatterns.data.ftx.PaymentData;

public class AccountNoteline implements Observer {

	@Override
	public void process(PaymentData paymentData) {
		if(paymentData.getOperation().equals(DispositionEnum.PMT_ADD.toString())){
			System.out.println("Added new add payment noteline for the following paymentDue " + paymentData.getPaymentDueId());	
		} else if(paymentData.getOperation().equals(DispositionEnum.PMT_CAN.toString())){
			System.out.println("Added new cancel payment noteline for the following paymentDue " + paymentData.getPaymentDueId());
		}	 
	}

}
