package i2.logic;

import java.util.Scanner;

public class Quiz {
	private int totalStudents;
	private int marksObtained[];
	private int maxMarks;
	
	
	public void addMarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		totalStudents=sc.nextInt();
		marksObtained=new int[totalStudents];// declaring array
		System.out.println("Enter the maximum marks of the quiz conducted: ");
		maxMarks=sc.nextInt();
		System.out.println("enter the marks obtained by the students: ");
		
		for(int i=0;i<marksObtained.length;i++) {
			marksObtained[i]=sc.nextInt();
		}
	   sc.close();
	}
	
	public void displayQuizDetails() {
		System.out.println("Total no of students attempted the quiz are : "+totalStudents);
		System.out.println("The maximum marks of the quiz are           : "+maxMarks);
	    
		System.out.println("The marks obtained by students are          : ");
		for(int i=0;i<marksObtained.length;i++) {
			System.out.println("Marks of "+(i+1)+" student are: ");
			System.out.println(marksObtained[i]);
		}
		
	}

}
