package i2.logic;

public class Student extends Person {

private int rollNo;
private String yearOfStudy;

public Student(String Name, int rollNo, String yearOfStudy ) {
	super(Name);
	this.rollNo=rollNo;
	this.yearOfStudy=yearOfStudy;
}


public int getRollNo() {
	return rollNo;
}
public String getYearOfStudy() {
	return yearOfStudy;
}
public void displayStudentDetails() {
	System.out.println("The name of student is          : "+super.getName());
	System.out.println("The roll no of student is       : "+getRollNo());
	System.out.println("The year of study of student is : "+getYearOfStudy());
	System.out.println("--------------------------------------------------------------------------------------");
}
}
