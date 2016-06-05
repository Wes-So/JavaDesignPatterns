package core.designpatterns.decorator.optionA;

import core.designpatterns.data.CheckPaymentData;
import core.designpatterns.data.PaymentDueData;
import core.designpatterns.data.RevspringPaymentData;

public class RevspringPaymentDecorator extends CheckPaymentDecorator {

	public RevspringPaymentDecorator(CheckPayment wrappedCheckPayment) {
		super(wrappedCheckPayment);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void create(CheckPaymentData checkPaymentData){
		wrappedCheckPayment.create(checkPaymentData);
		
		//create revspringPayment
		RevspringPaymentData rsPayment = checkPaymentData.getRevspringPayment();
		PaymentDueData paymentDue = checkPaymentData.getPaymentDue();
		System.out.println("Creating revspring payment with the following ids:=" + 
		paymentDue.getPaymentDueId() + "," + rsPayment.getRevspringPaymentId()); 
	} 	

}
