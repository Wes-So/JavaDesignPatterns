package core.designpatterns.decorator.optionA;

import core.designpatterns.data.CheckPaymentData;
import core.designpatterns.data.PaymentDueData;
import core.designpatterns.data.ScheduledPaymentData;

public class ScheduledPaymentDecorator extends CheckPaymentDecorator {

	public ScheduledPaymentDecorator(CheckPayment wrappedCheckPayment) {
		super(wrappedCheckPayment);
	}
	
	@Override
	public void create(CheckPaymentData checkPaymentData){
		wrappedCheckPayment.create(checkPaymentData);
		
		//create scheduledPayment
		ScheduledPaymentData sp = checkPaymentData.getScheduledPayment();
		sp.setScheduledPaymentId(3333L);
		System.out.println("Creating scheduledPayment with id:=" + sp.getScheduledPaymentId());
		
		//get paymentDueData
		PaymentDueData paymentDue = checkPaymentData.getPaymentDue();
		
		//create xref_scheduledpayment_paymentdue
		System.out.println(
		"Creating xref for scheduledPayment and PaymentDue with the following ids:=" + 
				paymentDue.getPaymentDueId() + "," + sp.getScheduledPaymentId());
 
		 
	} 	

}