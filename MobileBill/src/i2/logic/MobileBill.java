package i2.logic;

import java.util.ArrayList;

public class MobileBill {
private String Name;
private String billMonth;
private long phoneNo;
private int totalDuration;
private ArrayList<CallRecord>listOfCallRecords;

public MobileBill(String Name,long phoneNo,CallRecord callRecord,String billMonth) {
	
	this.Name=Name;
	this.phoneNo=phoneNo;
	this.billMonth=billMonth;
	this.listOfCallRecords=new ArrayList<CallRecord>();
	
}
public void addCall(CallRecord c) {
	this.listOfCallRecords.add(c);
}


public void displayAllCallDetails() {
	System.out.println("The name is: "+Name);
	System.out.println("The phone no is: "+phoneNo);
	System.out.println("The bill month is: "+billMonth);
	
	System.out.println("Date"+"\t"+"        Receiver's No"+"\t"+"        Call Duration");
	System.out.println("_____________________________________________________________");
	for(int i=0;i<listOfCallRecords.size();i++) {
		listOfCallRecords.get(i); 
		listOfCallRecords.get(i).displayCallRecord();
		totalDuration=totalDuration+listOfCallRecords.get(i).getDuration();
	}
	System.out.println("_____________________________________________________________");
	System.out.println("total calls: "+listOfCallRecords.size());
	System.out.println("total call duration: "+totalDuration+" sec");
	
}

}
