package core.designpatterns.data.ftx;

public class CardProcessingData {
	private PmtDueData pmtDueData;
	private String cardNumber; 
	private Long cardPaymentId;
	

	public PmtDueData getPmtDueData() {
		return pmtDueData;
	}
	public void setPmtDueData(PmtDueData pmtDueData) {
		this.pmtDueData = pmtDueData;
	}
	public Long getCardPaymentId() {
		return cardPaymentId;
	}
	public void setCardPaymentId(Long cardPaymentId) {
		this.cardPaymentId = cardPaymentId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
 }
