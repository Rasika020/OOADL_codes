package i2.logic;

public class Date {
private int day;
private int month;
private int year;
public Date(int day,int month, int year){
	this.day=day;
	this.month=month;
	this.year=year;
	
}
public int getDay(){
	return this.day;
}
public int getMonth(){
	return this.month;
}
public int getYear(){
	return this.year;
}
public void displayDate(){
	System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
}
	
}