package oops_abstract;

public class LoginPage extends Page {

	// hidden/default constructor
	// whenever an object is created then the constructor will be called.

	// JVM will call the hidden/default constructor at the run time
	// when the constructor of the class is not created.

	public LoginPage() {
	//	super();
		System.out.println("Login Page -- default constructor");
	//	super();
	}
	
	public LoginPage(int i) {
		System.out.println("Login Page constructor: " + i);
	}

	@Override
	public void title() {
		System.out.println("Login Page -- title");

	}

	@Override
	public void url() {
		System.out.println("Login Page -- url");

	}

	public void doLogin(String un, String password) {
		System.out.println("login with: " + un + ":" + password);
	}

	public void resetPwd() {
		System.out.println("Login Page -- reset password");
	}

}
