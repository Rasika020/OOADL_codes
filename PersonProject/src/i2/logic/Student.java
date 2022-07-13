package i2.logic;

public class Student extends Person{
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
	public void displayDetails() {
		System.out.println("Name of Student          : "+super.getName());
		System.out.println("Roll no of student       : "+getRollNo());
		System.out.println("Year of study of student : "+getYearOfStudy());
		System.out.println("--------------------------------------------------------------------------------------");
	}
}
