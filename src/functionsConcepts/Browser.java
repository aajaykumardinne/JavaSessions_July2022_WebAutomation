package functionsConcepts;

public class Browser {

	// Main method can not return any thing
	// hence it is always void

	// method is the part of the class body

	// can the return value of the one method be passed as
	// arguments to the other methods -> yes we can by method chaining concept

	// can we return class object from the functions -> entire page object model
	// on this concept

	// parallel execution of the test cases is done by TestNg

	public static void main(String[] args) {

		Browser obj = new Browser();
		boolean flag = obj.launchBrowser("CHROME");

		System.out.println(flag);
		if (flag) {
			System.out.println("https:www.amazon.com");
		}

	}

	// cross-browser logic
	// WAF : launch a browser : FF/Chrome/Safari
	// param : browser name
	// return : boolean : true/false
	
	// return act as the break statement in this example

	public boolean launchBrowser(String browserName) {

		System.out.println("Launching browser: " + browserName);

		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("chorme is launched....");
			return true;
		case "firefox":
			System.out.println("firefox is launched....");
			return true;
		case "safari":
			System.out.println("chorme is launched....");
			return true;

		default:
			System.out.println("please pass the right browser: " + browserName);
			return false;

		}

	}

}
