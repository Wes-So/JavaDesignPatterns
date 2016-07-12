package core.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

import core.designpatterns.data.ftx.FTXDataGenerator;
import core.designpatterns.data.ftx.PaymentDueData;
import core.designpatterns.data.ftx.PaymentPlanData;
import core.designpatterns.data.ftx.PaymentsData;

public class PaymentManagement {

	public static void main(String[] args) {
		FTXDataGenerator dataGen = new FTXDataGenerator();
		
		//Single check payment
		PaymentDueData checkPayment = dataGen.createPaymentDueCheck();		
		System.out.println("*****Creating single check payment outside of plan*****");		
		createCheckPayment(checkPayment);
		System.out.println("PaymentDueId:" + checkPayment.getPaymentDueId());
		System.out.println("ScheduledPaymentId (PD):" + checkPayment.getCheckPaymentData().getScheduledPayment().getScheduledPaymentId());
		
		System.out.println("\r\n");
		
		//Single card payment
		PaymentDueData cardPayment = dataGen.createPaymentDueCard();		
		System.out.println("*****Creating single card payment outside of plan*****");		
		createCardPayment(cardPayment);
		System.out.println("PaymentDueId:" + cardPayment.getPaymentDueId());
		System.out.println("CardProcessingId:" + cardPayment.getCardpaymentData().getCardPaymentId());
		
		System.out.println("\r\n");

		//Single promise payment
		PaymentDueData promisePayment = dataGen.createPaymentDuePromises();		
		System.out.println("*****Creating single promise payment outside of plan*****");		
		createPromisePayment(promisePayment);
		System.out.println("PaymentDueId:" + promisePayment.getPaymentDueId());
		System.out.println("ScheduledPaymentId (PPA):" + promisePayment.getPromisePaymentData().getScheduledPayment().getScheduledPaymentId());
		
		System.out.println("\r\n");		
		//Create composite set of payments
		PaymentsData payments = dataGen.createPaymentsData();
		System.out.println("*****Creating composite payments inside of a plan*****");		
		createPayments(payments);
	}

	
	private static void createCheckPayment(PaymentDueData paymentDue){
		PaymentComponent payment = new CheckPayment(paymentDue);
		payment.create();
	}
	
	private static void createCardPayment(PaymentDueData paymentDue){
		PaymentComponent payment = new CardPayment(paymentDue);
		payment.create();
	}	
	
	private static void createPromisePayment(PaymentDueData paymentDue){
		PaymentComponent payment = new PromisePayment(paymentDue);
		payment.create();
	}	
	
	private static void createPayments(PaymentsData payments){
		
		PaymentPlan paymentPlan = new PaymentPlan();
		paymentPlan.setPaymentPlan(payments.getPaymentPlanData());
		paymentPlan.create();
		
		ArrayList<PaymentComponent> paymentComponents = new ArrayList<PaymentComponent>();
		for(PaymentDueData paymentDue:payments.getPaymentDues()){
			paymentDue.setPaymentPlanData(payments.getPaymentPlanData());
			if(paymentDue.getCardpaymentData() != null){
				paymentComponents.add(new CardPayment(paymentDue));
			} else if(paymentDue.getCheckPaymentData() != null){
				paymentComponents.add(new CheckPayment(paymentDue));
			} else if(paymentDue.getPromisePaymentData() != null){
				paymentComponents.add(new PromisePayment(paymentDue));
			}
		}
		
		PaymentComposite paymentComposite = new PaymentComposite();
		paymentComposite.setPayments(paymentComponents);
		paymentComposite.create(); 
	}
	
}
