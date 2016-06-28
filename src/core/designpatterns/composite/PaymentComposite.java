package core.designpatterns.composite;

import java.util.List;

import core.designpatterns.data.ftx.CheckPaymentData;
import core.designpatterns.data.ftx.PaymentDueData;
import core.designpatterns.data.ftx.ScheduledPaymentData;

public class PaymentComposite implements PaymentComponent {
 
	private List<PaymentComponent> payments;
	
	@Override
	public void create() {
		for(PaymentComponent payment:payments){
			payment.create();
		}
 	}
 

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}


	public List<PaymentComponent> getPayments() {
		return payments;
	}


	public void setPayments(List<PaymentComponent> payments) {
		this.payments = payments;
	}


 
 
}
