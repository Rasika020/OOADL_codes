package i2.logic;

public class BuyNItemsGetOneFree extends DiscountPolicy {
private int n;

public BuyNItemsGetOneFree(int n){
	super();
	this.n=n;
}
public double computeDiscount(int count, double itemCost) {
	
	return (((count/n)*10)*itemCost)/100;
	
}
}
