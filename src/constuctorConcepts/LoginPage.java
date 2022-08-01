package constuctorConcepts;

public class LoginPage {

	
	String username;
	String password;

	/*
	 * username and password are called the local variables in 
	 * this constructor
	 */
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public LoginPage(String username) {
		this.username = username;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("enter the username: " + un);
		System.out.println("enter the password: " + pwd);
		System.out.println("click on the button");
		System.out.println("successfully login completed");
	}
	
	public void doLogin(String un) {
		System.out.println("enter the username: " + un);
		System.out.println("click on the button");
		System.out.println("successfully login completed");
		
	}

	public static void main(String[] args) {
		
		LoginPage user1 = new LoginPage("admin", "Admin456");
		user1.doLogin(user1.username, user1.password);
		
		// for the seller 
		LoginPage user2 = new LoginPage("seller", "Seller 891");
		user2.doLogin(user2.username, user2.password);
		
		// for the developer 
		LoginPage user3 = new LoginPage("Developer");
		user3.doLogin(user3.username);
		

	}

}
