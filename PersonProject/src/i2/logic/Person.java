package i2.logic;

public abstract class Person {
private String name;
public Person(String name) {
	super();
	this.name=name;
	
}
public String getName() {
	return name;
}
public void setName(String Name) {
	this.name=Name;
}
public boolean checkName(Person other) {
	return this.name.equalsIgnoreCase(other.name);
}
public abstract void displayDetails();
}
