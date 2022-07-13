package i2.logic;

public class Bill {
private static int billNumGenerator	= 1;
private int billNo;
private int billAmt;
private Patient patient;
private Doctor doctor;

public Bill(Patient patient, Doctor doctor) {
	this.doctor=doctor;
	this.billNo=billNumGenerator;
	this.billAmt=this.doctor.getVisitFee();
	this.patient=patient;
	billNumGenerator++;
}
public void displayBillDetails() {
	System.out.println("----Welcome to Dr.Esha's eye clinic------");
	System.out.println("----Bill Details-----");
	System.out.println("Bill number    : "+billNo);
	System.out.println("Patient's name : "+patient.getName());
	System.out.println("Doctor's name  : "+doctor.getName());
	System.out.println("Bill Amount    : Rs."+billAmt);
	System.out.println("----Thanks for visiting----");
}
}
