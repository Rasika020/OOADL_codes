package i2.client;

import i2.logic.Student;

public class UseStudent {
public static void main(String[]args) {
	 Student student1=new Student(1,"Rasika","Devanhalli",'f',95.5);
	 Student student2=new Student(2,"Esha","Joshi",'f',93.5);
	 System.out.println("roll no: "+student1.getRollno());
	 System.out.println("first name: "+student1.getFirstName());
	 System.out.println("last name: "+student1.getLastName());
	 System.out.println("gender: "+student1.getGender());
	 System.out.println("percentage: "+student1.getPercentage());
	 System.out.println();
	 
	 System.out.println("roll no: "+student2.getRollno());
	 System.out.println("first name: "+student2.getFirstName());
	 System.out.println("last name: "+student2.getLastName());
	 System.out.println("gender: "+student2.getGender());
	 System.out.println("percentage: "+student2.getPercentage());
	 System.out.println();
}
}
