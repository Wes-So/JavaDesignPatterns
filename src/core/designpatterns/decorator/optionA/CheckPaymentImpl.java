package core.designpatterns.decorator.optionA;

import core.designpatterns.data.ftx.CheckPaymentData;
import core.designpatterns.data.ftx.PaymentDueData;
import core.designpatterns.data.ftx.PaymentPlanData;

public class CheckPaymentImpl implements CheckPayment {
 
	@Override
	public void create(CheckPaymentData data) { 
		System.out.println("Processing FTX Entity: Check Payment");
  	} 


}
