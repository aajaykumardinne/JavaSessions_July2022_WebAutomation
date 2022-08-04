package encapsulationConcepts;

public class LoginPage {

	private String username;
	private String password;

	// cons
	// when no constructor is defined hidden constructor is present

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// getter and setter methods
	// used to access the private class vars
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin() {
		System.out.println("enter the username: " + username);
		System.out.println("enter the password: " + password);
		System.out.println("successfully login");

	}

}
