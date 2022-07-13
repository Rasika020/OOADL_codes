package i2.logic;

public class Patient extends Person {
private int patientId;

public Patient(String Name, int patientId) {
	super(Name);
	this.patientId=patientId;
}
public int getPatientId() {
	return patientId;
}
public void displayPatientDetails() {
	System.out.println("The name of patient is: "+super.getName());
	System.out.println("The Id of patient is  : "+getPatientId());
	System.out.println("--------------------------------------------------------------------------------------");
}
}
