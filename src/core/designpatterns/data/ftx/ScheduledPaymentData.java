package core.designpatterns.data.ftx;

public class ScheduledPaymentData {
	private Long scheduledPaymentId;
	private String bankAccountNumber;
	private String bankName;
	private String checkNumber;
	
	public Long getScheduledPaymentId() {
		return scheduledPaymentId;
	}
	public void setScheduledPaymentId(Long scheduledPaymentId) {
		this.scheduledPaymentId = scheduledPaymentId;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
}
