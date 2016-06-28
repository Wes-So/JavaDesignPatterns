package core.designpatterns.composite;

import core.designpatterns.data.ftx.PaymentDueData;
import core.designpatterns.data.ftx.PromisePaymentData;
import core.designpatterns.data.ftx.ScheduledPaymentData;

public class PromisePayment implements PaymentComponent {

	private PaymentDueData paymentDueData;
	private PaymentDue paymentDue = new PaymentDue();;
	public PromisePayment(PaymentDueData paymentDue) {
		this.paymentDueData = paymentDue; 
	}
	@Override
	public void create() { 
		paymentDue.setPaymentDue(paymentDueData);
		paymentDue.create(); 
		
		PromisePaymentData promise = paymentDueData.getPromisePaymentData();
		ScheduledPaymentData scheduledPayment = promise.getScheduledPayment();
		scheduledPayment.setScheduledPaymentId(4444L);
		System.out.println("Successfuly created scheduled payment record (promise)"); 
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
