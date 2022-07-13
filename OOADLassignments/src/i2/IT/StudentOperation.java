package i2.IT;
import java.util.Scanner;
public class StudentOperation {
private static int rollNo=100;
private double average;
private int marks[]=new int[5];

public StudentOperation() {
	super();
	rollNo++;
	
}
public void Entermarks() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks of 5 subjects of Roll no. "+getRollNo()+" : ");
	for(int i=0;i<marks.length;i++) {
		marks[i]=sc.nextInt();
	}
	sc.close();
}
public double CalculateAverage() {
	int sum=0;
	
	for(int i=0;i<marks.length;i++) {
		sum=sum+marks[i];
	}
	average=sum/marks.length;
	return average;
}
public double getAverage() {
	
	return CalculateAverage();
}
public int getRollNo() {
	return rollNo;
}
public void displayStudentDetails() {
	System.out.println("Roll no: "+getRollNo());
	System.out.println("Average: "+getAverage());
	
}
}

