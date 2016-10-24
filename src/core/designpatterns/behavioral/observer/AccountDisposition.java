package core.designpatterns.behavioral.observer;

import core.designpatterns.data.ftx.PaymentData;

public class AccountDisposition implements Observer {

	@Override
	public void process(PaymentData paymentData) {
		
		if(paymentData.getOperation().equals(DispositionEnum.PMT_ADD.toString())){
			System.out.println("Added new disposition " + paymentData.getOperation() + " for account: " + paymentData.getGeneralPaymentInfo().getAccountId());
		} else if(paymentData.getOperation().equals(DispositionEnum.PMT_CAN.toString())){
			System.out.println("Added new disposition " + paymentData.getOperation() + " for account: " + paymentData.getGeneralPaymentInfo().getAccountId());
		}
	}

}
