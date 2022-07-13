package i2.logic;

public class BulkDiscount extends DiscountPolicy {
private int minimum;
private double percent;

public BulkDiscount(int min, double per) {
    super();
	this.minimum=min;
	this.percent=per;
}
public double computeDiscount(int count, double itemCost) {
	if(count>=this.minimum) {
		return((this.percent*itemCost)/100);
	}
	else
		return 0;
	
}
}
