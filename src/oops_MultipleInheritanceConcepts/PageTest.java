package oops_MultipleInheritanceConcepts;

public class PageTest {

	public static void main(String[] args) {
	
		LoginPage lp = new LoginPage();
		
		lp.doLogin();
		
		lp.getColor();
		
		CartPage cp = new CartPage();
		cp.getColor();
		
		cp.getPageLoadTimeOut();

	}

}
