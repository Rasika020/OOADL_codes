package i2.client;

import i2.logic.CallRecord;
import i2.logic.Date;
import i2.logic.MobileBill;

public class TestMobileBill {
public static void main(String[]args) {
	Date d1=new Date(12,6,21);
	Date d2=new Date(13,6,21);
	
	CallRecord call=new CallRecord(12345672, 45, d1);
	CallRecord call1=new CallRecord(12345264, 76, d1);
	CallRecord call2=new CallRecord(12768785, 97, d2);
	CallRecord call3=new CallRecord(12345652, 49, d2);
	CallRecord call4=new CallRecord(12385672, 40, d2);
	MobileBill mob=new MobileBill("Myself",987898677, call,"September");
	
	mob.addCall(call);
	
	mob.addCall(call1);
	
	mob.addCall(call2);
	mob.addCall(call3);
	mob.addCall(call4);

	mob.displayAllCallDetails();
	
	

}
}
