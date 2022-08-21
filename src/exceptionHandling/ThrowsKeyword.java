package exceptionHandling;

public class ThrowsKeyword {

	public static void addToCart() {
		System.out.println("adding to cart");
		makePayment();
	}
	
	//throws keyword is used to throw the Exception
	//try catch block will handle the exception 
	//according to the method hierarchy 
	public static void generateOrderId() throws ArithmeticException{
		System.out.println("generateOrderId");
		int i = 10/0;
		
	}	
	
	public static void makePayment() {
		System.out.println("make payment");
		try {
			generateOrderId();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming");
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ThrowsKeyword.addToCart();
		
		System.out.println("bye");

	}

}
