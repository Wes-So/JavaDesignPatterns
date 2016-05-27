package core.designpatterns.data;

import java.util.Date;

public class PaymentPlanData {
	private Long paymentPlanId;

	private Date paymentPlanDate;
	
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
