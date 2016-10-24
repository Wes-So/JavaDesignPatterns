package core.designpatterns.data.ftx;

import java.util.Date;

public class PaymentDueData {
	private Long paymentDueId;
	private String status;
	private Date paymentDueDate;
	private Long accountId;
	private CheckPaymentData checkPaymentData;
	private PromisePaymentData promisePaymentData;
	private CardProcessingData cardpaymentData;
	private RevspringPaymentData revspringPaymentData;
	private PaymentPlanData paymentPlanData;
	
	public RevspringPaymentData getRevspringPaymentData() {
		return revspringPaymentData;
	}
	public void setRevspringPaymentData(RevspringPaymentData revspringPaymentData) {
		this.revspringPaymentData = revspringPaymentData;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
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
	public CheckPaymentData getCheckPaymentData() {
		return checkPaymentData;
	}
	public void setCheckPaymentData(CheckPaymentData checkPaymentData) {
		this.checkPaymentData = checkPaymentData;
	}
	public PromisePaymentData getPromisePaymentData() {
		return promisePaymentData;
	}
	public void setPromisePaymentData(PromisePaymentData promisePaymentData) {
		this.promisePaymentData = promisePaymentData;
	}
	public CardProcessingData getCardpaymentData() {
		return cardpaymentData;
	}
	public void setCardpaymentData(CardProcessingData cardpaymentData) {
		this.cardpaymentData = cardpaymentData;
	}
	public PaymentPlanData getPaymentPlanData() {
		return paymentPlanData;
	}
	public void setPaymentPlanData(PaymentPlanData paymentPlanData) {
		this.paymentPlanData = paymentPlanData;
	}
}
