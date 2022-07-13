package i2.logic;

public class Employee extends Person {

private int employeeId;
private int yearOfJoining;

public Employee(String Name,int employeeId, int yearOfJoining) {
	super(Name);
	
	this.employeeId=employeeId;
	this.yearOfJoining=yearOfJoining;
}

public int getEmployeeId() {
	return employeeId;
}
public int getYearOfJoining() {
	return yearOfJoining;
}
public void displayEmployeeDetails() {
	System.out.println("The name of Employee is            : "+super.getName());
	System.out.println("The id of Employee is              : "+getEmployeeId());
	System.out.println("The year of joining of employee is : "+getYearOfJoining());
	System.out.println("--------------------------------------------------------------------------------------");
}
}
