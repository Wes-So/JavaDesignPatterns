package core.designpatterns.structural.composite;

import core.designpatterns.data.ftx.PaymentDueData;

public class PaymentDue{

	private PaymentDueData paymentDue; 
	private PaymentPlan paymentPlan;
	
	public void create() {
		System.out.println("Creating paymentDue");
		paymentDue.setPaymentDueId(1111L); 
	}

	 
	public void cancel() {
		// TODO Auto-generated method stub

	}
	public PaymentDueData getPaymentDue() {
		return paymentDue;
	}


	public void setPaymentDue(PaymentDueData paymentDue) {
		this.paymentDue = paymentDue;
	}


	public PaymentPlan getPaymentPlan() {
		return paymentPlan;
	}


	public void setPaymentPlan(PaymentPlan paymentPlan) {
		this.paymentPlan = paymentPlan;
	}

}
