package i2.logic;

public class Employee {
	private static int employeeID=2600;
    private Name name;
    private Date dateOfJoining;
    private Date dateOfBirth;
    private Date dateOfRetirement;

public Employee(String fName,String mName,String lName,Date dateOfJoining,Date dateOfBirth){
	name=new Name(fName, mName, lName);
	this.dateOfJoining=dateOfJoining;
	this.dateOfBirth=dateOfBirth;
	
	this.dateOfRetirement=computeDateOfRetirement();
	this.employeeID=employeeID;
	employeeID++;
	
}
public Date computeDateOfRetirement() {
	int day;
	int month;
	int year;
	day=dateOfBirth.getDay();
	month=dateOfBirth.getMonth();
	year=dateOfBirth.getYear()+60;
	dateOfRetirement=new Date(day, month, year);
	
	return dateOfRetirement;
}


public void displayEmployeeDetails(){
	
	System.out.println("Employee ID: "+this.employeeID);
	name.displayFirstName();
	name.displayMidName();
	name.displayLastName();
	name.displayFullName();
	System.out.print("Date of Joining: ");
	dateOfJoining.displayDate();
	System.out.print("Date of Retirement: ");
	dateOfRetirement.displayDate();
	
	System.out.println("=============================================");
	
}
}
