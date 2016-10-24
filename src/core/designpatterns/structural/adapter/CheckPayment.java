package core.designpatterns.structural.adapter;

public class CheckPayment {
    /*
     * Wrapper for data classes and methods		
     */
	
	private CheckPaymentDataType checkPaymentData;

	public String createCheckPayment(){
		return "Create new check payment entities with the following data: " + checkPaymentData.getBankName() + "," + checkPaymentData.getBankAccountNumber() + "," + checkPaymentData.getCheckNumber();
	}
	
	public CheckPaymentDataType getCheckPaymentData() {
		return checkPaymentData;
	}

	public void setCheckPaymentData(CheckPaymentDataType checkPaymentData) {
		this.checkPaymentData = checkPaymentData;
	}
}
