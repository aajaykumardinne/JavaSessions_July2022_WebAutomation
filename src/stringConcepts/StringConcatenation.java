package stringConcepts;

public class StringConcatenation {

	public static void main(String[] args) {

		
//		'+' will acts as string concatenation and arthimetic operator also
		int a = 300;
		int b = 700;

		System.out.println(a + b);

		// String is a class in a java
		String x = "Java&";
		String y = "SeleniumWebDriver";

		System.out.println(x+y);
		System.out.println(a+x); //300Java&
		System.out.println(x+a); //Java&300
		System.out.println(x+y+a+b); //Java&SeleniumWebDriver300700
		
		System.out.println(a+b+x+y); //1000Java&SeleniumWebDriver
		
		System.out.println(x+y+(a+b)); //Java&SeleniumWebDriver1000
		
		System.out.println("Aajay Please Stay Positive");
		
		System.out.println("The Value of a : " + a);
		System.out.println("The Value of b : " + b);
		System.out.println("The sum is: " + (a+b));
		
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+(a+b));
		
		double d1 = 13.54;
		double d2 = 19.86;
		
		System.out.println(x+y+d1+d2);
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(x+c1);
		System.out.println(x+y+(c1+c2));
		

	}

}
