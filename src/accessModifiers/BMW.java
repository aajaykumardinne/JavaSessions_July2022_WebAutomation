package accessModifiers;

public class BMW extends Car{

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.name = "BMW Q5";     //public class vars
		b.price = 50;     // protected class vars
		b.mileage = 10;    //default class vars
		
		b.start();   //public class methods
		b.transmissionType();  //protected class methods
		b.stop();  //default class methods
		
		
		
	}

}
