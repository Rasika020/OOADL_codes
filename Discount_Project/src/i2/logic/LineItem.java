package i2.logic;

public class LineItem {
private Item item;
private int itemCount;
private double netAmount;
public LineItem(Item item, int itemCount) {
	super();
	this.item=item;
	this.itemCount=itemCount;
}
public int getItemCount() {
	return itemCount;
}
public double calculateNetPayableAmount() {
	double totalAmount=this.item.getItemCost()*this.itemCount;
	double discount=this.item.getDiscountPolicy().computeDiscount(itemCount, item.getItemCost());
	netAmount=totalAmount-itemCount*discount;
	return netAmount;
}
}
