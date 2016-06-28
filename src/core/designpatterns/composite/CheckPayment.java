package core.designpatterns.composite;

import core.designpatterns.data.ftx.CheckPaymentData;
import core.designpatterns.data.ftx.PaymentDueData;
import core.designpatterns.data.ftx.ScheduledPaymentData; 

public class CheckPayment implements PaymentComponent {  
	
	private PaymentDueData paymentDueData;
	private PaymentDue paymentDue = new PaymentDue();
	
	public CheckPayment(PaymentDueData paymentDue) {
		this.paymentDueData = paymentDue; 
	}

	@Override
	public void create() { 
		paymentDue.setPaymentDue(paymentDueData);
		paymentDue.create();
		
		CheckPaymentData check = paymentDueData.getCheckPaymentData();
		ScheduledPaymentData scheduledPayment = check.getScheduledPayment();
		scheduledPayment.setScheduledPaymentId(2222L);
		System.out.println("Successfuly created scheduled payment record (check)"); 
		
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
