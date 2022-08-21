package accessModifiers;

//class can only be abstract,final and public
//can not be private,protected
public class Car {

	//class vars
	public String name;
	private String color;
	protected int price;
	int mileage;
	
	//class methods
	public void start() {
		System.out.println("Car -- start");
	}
	
	protected void transmissionType() {
		System.out.println("Car -- transmissionType");
	}
	
	private void refuel() {
		System.out.println("Car -- refuel");
	}
	
	void stop() {
		System.out.println("Car -- stop");
	}
	
	//Access modifiers is applied to class vars and class methods
	
	public static void main(String[] args) {
		
		final int i = 10;
		
		Car c = new Car();
		c.name = "honda";     //public class vars
		c.price = 15;         // protected class vars
		c.mileage = 25;      //default class vars
		c.color = "white";   //private class vars
		
		
		c.start();     // public class method
		c.transmissionType();  //protected class method
		c.refuel();   //private class method
		c.stop();     //default class method
		
		
		

	}

}
