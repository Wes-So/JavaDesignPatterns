package core.designpatterns.behavioral.observer;

import org.junit.Test;

import core.designpatterns.data.ftx.GeneralPaymentInfo;
import core.designpatterns.data.ftx.PaymentData;

public class PaymentManagementSvcImpl {
	Payment payment = new PaymentImpl();

	@Test
	public void testAddPayment(){ 
		PaymentData paymentData = createPaymentData();
		payment.add(paymentData);
		System.out.println("******"); 
 	}

	@Test
	public void testCancelPayment(){ 
		PaymentData paymentData = createPaymentData();
		paymentData.setPaymentDueId(2000L);
		payment.cancel(paymentData);
		System.out.println("******"); 
 	}	
	
	
	private PaymentData createPaymentData(){
		PaymentData paymentData = new PaymentData();
		
		GeneralPaymentInfo gp = new GeneralPaymentInfo();		
		gp.setAccountId(120024625555L);
		
		paymentData.setGeneralPaymentInfo(gp);
		return paymentData;
	}
}
