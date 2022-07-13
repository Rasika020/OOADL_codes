package i2.logic;

public class Product {
private String productName;
private double productPrice;
private double tax;
private double totalPrice;
private int quantity;
public Product(String productName,double productPrice, int quantity, double tax) {
	this.productName=productName;
	this.productPrice=productPrice;
	this.quantity=quantity;
	this.tax=tax;
}
public String getProductName() {
	return productName;
}
public double getProductPrice() {
	return productPrice;
}
public double getTax() {
	return computeTax();
}
public double getTotalPrice() {
	return computeTotalPrice();
}
public double computeTax() {
	double tax;
	tax=this.tax*productPrice;
	return tax;
}
public int getQuantity() {
	return quantity;
}

public double computeTotalPrice() {
	totalPrice=(productPrice+(tax*productPrice))*quantity;
	return totalPrice;
}
public void displayProductDetails() {
	System.out.println("Product Name : "+getProductName());
	System.out.println("Product Price: "+getProductPrice());
	System.out.println("Quantity     : "+getQuantity());
	System.out.println("Tax          : "+getTax());
	System.out.println("Total price  : "+getTotalPrice());
	System.out.println("===================================================");
}
}
