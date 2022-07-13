package i2.client;
import i2.logic.*;
public class TestPerson {
public static void main(String[] args) {
		Student s=new Student("Rasika", 2622, "SY");
		s.displayDetails();
		Student s1=new Student("Riya", 2625, "SY");
		s1.displayDetails();
		Employee e=new Employee("Era", 100000);
		e.displayDetails();
		Employee e1=new Employee("Aarya", 50000);
		e1.displayDetails();
		System.out.println("Check if the employee name matches student name: "+e.checkName(s));
		System.out.println("Check if the employee name matches student name: "+e.checkName(s1));
		System.out.println("Check if the employee name matches student name: "+e1.checkName(s));
		System.out.println("Check if the employee name matches student name: "+e1.checkName(s1));
		System.out.println("--------------------------------------------------------------------------------------");
		

	}

}
