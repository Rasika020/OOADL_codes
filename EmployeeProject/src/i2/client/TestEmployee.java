package i2.client;

import java.util.ArrayList;

import i2.logic.Date;
import i2.logic.Employee;    
import i2.logic.Name;

public class TestEmployee {
public static void main(String args[]){
	ArrayList<Employee>arr=new ArrayList<Employee>();
	
	System.out.println("*****EMPLOYEE DETAILS*****\n");
	Date doj=new Date(26, 07, 2010);
	Date dob=new Date(28, 06, 1986);
	Employee e1=new Employee("Rasika", "Lalit", "Devanhalli",doj,dob);
	arr.add(e1);
	e1.displayEmployeeDetails();
	
	
	Date doj2=new Date(26, 07, 2010);
	Date dob2=new Date(28, 06, 1985);
	Employee e2=new Employee("Ananya", "suyash", "Deshpande",doj2,dob2);
	
	arr.add(e2);
	
	e2.displayEmployeeDetails();
	
}
}
