package conditionaloperators;

public class SwitchCaseAssignment {

	public static void main(String[] args) {

		// Question : Does switch case works with
		// byte,short,int,long,char,float,double,String
		// switch case not allowed for the long , float , double data types

		// switch case works with char
		// duplicate cases are not allowed
		// char holds the numeric type only hence switch case works with char
		char letter = 'i';
		switch (letter) {
		case 'a':
			System.out.println('a');
		case 'e':
			System.out.println('e');
		case 'i':
			System.out.println('i');
		case 'o':
			System.out.println('o');
		case 'u':
			System.out.println('u');

		default:
			break;
		}

		// it also works with byte
		byte b = -125;
		switch (b) {
		case -125:

			break;

		default:
			break;
		}

		// works with short also
		short s = 125;
		switch (s) {
		case 125:
			System.out.println("The number is : " + s);
			break;

		default:
			break;
		}

		// works with int also
		int amount = 1000;
		switch (amount) {
		case 1000:
			System.out.println("The amount is : " + amount);
			break;

		default:
			break;
		}

		// does not works with the long data type we need to convert to int
//		long l = 21324253464L;
//		switch (l) {
//		case 21324253464L:
//			
//			break;
//
//		default:
//			break;
//		}

		// conditional statement can not be given to the switch statement
//		int marks = 100;
//		switch (marks<100) {
//		case 100:
//			
//			break;
//
//		default:
//			break;
//		}

		// does not work with float data type
//		float percentage = 70.25f;
//		switch (percentage) {
//		case 70.25:
//			
//			break;
//
//		default:
//			break;
//		}

		// does not work with double data type
//		double d = 25.65;
//		switch (d) {
//		case 25.65:
//			
//			break;
//
//		default:
//			break;
//		}

		// does not work with boolean
//		boolean flag = true;
//		switch (flag) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

		// execute the code or test cases on multiple environments
		String envName = "Stage";
		switch (envName) {
		case "Dev":
			System.out.println("Running on the Dev environment");
			break;
		case "Qa":
			System.out.println("Running on the QA environment");
			break;
		case "Stage":
			System.out.println("Running on the Stage environment");
			break;
		case "UAT":
			System.out.println("Running on the UAT environment");
			break;
		case "Prod":
			System.out.println("Running on the Stage environment");
			break;
		default:
			System.out.println("Please pass the right environment... " + envName);
			break;
		}
	}

}
