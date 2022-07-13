package i2.logic;

public class Name {
private String fName;
private String mName;
private String lName;

public Name(String fname,String mName,String lName){
	this.fName=fname;
	this.mName=mName;
	this.lName=lName;
}

public void displayFirstName(){
	System.out.println("First Name        : "+this.fName);
}
public void displayMidName(){
	System.out.println("Mid Name          : "+this.mName);
}
public void displayLastName(){
	System.out.println("Last Name         : "+this.lName);
}
public void displayFullName(){
	System.out.println("Full Name         : "+this.fName+"."+this.mName.substring(0, 1).toUpperCase()+"."+this.lName);
}
}