package i2.client;

import i2.logic.Bill;
import i2.logic.BulkDiscount;
import i2.logic.BuyNItemsGetOneFree;
import i2.logic.Item;
import i2.logic.LineItem;

public class DiscountMain {
public static void main(String[]args) {
	
	BulkDiscount bd=new BulkDiscount(3, 10);
	Item i=new Item("Notebook", 50);
	LineItem l=new LineItem(i, 6);
	Bill b=new Bill(l);
	i.setDiscountPolicy(bd);
	BuyNItemsGetOneFree bn=new BuyNItemsGetOneFree(3);
	i.setDiscountPolicy(bn);
	System.out.println("Discount by bulk discount: "+bd.computeDiscount(l.getItemCount(), i.getItemCost()));
	System.out.println("Discount by BuyNItemsGetOneFree: "+bn.computeDiscount(l.getItemCount(), i.getItemCost()));
	
	System.out.println("Net Amount: "+l.calculateNetPayableAmount());
	System.out.println("Net payable amount: "+b.calculateNetPayableAmount());
}
}
