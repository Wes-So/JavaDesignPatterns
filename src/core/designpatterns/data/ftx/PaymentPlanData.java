package core.designpatterns.data.ftx;

import java.util.Date;

public class PaymentPlanData {
	private Long paymentPlanId;
	private Date paymentPlanDate;
	private RevspringPaymentPlanData revspringPaymentPlanData;
	
	public RevspringPaymentPlanData getRevspringPaymentPlanData() {
		return revspringPaymentPlanData;
	}

	public void setRevspringPaymentPlanData(RevspringPaymentPlanData revspringPaymentPlanData) {
		this.revspringPaymentPlanData = revspringPaymentPlanData;
	}

	public Long getPaymentPlanId() {
		return paymentPlanId;
	}

	public void setPaymentPlanId(Long paymentPlan) {
		this.paymentPlanId = paymentPlan;
	}

	public Date getPaymentPlanDate() {
		return paymentPlanDate;
	}

	public void setPaymentPlanDate(Date paymentPlanDate) {
		this.paymentPlanDate = paymentPlanDate;
	}

}
