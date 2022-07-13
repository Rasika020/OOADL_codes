package i2.logic;

public class Order {
private Item[] itemList=new Item[3];
private int orderNo;
private double total;
public Order(int orderNo,Item[]itemList) {
	this.itemList=itemList;
	this.orderNo=orderNo;
}
public int getOrderNo() {
	return orderNo;
}
public void setOrderNo(int orderNo) {
	this.orderNo=orderNo;
}
public Item[] getItemList() {
	return itemList;
}
public void setItemList(Item[] itemList) {
	this.itemList=itemList;
}
public double computeTotal() {
	for(int i=0;i<itemList.length;i++) {
		total=total+itemList[i].computeSubtotal();
	}
	return total;
}

}
