package i2.logic;

public class Person {
private String Name;
public Person(String Name) {
	super();
	this.Name=Name;
	
}
public String getName() {
	
	return Name;
}
public void displayName() {
	System.out.println("The name is: "+getName());
	System.out.println("--------------------------------------------------------------------------------------");
}
}
