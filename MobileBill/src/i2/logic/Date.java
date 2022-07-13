package i2.logic;

public class Date {
private int day;
private int month;
private int year;
public Date(int day,int month,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
}
public void setDay(int day) {
	this.day=day;
}
public int getDay() {
	return day;
}
public void displayDate() {
	System.out.print(day+"/"+month+"/"+year);
	
	
}
}
