package core.designpatterns.data.ftx;

public class RevspringPaymentData {
	
	private RevspringPaymentPlanData revspringPaymentPlan;
	private String revspringPaymentId;
	private Long paymentDueId;
	
	public String getRevspringPaymentId() {
		return revspringPaymentId;
	}
	public void setRevspringPaymentId(String revspringPaymentId) {
		this.revspringPaymentId = revspringPaymentId;
	}
	public Long getPaymentDueId() {
		return paymentDueId;
	}
	public void setPaymentDueId(Long paymentDueId) {
		this.paymentDueId = paymentDueId;
	}

	public RevspringPaymentPlanData getRevspringPaymentPlan() {
		return revspringPaymentPlan;
	}
	public void setRevspringPaymentPlan(RevspringPaymentPlanData revspringPaymentPlan) {
		this.revspringPaymentPlan = revspringPaymentPlan;
	}
}
