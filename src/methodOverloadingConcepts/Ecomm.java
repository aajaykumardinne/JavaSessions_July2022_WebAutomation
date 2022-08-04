package methodOverloadingConcepts;

public class Ecomm {

	// duplicate methods are not allowed inside a same class.

	// MethodOverloading:compile/static Time Poly(many) + Poly(forms)
	// Return type does not matter in Method overloading
	// Within the same class: when you have methods
	// 1. same name
	// 2. different number of the method parameters
	// 3. different types of the method parameters
	// 4. the sequences of the parameters should also be different.
	
	// Why it is imp?? Answer: user friendly design
	// ease to read the code
	// for the maintenance of view also.
	
	// we will always the the object of the class for the classes.

	// Polymorphism means method overloading and method overriding.

	// MethodOverloading called as compile/static TimePolymorphism.
	// Methodoveriding called as Run TimePolymorphism.

	public void test() { // 0 parameter

	}

	public int test(int i) { // 1 parameter

		return 10 + i;

	}

	// feature -> business -> PO -> method overloading
	public void test(String i) { // 1 parameter

	}

	public void test(int k, String i) { // 2 parameter

	}

	public void test(String i, int k) { // 2 parameter

	}

	// Good Example of Method overloading

	// 1. login into the ecommerce application

	public void doLogin() {

	}

	public void doLogin(String username, String password) {

	}

	public void doLogin(String username, String password, int otp) {

	}

	public void doLogin(String username, String password, String role) {

	}

	// 2. search in the ecommerce application

	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, String color) {

	}

	public void search(String productName, String color, int price) {

	}

	// payment feature

	public void payment(String upi) {

	}

	public void payment(String CC, int CVV, int otp) {

	}

	public void payment(String paypalId, String pwd) {

	}

	// booking a cab

	public void booking(String sp, String dp) {

	}

	public void booking(String sp, String dp, String carType) {

	}

	public void booking(String sp, String dp, String carType,String couponCode) {

	}

	public static void main(String[] args) {

		Ecomm obj = new Ecomm();

		int sum = obj.test(10);
		System.out.println(sum);
		
		obj.booking("ameerpet", "lbnagar", "suv", "aajay12");

	}

}
