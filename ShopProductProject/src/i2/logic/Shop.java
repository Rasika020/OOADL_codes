package i2.logic;

public class Shop {
private Product[] product=new Product[6];
private double totalInvestment;
public Shop(Product[]product) {
	for(int i=0;i<product.length;i++) {
		this.product[i]=product[i];
	}
}
public double computeTotalInvestment() {
	for(int i=0;i<product.length;i++) {
		totalInvestment=totalInvestment+(product[i].getTotalPrice());
	}
	return totalInvestment;
}
public double getTotalInvestment() {
	return computeTotalInvestment();
}
public void displayShopDetails() {
	System.out.println("Total Investment:"+getTotalInvestment());
	System.out.println("===================================================");
}

}
