package core.designpatterns.decorator;

import core.designpatterns.data.ftx.CheckPaymentData;
import core.designpatterns.data.ftx.FTXDataGenerator;
import core.designpatterns.data.ftx.PaymentDueData;


public class CheckPaymentManagement {

	public static void main(String[] args) {
		//Simulates a web service call with data as input
		FTXDataGenerator dataGen = new FTXDataGenerator();
		PaymentDueData paymentDue = dataGen.createPaymentDueCheck();
		paymentDue.setPaymentDueId(0000L);
		
		System.out.println("*****Create with revspring*****");
		createCheckPaymentService(paymentDue.getCheckPaymentData());
	}

	public static void createCheckPaymentService(CheckPaymentData data){
		
		CheckPayment checkPayment = new RevspringPaymentDecorator(new ScheduledPaymentDecorator(new CheckPaymentImpl()));
		checkPayment.create(data);
	}
}
