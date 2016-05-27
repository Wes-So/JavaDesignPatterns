package core.designpatterns.data;

import java.util.Date;

public class PaymentDueData {
	private Long paymentDueId;
	private String status;
	private Date paymentDueDate;
	
	public Long getPaymentDueId() {
		return paymentDueId;
	}
	public void setPaymentDueId(Long paymentDueId) {
		this.paymentDueId = paymentDueId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
}
