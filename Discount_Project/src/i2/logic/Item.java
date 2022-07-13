package i2.logic;

public class Item {
private String itemName;
private double itemCost;
private DiscountPolicy dp;
public Item(String itemName,int itemCost) {
	super();
	this.itemName=itemName;
	this.itemCost=itemCost;
}
public String getItemName() {
	return itemName;
}
public double getItemCost() {
	return itemCost;
}
public DiscountPolicy getDiscountPolicy() {
	return dp;
}
public void setDiscountPolicy(DiscountPolicy dp) {
	this.dp=dp;
}
public void displayItemDetails() {
	System.out.println("Item Name: "+getItemName());
	System.out.println("Item Cost: "+getItemCost());
	
}

}
