package core.designpatterns.data;

import java.util.Date;

public class DataGeneration {

	public CheckPaymentData createCheckPaymentData(){
		
		CheckPaymentData checkPayment = new CheckPaymentData();
		checkPayment.setPaymentDue(createPaymentDue());
		checkPayment.setPaymentPlan(createPaymentPlan());
		checkPayment.setRevspringPayment(createRevspringPayment()); 
		checkPayment.setScheduledPayment(createScheduledPayment());
		return checkPayment;
	}
	
	public ScheduledPaymentData createScheduledPayment(){
		ScheduledPaymentData sp = new ScheduledPaymentData();
		sp.setBankAccountNumber("AAAABBBB1111");
		sp.setBankName("Washington Mutual");
		sp.setCheckNumber("1111");
		return sp;
	}
	
	public PaymentDueData createPaymentDue(){
		PaymentDueData paymentDue = new PaymentDueData();
		paymentDue.setPaymentDueDate(new Date());
		return paymentDue;
	}
	
	public PaymentPlanData createPaymentPlan() {
		PaymentPlanData paymentPlan = new PaymentPlanData();
		paymentPlan.setPaymentPlanId(9999L);
		paymentPlan.setPaymentPlanDate(new Date());
		return paymentPlan;
	}
	
	public RevspringPaymentData createRevspringPayment(){
		RevspringPaymentData rsPayment = new RevspringPaymentData();
		rsPayment.setRevspringPaymentId("RSPAYMENTID");
		rsPayment.setRevspringPaymentPlan(createRevspringPaymentPlan());
		return rsPayment;
	}
	
	public RevspringPaymentPlanData createRevspringPaymentPlan(){
		RevspringPaymentPlanData rsPaymentPlan = new RevspringPaymentPlanData();
		rsPaymentPlan.setRevspringPaymentPlanId("RSPLANID");
		return rsPaymentPlan;
		
	}
	
	
	
}
