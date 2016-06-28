package core.designpatterns.composite;

import core.designpatterns.data.ftx.CardProcessingData;
import core.designpatterns.data.ftx.PaymentDueData;

public class CardPayment implements PaymentComponent {
	private PaymentDueData paymentDueData;
	private PaymentDue paymentDue = new PaymentDue();;
	public CardPayment(PaymentDueData paymentDue) {
		this.paymentDueData = paymentDue; 
	}
	@Override
	public void create() {
		paymentDue.setPaymentDue(paymentDueData);
		paymentDue.create();
		
	 	CardProcessingData card = paymentDueData.getCardpaymentData();
		card.setCardPaymentId(3333L);	
		System.out.println("Successfuly created card processing record"); 
	}
	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
	public PaymentDue getPaymentDue() {
		return paymentDue;
	}
	public void setPaymentDue(PaymentDue paymentDue) {
		this.paymentDue = paymentDue;
	}

}
