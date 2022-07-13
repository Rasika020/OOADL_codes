package i2.logic;

import java.util.ArrayList;

public class Yard {
	//declaration and initialization of arraylist
	private ArrayList<Train>listofTrains=new ArrayList<Train>();
	
	public void addTrain(Train t) {
		this.listofTrains.add(t);
	}
	public void removeTrain(Train t) {
		this.listofTrains.remove(t);
	}
	public void displayAllTrainDetails() {
		for(int i=0;i<listofTrains.size();i++) {
			Train t=listofTrains.get(i); 
			listofTrains.get(i).displayDetails();
			 System.out.println(isTrainPresent(t));
			
		}
	}
	public boolean isTrainPresent(Train t) {
		return listofTrains.contains(t);
	}
	

}
