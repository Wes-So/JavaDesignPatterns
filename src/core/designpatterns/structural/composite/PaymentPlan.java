package core.designpatterns.structural.composite;

import core.designpatterns.data.ftx.PaymentPlanData;

public class PaymentPlan {
	private PaymentPlanData paymentPlan; 
	
	public void create() {
		System.out.println("Creating paymentPlan");
		paymentPlan.setPaymentPlanId(0000L); 
	}

	 
	public void cancel() {
		// TODO Auto-generated method stub

	}


	public PaymentPlanData getPaymentPlan() {
		return paymentPlan;
	}


	public void setPaymentPlan(PaymentPlanData paymentPlan) {
		this.paymentPlan = paymentPlan;
	}


}
