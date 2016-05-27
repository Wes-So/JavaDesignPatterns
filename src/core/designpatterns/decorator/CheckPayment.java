package core.designpatterns.decorator;

import core.designpatterns.data.CheckPaymentData;
import core.designpatterns.data.PaymentDueData;
import core.designpatterns.data.PaymentPlanData;

public class CheckPayment {
	
	
	
	public CheckPaymentData create(CheckPaymentData checkPaymentData){
 		//create paymentDue
		PaymentDueData paymentDueData = checkPaymentData.getPaymentDue();
		paymentDueData.setPaymentDueId(2222L);
		System.out.println("Creating paymentDue with the id:=" + paymentDueData.getPaymentDueId());
		
		//get paymentPlan info
		PaymentPlanData paymentPlan = checkPaymentData.getPaymentPlan();
		
		//create xref_paymentplan_paymentdue
		System.out.println( "Creating xref for PaymentPlan and PaymentDue with the following ids:=" + 
		paymentPlan.getPaymentPlanId() + "," + paymentDueData.getPaymentDueId());
		
		//adding notelines
		System.out.println("Adding notelines for this created check payment");
		
		return checkPaymentData;
	}
	
 }
