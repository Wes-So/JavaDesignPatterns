package core.designpatterns.data.ftx;

public class PromisePaymentData {
	private PaymentPlanData paymentPlan;
	private PaymentDueData paymentDue;
	private PmtDueData pmtDueData;	
	private ScheduledPaymentData scheduledPayment;

	public ScheduledPaymentData getScheduledPayment() {
		return scheduledPayment;
	}

	public void setScheduledPayment(ScheduledPaymentData scheduledPayment) {
		this.scheduledPayment = scheduledPayment;
	}

	private Long promisePaymentId;

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

	public PmtDueData getPmtDueData() {
		return pmtDueData;
	}

	public void setPmtDueData(PmtDueData pmtDueData) {
		this.pmtDueData = pmtDueData;
	}

	public Long getPromisePaymentId() {
		return promisePaymentId;
	}

	public void setPromisePaymentId(Long promisePaymentId) {
		this.promisePaymentId = promisePaymentId;
	}
}
