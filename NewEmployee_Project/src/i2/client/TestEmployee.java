package i2.client;
import i2.logic.*;
public class TestEmployee {

	public static void main(String[] args) {

		System.out.println("****DAILY WAGE EMPLOYEE****\n");
		
		DailyWageEmployee dwe=new DailyWageEmployee("Xa", "yb","Zc", 30,8,2020, 20, 7, 1986, 180, 96);
		dwe.displayEmployeeDetails();
		
		System.out.println("****SUPERVISOR****\n");
		
		Supervisor se=new Supervisor("X", "y", "Z", 30,8,2020, 20, 7, 1986, 103876);
		se.displayEmployeeDetails();

	}

}
