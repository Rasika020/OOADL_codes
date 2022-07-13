package i2.logic;

public class DailyWageEmployee extends Employee{
	private int dailyWage;
	private int workingHours;
    public DailyWageEmployee(String fName,String mName,String lName,int d,int m,int y,int dd,int mm,int yy,int dailyWage,int workingHours) {
	super(fName, mName, lName,d,m,y, dd,mm,yy);
	this.dailyWage=dailyWage;
	this.workingHours=workingHours;
}
public double calcTotalSalary() {
	return (dailyWage*workingHours);
}



}
