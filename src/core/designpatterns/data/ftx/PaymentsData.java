package core.designpatterns.data.ftx;

import java.util.List;

public class PaymentsData {
	private PaymentPlanData paymentPlanData;
	private List<PaymentDueData> paymentDues;
	private String operation;
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public PaymentPlanData getPaymentPlanData() {
		return paymentPlanData;
	}
	public void setPaymentPlanData(PaymentPlanData paymentPlanData) {
		this.paymentPlanData = paymentPlanData;
	}
	public List<PaymentDueData> getPaymentDues() {
		return paymentDues;
	}
	public void setPaymentDues(List<PaymentDueData> paymentDues) {
		this.paymentDues = paymentDues;
	}
}
