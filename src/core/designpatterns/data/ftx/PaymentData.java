package core.designpatterns.data.ftx;

public class PaymentData {
	private Long paymentPlanId;
	private Long paymentDueId;
	private String operation;
	
	private GeneralPaymentInfo generalPaymentInfo;
	private PayorDemographicInfo payorDemographicInfo;
	private CheckInfo checkInfo;
	private CardInfo cardInfo;
	
	
	public Long getPaymentPlanId() {
		return paymentPlanId;
	}
	public void setPaymentPlanId(Long paymentPlanId) {
		this.paymentPlanId = paymentPlanId;
	}
	public Long getPaymentDueId() {
		return paymentDueId;
	}
	public void setPaymentDueId(Long paymentDueId) {
		this.paymentDueId = paymentDueId;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public GeneralPaymentInfo getGeneralPaymentInfo() {
		return generalPaymentInfo;
	}
	public void setGeneralPaymentInfo(GeneralPaymentInfo generalPaymentInfo) {
		this.generalPaymentInfo = generalPaymentInfo;
	}
	public PayorDemographicInfo getPayorDemographicInfo() {
		return payorDemographicInfo;
	}
	public void setPayorDemographicInfo(PayorDemographicInfo payorDemographicInfo) {
		this.payorDemographicInfo = payorDemographicInfo;
	}
	public CheckInfo getCheckInfo() {
		return checkInfo;
	}
	public void setCheckInfo(CheckInfo checkInfo) {
		this.checkInfo = checkInfo;
	}
	public CardInfo getCardInfo() {
		return cardInfo;
	}
	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

}
