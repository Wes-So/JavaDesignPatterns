package core.designpatterns.data.ftx;

import java.util.Date;

public class GeneralPaymentInfo {
	private Long accountId;
	private Long franchiseId;
	private String customerName;
	private String revspringPaymentId;
	private String revsprintPaymentPlanId;
	private Double paymentAmount;
	private Date paymentDate;
	private String paymentMethod;
	private String transactionType;

	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public Long getFranchiseId() {
		return franchiseId;
	}
	public void setFranchiseId(Long franchiseId) {
		this.franchiseId = franchiseId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getRevspringPaymentId() {
		return revspringPaymentId;
	}
	public void setRevspringPaymentId(String revspringPaymentId) {
		this.revspringPaymentId = revspringPaymentId;
	}
	public String getRevsprintPaymentPlanId() {
		return revsprintPaymentPlanId;
	}
	public void setRevsprintPaymentPlanId(String revsprintPaymentPlanId) {
		this.revsprintPaymentPlanId = revsprintPaymentPlanId;
	}
	public Double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	
}
