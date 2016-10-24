package core.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SubVendorCodeFactory {
	private Map<String, String> subVendorMap = new HashMap<String,String>();
	
	public String getSubVendorCode(String subVendorDesc){
		String code = subVendorMap.get(subVendorDesc);
		if(code == null){
			code = retrieveFromDB(subVendorDesc);
			subVendorMap.put(subVendorDesc, code);
		}
		return subVendorMap.get(subVendorDesc);
	}
	
	private String retrieveFromDB(String subVendorDesc){
		System.out.println("Retrieving subVendorCode from DB");
		//simulates calling entity service to retrieve lookupValues
		if(subVendorDesc.equals("LexisNexis")){
			return "LN";
		} else {
			return "SF";	
		}
		 
	}
}
