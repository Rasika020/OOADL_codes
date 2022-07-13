package i2.logic;

public class Student {
private int rollNo;
private String firstName;
private String lastName;
private char gender;
private double percentage;

public Student(int r, String f, String l, char g, double p) {
	rollNo=r;
	firstName=f;
	lastName=l;
	gender=g;
	percentage=p;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage=percentage;
}
public int getRollno() {
	return rollNo;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public char getGender() {
	return gender;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setGender(char gender) {
	this.gender = gender;
}
}

