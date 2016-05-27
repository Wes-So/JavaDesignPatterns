package core.designpatterns.data;

public class CheckPaymentData {
	private PaymentPlanData paymentPlan;
	private PaymentDueData paymentDue;
	private RevspringPaymentData revspringPayment;
	private ScheduledPaymentData scheduledPayment;
	private Long checkPaymentId;	

	
	public Long getCheckPaymentId() {
		return checkPaymentId;
	}
	public void setCheckPaymentId(Long checkPaymentId) {
		this.checkPaymentId = checkPaymentId;
	}
	
	public PaymentPlanData getPaymentPlan() {
		return paymentPlan;
	}
	public void setPaymentPlan(PaymentPlanData paymentPlan) {
		this.paymentPlan = paymentPlan;
	}
	public PaymentDueData getPaymentDue() {
		return paymentDue;
	}
	public void setPaymentDue(PaymentDueData paymentDue) {
		this.paymentDue = paymentDue;
	}
	public RevspringPaymentData getRevspringPayment() {
		return revspringPayment;
	}
	public void setRevspringPayment(RevspringPaymentData revspringPayment) {
		this.revspringPayment = revspringPayment;
	}
 
	public ScheduledPaymentData getScheduledPayment() {
		return scheduledPayment;
	}
	public void setScheduledPayment(ScheduledPaymentData scheduledPayment) {
		this.scheduledPayment = scheduledPayment;
	}

}
