package core.designpatterns.data;

import java.util.Date;

public class PaymentPlanData {
	private Long paymentPlan;

	private Date paymentPlanDate;
	
	public Long getPaymentPlan() {
		return paymentPlan;
	}

	public void setPaymentPlan(Long paymentPlan) {
		this.paymentPlan = paymentPlan;
	}

	public Date getPaymentPlanDate() {
		return paymentPlanDate;
	}

	public void setPaymentPlanDate(Date paymentPlanDate) {
		this.paymentPlanDate = paymentPlanDate;
	}

}
