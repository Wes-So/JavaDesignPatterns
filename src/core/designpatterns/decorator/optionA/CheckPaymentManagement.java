package core.designpatterns.decorator.optionA;

import core.designpatterns.data.CheckPaymentData;
import core.designpatterns.data.DataGeneration;


public class CheckPaymentManagement {

	public static void main(String[] args) {
		//Simulates a web service call with data as input
		DataGeneration dataGen = new DataGeneration();
		
		System.out.println("*****Create with revspring*****");
		createCheckPaymentService(dataGen.createCheckPaymentData());
	}

	public static void createCheckPaymentService(CheckPaymentData data){
		CheckPayment checkPayment = new RevspringPaymentDecorator(new ScheduledPaymentDecorator(new CheckPaymentImpl()));
		checkPayment.create(data);
	}
}
