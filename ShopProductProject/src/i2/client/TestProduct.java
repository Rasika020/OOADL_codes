package i2.client;
import i2.logic.*;
public class TestProduct {
	public static void main(String[] args) {
	System.out.println("****SHOP****");
	System.out.println("===================================================");
	System.out.println("Product 1");
	System.out.println("===================================================");
	Product p1=new Product("Notebook", 80, 3,0.05);
	
	p1.displayProductDetails();
	System.out.println("Product 2");
	System.out.println("===================================================");
	Product p2=new Product("Diary", 300, 1,0.05);
	
	p2.displayProductDetails();
	System.out.println("Product 3");
	System.out.println("===================================================");
	Product p3=new Product("Pencil", 20, 2,0.02);
	
	p3.displayProductDetails();
	System.out.println("Product 4");
	System.out.println("===================================================");
	Product p4=new Product("Erazer", 10, 2,0.02);

	p4.displayProductDetails();
	System.out.println("Product 5");
	System.out.println("===================================================");
	Product p5=new Product("File", 60, 3,0.12);
	
	p5.displayProductDetails();
	System.out.println("Product 6");
	System.out.println("===================================================");
	Product p6=new Product("Ball Pen", 10, 2,0.02);
	
	p6.displayProductDetails();
	Product[]p=new Product[6];
	p[0]=p1;
	p[1]=p2;
	p[2]=p3;
	p[3]=p4;
	p[4]=p5;
	p[5]=p6;
	Shop s=new Shop(p);
	s.displayShopDetails();
	}

}
