package core.designpatterns.data.ftx;

public class CardInfo {
	private String cardHolderName;
	private String cardAccountNumber;
	private String cardAssociation;
	private int expirationYear;
	private int expirationMonth;
	private String cardSecurityCode;
	private String cardBillingZipCode;
	private String creditDebitIndicator;
	private boolean successful;
	private String token;
	private Long transactionId;
	private String errors;
	
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardAccountNumber() {
		return cardAccountNumber;
	}
	public void setCardAccountNumber(String cardAccountNumber) {
		this.cardAccountNumber = cardAccountNumber;
	}
	public String getCardAssociation() {
		return cardAssociation;
	}
	public void setCardAssociation(String cardAssociation) {
		this.cardAssociation = cardAssociation;
	}
	public int getExpirationYear() {
		return expirationYear;
	}
	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}
	public int getExpirationMonth() {
		return expirationMonth;
	}
	public void setExpirationMonth(int expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public String getCardSecurityCode() {
		return cardSecurityCode;
	}
	public void setCardSecurityCode(String cardSecurityCode) {
		this.cardSecurityCode = cardSecurityCode;
	}
	public String getCardBillingZipCode() {
		return cardBillingZipCode;
	}
	public void setCardBillingZipCode(String cardBillingZipCode) {
		this.cardBillingZipCode = cardBillingZipCode;
	}
	public String getCreditDebitIndicator() {
		return creditDebitIndicator;
	}
	public void setCreditDebitIndicator(String creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	
	
	
}
