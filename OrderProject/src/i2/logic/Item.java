package i2.logic;

public class Item {
private int itemCode;
private int quantity;
private double price;
private double subTotal;
public Item(int itemCode, int quantity,double price) {
	this.itemCode=itemCode;
	this.quantity=quantity;
	this.price=price;
}
public int getItemCode() {
	return itemCode;
}
public void setItemCode(int itemCode) {
	this.itemCode=itemCode;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity=quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price=price;
}
public double getSubTotal() {
	return subTotal;
}
public void setSubTotal(double subTotal) {
	this.subTotal=subTotal;
}
public double computeSubtotal() {
 
 this.subTotal=getQuantity()*getPrice();
 return this.subTotal;
}
}
