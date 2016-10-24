package core.designpatterns.data.ftx;

import java.util.ArrayList;
import java.util.Date;

public class FTXDataGenerator {

	public CheckPaymentData createCheckPaymentData(){
		
		CheckPaymentData checkPayment = new CheckPaymentData();
		checkPayment.setRevspringPayment(createRevspringPayment()); 
		checkPayment.setScheduledPayment(createScheduledPayment());
		return checkPayment;
	}
	
	public PromisePaymentData createPromisePaymentData(){
		
		PromisePaymentData promisePayment = new PromisePaymentData();
		promisePayment.setPaymentDue(createPaymentDue());
		promisePayment.setPaymentPlan(createPaymentPlan());
		promisePayment.setScheduledPayment(createScheduledPayment());
		return promisePayment;
	}

	public CardProcessingData createCardPaymentData(){
		
		CardProcessingData cardPayment = new CardProcessingData();
		cardPayment.setCardNumber("111022-222-222-222");
		cardPayment.setPmtDueData(createPmtDueData());
		return cardPayment;
	}
	
	public PmtDueData createPmtDueData(){
		PmtDueData pmtDue = new PmtDueData();
		pmtDue.setStatus("PRP");
		return pmtDue;
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
	
	public CheckPaymentData createCheckPaymentDataNoRevspring(){
		
		CheckPaymentData checkPayment = new CheckPaymentData(); 
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
		paymentDue.setAccountId(12000330303L);
		paymentDue.setPaymentDueDate(new Date());
		paymentDue.setStatus("PRP");
		return paymentDue;
	}
	
	public PaymentDueData createPaymentDueCheck(){
		PaymentDueData paymentDue = createPaymentDue();
		paymentDue.setCheckPaymentData(createCheckPaymentData());
		return paymentDue;
	}

	public PaymentDueData createPaymentDuePromises(){
		PaymentDueData paymentDue = createPaymentDue();
		paymentDue.setPromisePaymentData(createPromisePaymentData());
		return paymentDue;
	}	
	
	public PaymentDueData createPaymentDueCard(){
		PaymentDueData paymentDue = createPaymentDue();
		paymentDue.setCardpaymentData(createCardPaymentData());
		return paymentDue;
	}
	
	public PaymentPlanData createPaymentPlan() {
		PaymentPlanData paymentPlan = new PaymentPlanData();
		paymentPlan.setPaymentPlanId(9999L);
		paymentPlan.setPaymentPlanDate(new Date());
		return paymentPlan;
	}	
	
	public PaymentsData createPaymentsData(){
		PaymentsData payments = new PaymentsData();
		
		
		
		PaymentPlanData paymentPlan = createPaymentPlan();
		payments.setPaymentPlanData(paymentPlan);
		
		ArrayList<PaymentDueData> paymentDues = new ArrayList<PaymentDueData>();		
		payments.setPaymentDues(paymentDues);
		
		
		paymentDues.add(createPaymentDueCheck());
		paymentDues.add(createPaymentDuePromises());
		paymentDues.add(createPaymentDueCard());
		
		return payments;
	}
	

	

	
	
	
}
