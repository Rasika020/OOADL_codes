package i2.client;

import i2.logic.*;

public class PersonMain {
public static void main(String[]args) {
	Person obj=new Person("Rasika");
	Student s=new Student("Rasika", 1,"Sy");
	Employee e=new Employee("Riya", 55, 2020);
	Doctor d=new Doctor("Dr.Esha", "Ophthalmologist", 500);
	Patient p=new Patient("Riddhi", 200);
	//Bill b=new Bill(p, d);
	//obj.displayName();
	s.displayStudentDetails();
	e.displayEmployeeDetails();
//	d.displayDoctorDetails();
//	p.displayPatientDetails();
//	b.displayBillDetails();
}
}
