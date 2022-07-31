package staticKeywordConcepts;

/**
 * Static variables concept
 * @author dinne
 *
 */
public class CarType {

	String name;
	int price;
	String plateNumber;
	static int wheels = 4;

	public static void main(String[] args) {

		CarType c1 = new CarType();
		c1.name = "Toyota";
		c1.price = 1500000;
		c1.plateNumber = "TS33BN1260";

		CarType c2 = new CarType();
		c2.name = "Hyundai";
		c2.price = 1000000;
		c2.plateNumber = "TS12UH5394";

		CarType c3 = new CarType();
		c3.name = "Honda";
		c3.price = 1400000;
		c3.plateNumber = "TS19YV7027";

		// common properties are declared as static variables
		// hence wheels are declared as static

		// how to access static variables
		// 1. By classname
		// when you want to access the static variables
		// in the different class
		System.out.println(CarType.wheels);

		// 2. direct access :
		// when you want to access the static variables
		// in the same class
		System.out.println(wheels);

		// 3. can I access the static variable using object ref name?
		// yes we can -> but not recommended
		System.out.println(c2.wheels);
		
		

	}

}
