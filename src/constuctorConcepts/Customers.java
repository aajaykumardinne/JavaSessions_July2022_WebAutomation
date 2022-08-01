package constuctorConcepts;

public class Customers {

	String name;
	int age;
	String city;
	/*
	 * phone is string we are not performing any arithmetic operations hence phoneno
	 * is not long data type
	 */
	String phoneNo;

	// Create customers with the different combinations
	// no default values types of customer;

	// this keyword is used to initialize the class variables
	// this refers to the current class object

	// difference between method and constructor
	// constructor -> to create the object and initialize the class variables
	// method -> to write the business logic
	
	

	public Customers(String name) {
		this.name = name;

	}

	public Customers(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Customers(String name, int age, String city, String phoneNo) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.phoneNo = phoneNo;
	}

	public static void main(String[] args) {

		Customers c1 = new Customers("amit");
		System.out.println(c1.name);

		Customers c2 = new Customers("ashok", 30);
		System.out.println(c2.name + " " + c2.age + " " + c2.city + " " + c2.phoneNo);

		Customers c3 = new Customers("venkhatesth", 29, "Ottawa", "8012453196");
		System.out.println(c3.name + " " + c3.age + " " + c3.city + " " + c3.phoneNo);
	}

}
