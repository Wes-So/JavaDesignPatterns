package core.designpatterns.structural.adapter;

public class LegacyCheckPayment {
	private CheckPaymentDataType checkPaymentData;


	public String createCheckPayment(){
		return "Created SP and SPI with the following data: " + checkPaymentData.getBankName() + "," + checkPaymentData.getBankAccountNumber() + "," + checkPaymentData.getCheckNumber();
	} 
	
	public CheckPaymentDataType getCheckPaymentData() {
		return checkPaymentData;
	}

	public void setCheckPaymentData(CheckPaymentDataType checkPaymentData) {
		this.checkPaymentData = checkPaymentData;
	}
}
