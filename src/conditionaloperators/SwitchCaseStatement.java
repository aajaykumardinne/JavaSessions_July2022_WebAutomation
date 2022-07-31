package conditionaloperators;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		
		// req : take the browser .... chrome/ff/safari/ie
		// if the condition is matched ... launch the browser
		// else print a mesg : please pass the right browser
		
		String browser = "microsoft edge";
		int timeOut = 20;
		boolean headless = true;
		
		// code will not be executed line by line in switch case
		// cross-browser logic 
		switch (browser) {
		case "chrome":
			System.out.println("launch the chrome");
			if(headless) {
				System.out.println("run the browser in headless mode");
			}
			if(timeOut==20) {
				System.out.println("please close the browser");
			}
			break;
		case "firefox":
			System.out.println("launch the firefox");
			break;
		case "internet explorer":
			System.out.println("launch the internet explorer");
			break;
		case "safari":
			System.out.println("launch the safari");
			break;
		default:
			System.out.println("please pass the right browser : " + browser);
			break;
			
		case "microsoft edge":
			System.out.println("launch the microsoft edge");
			break;
		
		}

		
		// Uses cases of switch case statement in Selenium
		// To perform the cross-browser logic
		// To Execute the code on Multiple environments : DEV/QA/STAGE/UAT/PROD
		// In locator strategy.
		
		
		// break can be used with loops and switch case
		// but not mandatory to write
		// break will break the entire switch case
		
		// break will come out of the entire switch-case statement
		// break can not be used in if and else if statements
		
		
		// purpose of deafult break
		
		// best practice is to write the break after switch case statement and default case
	}

}
