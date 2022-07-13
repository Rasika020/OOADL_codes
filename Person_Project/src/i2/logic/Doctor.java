package i2.logic;

public class Doctor extends Person{
private String speciality;
private int visitFee;

public Doctor(String Name, String speciality, int visitFee) {
	super(Name);
	this.speciality=speciality;
	this.visitFee=visitFee;
}
public String getSpeciality() {
	return speciality;
}
public int getVisitFee() {
	return visitFee;
}
public void displayDoctorDetails() {
	System.out.println("The name of doctor is       : "+super.getName());
	System.out.println("The speciality of doctor is : "+getSpeciality());
	System.out.println("The visit fee of doctor is  : Rs. "+getVisitFee());
	System.out.println("--------------------------------------------------------------------------------------");
}
}
