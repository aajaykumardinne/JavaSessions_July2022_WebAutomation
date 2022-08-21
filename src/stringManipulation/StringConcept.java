package stringManipulation;

public class StringConcept {

	public static void main(String[] args) {

		// String definition: collection of multiple characters

		// space is also a character

		String str = "Hi this is my java code";

		// length of the string
		System.out.println(str.length());

		// char present at the particular index
		System.out.println(str.charAt(5));

		// char at 0th index
		System.out.println(str.charAt(0));
		// char at 22nd index
//		System.out.println(str.charAt(22));

		// highest index = string length - 1;
		// lowest index = 0

//		System.out.println(str.charAt(23)); // StringIndexOutOfBoundsException

		// find the char at the last index
		System.out.println(str.charAt(str.length() - 1));

		// negative indexing is not allowed for Strings in java
		// System.out.println(str.charAt(-1)); // StringIndexOutOfBoundsException

		// find the index of the specific character
		System.out.println(str.indexOf('H'));

		System.out.println(str.indexOf('i')); // 1 // first occurrence of i

		System.out.println(str.indexOf('i', str.indexOf('i') + 1)); // 5 second occurrence of i

		// third occurrence = second occurrence + 1
		// System.out.println(str.indexOf('i', str.indexOf('i', )));

		System.out.println(str.indexOf("java"));

		System.out.println(str.indexOf("javascript"));

		String message = "welcome admin";
		if (message.indexOf("admin") > 0) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		}

		// trim() method will remove the front and back corner spaces in a string
		String s = "   hello  world   ";
		System.out.println(s.trim());

		// whenever you read the data from the excel sheet
		String data = "  name is admin  ";

		// whenever you read the date from the config.properties file
		String browser = "chrome ";
		if (browser.trim().equals("chrome")) {

		}

		// replace()
		String t = "hello      world";

		System.out.println(t.replace(" ", ""));
		
		String dob = "18-02-1995"; //18/02/95
		System.out.println(dob.replace("-", "/"));
		
		//toUpperCase() -> prints the string in capital letters
		//toLowerCase() -> prints the string in small letters
		String hy = "I am learning Java and Selenium-UI Framework";
		System.out.println(hy.toUpperCase());
		System.out.println(hy.toLowerCase());
		
		//string comparison
		String m1 = "chrome";
		String m2 = "chrome";
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equalsIgnoreCase(m2));
		
		//contains() -> to check for the particular word is present in a string
		//equals() -> for the exact comparison of the string
		String k = "welcome to the test automation";
		System.out.println(k.contains("test"));
		

	}

}
