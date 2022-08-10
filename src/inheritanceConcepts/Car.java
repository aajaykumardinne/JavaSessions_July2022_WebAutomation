package inheritanceConcepts;

public class Car extends Vehicle{

	int speed = 100;
	
	// final keyword
	// 1. to prevent the method overriding -> declare method as final
	// 2. to prevent the inheritance -> declare the class a final
	// 3. to provide the constant data
	
	// use cases of the final keyword in selenium
	// 1. page title
	// 2. page url
	// 3. default time out
	// 4. image url
	
	// use cases of the final keyword
	// 1. days in a week
	// 2. months in a year
	
	
	// final applicable for the class vars and methods
	
	// can not override the private methods
	
	// can not override the static methods
	
	//Car class methods
	public void start() {
		System.out.println("car - start");
	}
	
	public void refuel() {
		System.out.println("car - refuel");
	}
	public void stop() {
		System.out.println("car - stop");
	}
	
	public static void billing() {
		System.out.println("Car -- billing");
	}
}
