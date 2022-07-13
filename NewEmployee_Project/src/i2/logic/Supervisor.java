package i2.logic;

public class Supervisor extends Employee {
private int basicSalary;
private double dAllowance;
private double tAllowance;
public void setDAllowance(double dAllowance){
	this.dAllowance=0.6*basicSalary;
}
public void setTAllowance(double tAllowance){
	this.tAllowance=0.3*basicSalary;
}
public Supervisor(String fName,String mName,String lName,int d,int m,int y,int dd,int mm,int yy,int basicSalary) {
	super(fName, mName, lName, d,m,y, dd,mm,yy);
	this.basicSalary=basicSalary;

}
public double calcTotalSalary() {
	return basicSalary+dAllowance+tAllowance;
}
}
