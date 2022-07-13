package i2.client;

import i2.logic.Train;
import i2.logic.Yard;

public class TestYardTrain {
public static void main(String[]args) {
	Yard yard=new Yard();
	Train t1=new Train("UP4053");
	Train t2=new Train("DN3021");
	Train t3=new Train("DN4067");
	Train t4=new Train("UP1025");
	Train t5=new Train("UP2024");
	Train tt=new Train("DN3768");//checking of this train status
	System.out.println("The trains present is the yard are: ");
	yard.addTrain(t1);
	yard.addTrain(t2);
	yard.addTrain(t3);
	yard.addTrain(t4);
	yard.addTrain(t5);
	
	yard.displayAllTrainDetails();
	System.out.println("================================================================================");
	
	yard.removeTrain(t4);
	yard.removeTrain(t5);
	System.out.println("The train t4 is present in the yard: "+yard.isTrainPresent(t4));
	System.out.println("The train t5 is present in the yard: "+yard.isTrainPresent(t5));
	System.out.println();
	System.out.println("The trains present is the yard are: ");
	yard.displayAllTrainDetails();
	System.out.println("================================================================================");
	System.out.println("The train [DN3768] is present in the yard: "+yard.isTrainPresent(tt));
	System.out.println();
	System.out.println("The trains present is the yard are: ");
	yard.displayAllTrainDetails();
	
}
}
