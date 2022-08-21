package oops_MultipleInheritanceConcepts;

public class LoginPage extends Page{
	
	@Override
	public void getColor() {
		System.out.println("LoginPage -- Orange Color");
	}

	
	public void doLogin() {
		System.out.println("do Login");
	}
}
