package i2.logic;

public class CallRecord {
private long receiverNo;
private int callDuration;
private Date dateOfCall;


public CallRecord(long receiverNo,int callDuration,Date dateOfCall) {
	this.receiverNo=receiverNo;
	this.callDuration=callDuration;
	this.dateOfCall=dateOfCall;
}
public void setDuration(int callDuration) {
	this.callDuration=callDuration;
}
public int getDuration() {
	return callDuration;
}

public void displayCallRecord() {
	dateOfCall.displayDate();
	
	System.out.print("\t\t" +receiverNo+ "\t\t\t" +callDuration );
	System.out.println();
	//System.out.println(totalCallDuration(callDuration));
	
	
}

}
