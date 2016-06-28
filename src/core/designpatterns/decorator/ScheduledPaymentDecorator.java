package core.designpatterns.decorator;

import core.designpatterns.data.ftx.CheckPaymentData;
import core.designpatterns.data.ftx.PaymentDueData;
import core.designpatterns.data.ftx.ScheduledPaymentData;

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
	}

}
