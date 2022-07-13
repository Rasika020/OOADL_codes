package i2.logic;
import java.util.ArrayList;
public class Student {
private int rollNo;
private String name;

private Date dateOfBirth=new Date(0,0,0);


public Student(int rollNo,String name,Date dateOfBirth) {
	this.rollNo=rollNo;
	this.name=name;
	this.dateOfBirth=dateOfBirth;
}
public void displayStudentDetails() {
	System.out.println("the roll no of Student is      : "+rollNo);
	System.out.println("the name of student is         : "+name);
	System.out.print("the date of birth of student is: ");
	
	dateOfBirth.displayDate();
	
}


}
