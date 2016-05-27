package core.designpatterns.decorator;

import core.designpatterns.data.CheckPaymentData;
import core.designpatterns.data.PaymentDueData;

public class CheckPayment {
	
	
	
	public CheckPaymentData create(CheckPaymentData checkPaymentData){
		//create checkPayment
		System.out.println("Creating paymentDue with id:=" + 1111);
		checkPaymentData.setCheckPaymentId(1111L);
		
		//create paymentDue
		PaymentDueData paymentDueData = checkPaymentData.getPaymentDue();
		createPaymentDue(paymentDueData);
		
		//create xref_checkpayment_paymentdue
		System.out.println( "Creating xref for checkPayment and PaymentDue with the following ids:=" + 
		checkPaymentData.getCheckPaymentId() + "," + paymentDueData.getPaymentDueId());
		
		//adding notelines
		System.out.println("Adding notelines for this created check payment");
		
		return checkPaymentData;
	}
	
	private PaymentDueData createPaymentDue(PaymentDueData paymentDueData){
		paymentDueData.setPaymentDueId(2222L);
		return paymentDueData;
	}	
}
