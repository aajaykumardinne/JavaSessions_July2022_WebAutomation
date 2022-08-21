package superKeyword;

public class Car {
	
	
	//super keyword use cases
//1. in order to access the parent class properties/vars in the child class.
//2. if you have overridden a method from parent to the child in order to access the parent class methods
//3. calling the parent class constructor from the child class make sure that super keyword is the first statement
// in the constructor

	
	int minSpeed = 100;
	
	//String color = "white";
	
	public void getMileage() {
		System.out.println("Car mileage is 15");
	}
	
	public String transmissionType() {
		return "Manual";
	}
	
	public Car() {
		System.out.println("default constructor");
	}
	
	public Car(int i) {
		System.out.println("one param  constructor: " + i);
	}
	
	public Car(int i, String p) {
		System.out.println("two param  constructor: " + i + " " + p);
	}
	
	
}
