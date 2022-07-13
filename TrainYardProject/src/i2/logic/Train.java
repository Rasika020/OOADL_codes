package i2.logic;

public class Train {
      private String trainNo;

      public Train(String tNo) {
	this.trainNo =tNo;
}

      public void displayDetails() {
	System.out.println("Train No: "+this.trainNo);
	
}
}
