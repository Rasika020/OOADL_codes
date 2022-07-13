package i2.client;
import i2.logic.*;
public class TestOrder {
public static void main(String args[]) {
	Item[]list=new Item[3];
	
	Order o=new Order(1, list);
	System.out.println("Order No : "+o.getOrderNo());
	System.out.println("=================================================");
	System.out.println("****ITEM 1*****");
	System.out.println("=================================================");
	Item i1=new Item(2601, 5, 50);
	System.out.println("Item code: "+i1.getItemCode());
	System.out.println("Quantity : "+i1.getQuantity());
	System.out.println("Price    : "+i1.getPrice());
	System.out.println("Sub Total: "+i1.computeSubtotal());
	System.out.println("=================================================");
	System.out.println("****ITEM 2*****");
	System.out.println("=================================================");
	Item i2=new Item(2602, 3, 10);
	System.out.println("Item code: "+i2.getItemCode());
	System.out.println("Quantity : "+i2.getQuantity());
	System.out.println("Price    : "+i2.getPrice());
	System.out.println("Sub Total: "+i2.computeSubtotal());
	System.out.println("=================================================");
	System.out.println("****ITEM 3*****");
	System.out.println("=================================================");
	Item i3=new Item(2603, 5, 50);
	System.out.println("Item code: "+i3.getItemCode());
	System.out.println("Quantity : "+i3.getQuantity());
	System.out.println("Price    : "+i3.getPrice());
	System.out.println("Sub Total: "+i3.computeSubtotal());
	System.out.println("=================================================");
	System.out.println("****Grand total****");
	System.out.println("=================================================");
	list[0]=i1;
	list[1]=i2;
	list[2]=i3;
	System.out.println("Grand total: "+o.computeTotal());
	System.out.println("=================================================");
	
}
}
