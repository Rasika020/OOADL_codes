package i2.logic;

import java.util.Scanner;

public class Muster {
private int totalFaculty;
private int attendanceLog[];
private int facultyPresent;

public void addAttendance() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total number of faculty: ");
	totalFaculty=sc.nextInt();
	
	System.out.println("enter the number of faculty present: ");
	facultyPresent=sc.nextInt();
	
	attendanceLog=new int[facultyPresent];
	
	System.out.println("enter the id of faculty those are present: ");
	for(int i=0;i<attendanceLog.length;i++) {
		attendanceLog[i]=sc.nextInt();
	}
	sc.close();
}
//display attendance details & total faculty members
public void display() {
	System.out.println("The total number of faculty is: "+totalFaculty);
	System.out.println("the no of faculty present is: "+facultyPresent);
	// attendance log will contain entries of present candidates only?
	System.out.println("The faculty present id is: ");
	for(int i=0;i<attendanceLog.length;i++) {
		System.out.println(attendanceLog[i]);
	}
	
}
}
