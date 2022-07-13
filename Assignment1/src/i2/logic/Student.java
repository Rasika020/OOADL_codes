package i2.logic;

public class Student {
private int RollNo;
private String FirstName;
private String LastName;
private char Gender;
private double Percentage;

public Student(int r, String f, String l, char g, double p) {
	RollNo=r;
	FirstName=f;
	LastName=l;
	Gender=g;
	Percentage=p;
}
public double getPercentage() {
	return Percentage;
}
public void setPercentage(double percentage) {
	this.Percentage=percentage;
}
public int getRollno() {
	return RollNo;
}
public String getFirstName() {
	return FirstName;
}
public String getLastName() {
	return LastName;
}
public char getGender() {
	return Gender;
}
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	this.RollNo = rollNo;
}
public void setFirstName(String firstName) {
	this.FirstName = firstName;
}
public void setLastName(String lastName) {
	this.LastName = lastName;
}
public void setGender(char gender) {
	this.Gender = gender;
}
}


