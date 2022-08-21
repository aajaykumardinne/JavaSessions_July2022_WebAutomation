package accessModifiers;

public class Truck {

	public static void main(String[] args) {
		
		Car  c1  = new Car();
		
		c1.name = "Tata Rs";  //public class vars
		c1.price = 35;        // protected class vars
		c1.mileage = 12;      //default class vars
		
		c1.start();   //public class methods
		c1.transmissionType(); //protected class methods
		c1.stop();  //default class methods
		

	}

}
