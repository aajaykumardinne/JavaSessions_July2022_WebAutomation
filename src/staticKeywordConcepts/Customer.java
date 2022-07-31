package staticKeywordConcepts;

/**
 * Static Methods Concept
 * @author dinne
 *
 */
public class Customer {
	
	/**
	 * if you are designing an application for the 
	 * particular company
	 */
	String name;
	//all have of the customers will be working in the same company
	static String compName="Blinkit";
	int age;
	
	public void sendMail() {
		System.out.println("send mail");
	}
	
	public static int getInfo() {
		System.out.println("get info");
		return 100;
	}
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.name = "Shefali";
		c.age = 35;
		
		System.out.println(c.name + " " + c.age + " " + Customer.compName);
		System.out.println(compName);
		
		// how to access the static methods
		// 1. By classname - best practice
		// if you want to access the static method in the
		// different class
		Customer.getInfo();
		
		// 2. by direct calling -> if you want to access the static method
		// in the same class
		getInfo(); 
		
		// 3. using the object ref?
	//	c.getInfo(); // yellow warning -> not a good practice
		
		// how to access the non-static methods
		// have to create the object
		
		c.sendMail();
		
		

	}
	
	public static void main(int a) {
		
	}

}
