package builderPatternsConcepts;

public class Ecomm {

	// this keyword refers to the current class object
	
	// this keyword
	// 1. used in the constructor to initialize the class vars
	// 2. in the method
	// 3. in the builder pattern
	
	public Ecomm doLogin() {
		System.out.println("login into the ap");
		return this;
	}
	
	public Ecomm doLogin(String username , String password) {
		System.out.println("login into app: " + username + ":" + password);
		return this;
	}
	
	
	public Ecomm doSearch() {
		System.out.println("search with all the products");
		return this;
	}
	
	
	public Ecomm doSearch(String productName) {
		System.out.println("search for the : " + productName);
		return this;
	}
	
	
	public Ecomm selectProduct(String productNameDisplayed) {
		System.out.println("select the product: " + productNameDisplayed);
		return this;
	}
	
	public Ecomm addToCart(String name) {
		System.out.println("add to cart: " + name);
		return this;
	}
	
	public Ecomm makePayment(String cc, int cvv) {
		System.out.println("make payment with: " + cc + ":" + cvv);
		return this;
	}
	
	public Ecomm makePayment(String cc, int cvv, int otp) {
		System.out.println("make payment with: " + cc + ":" + cvv + ":" +otp);
		return this;
	}
	
	public Ecomm makePayment(String upi) {
		System.out.println("make payment with: " + upi);
		return this;
	}
	
	
	public Ecomm generateOrder() {
		System.out.println("Order is done , your order id is: " + 1289);
		return this;
	}
	
	
	public Ecomm logout() {
		System.out.println("logout");
		return this;
	}
}
