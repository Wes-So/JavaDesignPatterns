package core.designpatterns.decorator;

import core.designpatterns.data.CheckPaymentData;
import core.designpatterns.data.PaymentDueData;
import core.designpatterns.data.RevspringPaymentData;

public class RevspringPaymentDecorator extends CheckPaymentDecorator {
	public RevspringPaymentDecorator(CheckPayment checkPayment) {
		super(checkPayment);
	}
	
	@Override
	public CheckPaymentData create(CheckPaymentData checkPaymentData){
		checkPayment.create(checkPaymentData);
		
		//create revspringPayment
		RevspringPaymentData rsPayment = checkPaymentData.getRevspringPayment();
		PaymentDueData paymentDue = checkPaymentData.getPaymentDue();
		System.out.println("Creating revspring payment with the following ids:=" + 
		paymentDue.getPaymentDueId() + "," + rsPayment.getRevspringPaymentId());
  
		return checkPaymentData;
	} 
}
