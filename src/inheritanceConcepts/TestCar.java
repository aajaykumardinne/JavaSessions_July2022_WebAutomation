package inheritanceConcepts;

public class TestCar {

	public static void main(String[] args) {
	
		final int i = 10;  // constant data

		
		
		
		BMW b = new BMW();
		
		b.start(); // overridden method
		
		b.stop();  // inherited method
		b.refuel(); // inherited method
		
		b.autoParking(); // individual method
		b.engine();  // inherited method
		System.out.println(b.speed);
		
		Car c = new Car();
		c.start();     // individual method
		c.stop();      // individual method
		c.refuel();    // individual method
		c.engine();    // inherited method
		
		
		
		// 1. Top/Up-casting : 
		// child class object can be referred by parent class reference variable.
		// with the help of top-casting we can access only inherited and overridden methods.
		// reference type check concept is applied for the individual methods
		Car c1 = new BMW();
		c1.start(); //BMW
		c1.stop();
		c1.refuel();
		c1.engine();
		
		
		// grand child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();
		
		// child class object can be referred by parent class reference variable.
		Vehicle v2 = new Car();
		v2.engine();
		
		// 2. Bottom/Down casting
		// parent class object can be referred by child class reference variable
		// allowed at the compile time 
		// throws ClassCastException at the run time
		
//		BMW B1 = (BMW)new Car(); // ClassCastException
//		B1.start();
		
		
//		Car c2 = (Car) new Vehicle(); //ClassCastException
//		c2.refuel();
		
		//priority will be given to the overridden methods
		// in case of top and down casting

	}

}
