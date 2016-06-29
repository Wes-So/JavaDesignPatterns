package core.designpatterns.flyweight;

 

public class SurefireImpl {

	public static void main(String[] args) {
		SubVendorCodeFactory factory = new SubVendorCodeFactory();
		String code = factory.getSubVendorCode("Lexis Nexis");
		System.out.println("Code retrieved:=" + code);
		
		code = factory.getSubVendorCode("SureFire");
		System.out.println("Code retrieved:=" + code);
		
		//This will not call DB service
		code = factory.getSubVendorCode("Lexis Nexis");
		System.out.println("Code retrieved:=" + code);

		
	}
	
}
