package core.designpatterns.decorator;

import core.designpatterns.data.CheckPaymentData;
import core.designpatterns.data.DataGeneration;

public class CheckPaymentManagement {

	public static void main(String[] args) { 
		//Simulates a web service call with data as input
		DataGeneration dataGen = new DataGeneration();
		createCheckPaymentService(dataGen.createCheckPaymentData()); 
	}

	public static void createCheckPaymentService(CheckPaymentData checkPaymentData){
		CheckPayment checkPayment = new CheckPayment();
		CheckPaymentDecorator checkDecorator = new CheckPaymentDecorator(checkPayment);
		ScheduledPaymentDecorator spDecorator = new ScheduledPaymentDecorator(checkDecorator);
		RevspringPaymentDecorator rsDecorator = new RevspringPaymentDecorator(spDecorator);
		
		rsDecorator.create(checkPaymentData);
	}
	
	
	
	
}
