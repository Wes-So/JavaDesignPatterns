package core.designpatterns.decorator;

import core.designpatterns.data.ftx.CheckPaymentData;
import core.designpatterns.data.ftx.PaymentDueData;
import core.designpatterns.data.ftx.RevspringPaymentData;

public class RevspringPaymentDecorator extends CheckPaymentDecorator {

	public RevspringPaymentDecorator(CheckPayment wrappedCheckPayment) {
		super(wrappedCheckPayment);
	}
	
	@Override
	public void create(CheckPaymentData checkPaymentData){
		wrappedCheckPayment.create(checkPaymentData);
		
		//create revspringPayment
		RevspringPaymentData rsPayment = checkPaymentData.getRevspringPayment();
//
//		System.out.println("Creating revspring payment with the following ids:=" + 
//		paymentDueId + "," + rsPayment.getRevspringPaymentId()); 
	} 	

}
