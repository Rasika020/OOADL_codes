package i2.logic;

public class Employee extends Person {
private double salary;
public Employee(String name,double salary) {
	super(name);
	this.salary=salary;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary=salary;
}
public void displayDetails() {
	System.out.println("Name of employee   : "+super.getName());
	System.out.println("Salary of Employee : "+getSalary());
	System.out.println("--------------------------------------------------------------------------------------");
}
}
