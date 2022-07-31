package conditionaloperators;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int  y = 250;
		int  z = 150;
		
		// the condition in the if statment will be executed 
		// if it is true
		// always it is good practice to write the else statement along with if
	
		// not mandatory for every if statement to have else statement
		
		if(y>=z) {
			System.out.println("both are equal numbers or y is greater than z");
		}
		else {
			System.out.println("both are not equal numbers");
		}
		
		// >= <= > <
		
		
		// Concept of Dead code
		if(20==30) { 
			//Dead code -- how many times you execute the code 
			// only particular statement will execute 
			// the other statement will not be executed.
			// dead code can be if or else based on the condition.
			// conditions will be dead hence called as dead code.
			// solution is create the variable and assign the value to it
			// which means the entire logic depends on variable
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		if(false) {
			System.out.println("Selenium");
		}
		else {
			System.out.println("Cypress");
		}
		
		boolean flag = true;
		if(flag) {
			System.out.println("Testing with Selenium");
		}
		else {
			System.out.println("Testing with Cypress");
		}
		
		// nested if 
		int total = 92;
		if(total <=100) {
			System.out.println("PASS");
			if(total >=90) {
				System.out.println("A Grade");
				if(total >=95) {
					System.out.println("100% discount");
				}
				else {
					System.out.println("70% discount");
				}
			}
			else {
				System.out.println("B Grade");
			}
		}
		else {
			System.out.println("Invalid");
		}
		
		// ==  is used to compare primitive data types
		// equals method is used to compare two strings.
		
		// req : take the browser .... chrome/ff/safari/ie
		// if the condition is matched ... launch the browser
		// else print a mesg : please pass the right browser
		
		//multiple if statement
		// problem -> performance issue, 
		// else statement is written wrt to last if statement
		// solution is use if else if statement
		
//		String browser = "safari";
//		if(browser.equals("chrome")) {
//			System.out.println("launch the chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch the firefox");
//		}
//		if(browser.equals("internet explorer")) {
//			System.out.println("launch the internet explorer");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch the safari");
//		}
//		else {
//			System.out.println("please pass the right browser......" + browser);
//		}
		
		// req : take the browser .... chrome/ff/safari/ie
		// if the condition is matched ... launch the browser
		// else print a mesg : please pass the right browser
		
		//if - else if statement
		// problem with last else if statement it will check all the conditions
		
		String browser = "safari";
		if(browser.equals("chrome")) {
			System.out.println("launch the chrome...");
			
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch the firefox..");
		}
		else if(browser.equals("internet explorer")) {
			System.out.println("launch the internet explorer...");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch the safari...");
		}
		else {
			System.out.println("please pass the right browser: " + browser);
		}
		
		
		
		
	}

}
