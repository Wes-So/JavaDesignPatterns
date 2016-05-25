package core.designpatterns.adapter;

public class CheckPaymentManagement {

	public static void main(String[] args) { 
		//Simulates a web service call with data as input
		createCheckPaymentService(createCheckPaymentData()); 
	}

	public static void createCheckPaymentService(CheckPaymentDataType checkPaymentData){
		//These three lines can be removed when legacy code goes away
		LegacyCheckPayment legacyCheck = new LegacyCheckPayment(); //this line can also be spring injected
		legacyCheck.setCheckPaymentData(checkPaymentData);		
		CheckPayment check = new LegacyCheckPaymentAdapter(legacyCheck);
		
		//These two lines of code gets activated when new implementation is used
		CheckPayment future_check = new CheckPayment();
		future_check.setCheckPaymentData(checkPaymentData); //this line can also be spring injected
		
		System.out.println("Create checks method:= " + check.createCheckPayment()); 
		System.out.println("Create checks method:= " + future_check.createCheckPayment());
	}
	
	
	private static CheckPaymentDataType createCheckPaymentData(){
		CheckPaymentDataType data = new CheckPaymentDataType();
		data.setBankAccountNumber("12345689");
		data.setBankName("Chase Bank");
		data.setCheckNumber("1111");
		return data;
	}
	
	
}
