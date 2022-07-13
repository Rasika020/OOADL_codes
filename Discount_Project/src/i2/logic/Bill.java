package i2.logic;

public class Bill {
private LineItem lineItem;
public Bill(LineItem lineItem) {
	this.lineItem=lineItem;
}
public double calculateNetPayableAmount() {
	double netAmount=this.lineItem.calculateNetPayableAmount();
	return netAmount;
}

}
