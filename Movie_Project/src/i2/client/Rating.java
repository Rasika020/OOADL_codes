package i2.client;

import java.util.Scanner;

public class Rating {
	private int userRating[]=new int[5];
    int n=0;

    public Rating(){

    }
    public void acceptRating(){

    Scanner sc=new Scanner(System.in);
    System.out.println("***Accept rating***");
    for(int i=0;i<userRating.length;i++) {
   	 System.out.println("Enter no of users who rated movie as "+(n+1));
    userRating[i]=sc.nextInt();
    n++;
    }
    System.out.println("=======================================");

    }
    public double calculateAverageRating(){
    double sum=0;
    double average;
    for(int i=0;i<userRating.length;i++){
    sum=sum+userRating[i];
    }
    int count=1*userRating[0]+2*userRating[1]+3*userRating[2]+4*userRating[3]+5*userRating[4];
     
    average=count/sum;
   
    return average;
}
}

