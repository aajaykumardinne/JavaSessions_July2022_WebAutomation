package oops_abstract;

public class TestPage {

	public static void main(String[] args) {
		
		
		LoginPage lp = new LoginPage(10);
		
		//inherited methods
		lp.displayLogo();   
		lp.timeOut();
		
		//overridden methods
		lp.title();
		lp.url();
		
		//individual methods	
		lp.resetPwd();
		lp.doLogin("aajay", "automatioqa@gmail.com");
		
		//top/up casting
		//child class object can be referred by abstract parent class reference name
		Page p1	= new LoginPage();
		
		p1.displayLogo();
		p1.timeOut();
		
		p1.title();
		p1.url();
		
		// p1 can not access individual methods present in child class
		// because reference type check is failed.
		
		// bottom/down casting
	//	new Page();
		
		
	}

}
