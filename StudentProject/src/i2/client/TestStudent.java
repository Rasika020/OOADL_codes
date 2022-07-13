package i2.client;
import i2.logic.Date;
import i2.logic.Student;


import java.util.ArrayList;
public class TestStudent {
public static void main(String[]args) {
	
	Date dateOfBirth=new Date(26,7,2002);
	Date dob=new Date(20,3,2002);
	Student obj=new Student(1, "Rasika", dateOfBirth);
	Student obj1=new Student(2, "Riya", dob);
	obj.displayStudentDetails();
	obj1.displayStudentDetails();
	ArrayList<Student>listOfStudents=new ArrayList<Student>();
	listOfStudents.add(obj);
	listOfStudents.add(obj1);
	System.out.println("**********************************************************************************************");
	System.out.println("Displaying using arraylist: \n");
	
	for(int i=0;i<listOfStudents.size();i++){
		listOfStudents.get(i).displayStudentDetails();
	}
	
	}


}
