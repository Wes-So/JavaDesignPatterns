package core.designpatterns.data.ftx;

public class CheckPaymentData {
	private RevspringPaymentData revspringPayment;
	private ScheduledPaymentData scheduledPayment;
	private Long checkPaymentId;	

	
	public Long getCheckPaymentId() {
		return checkPaymentId;
	}
	public void setCheckPaymentId(Long checkPaymentId) {
		this.checkPaymentId = checkPaymentId;
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
