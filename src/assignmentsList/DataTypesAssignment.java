package assignmentsList;

public class DataTypesAssignment {

	public static void main(String[] args) {
		
		// 1. print Hello on the screen and print the name on the seperate line
		
		String s1 = "Hello";
		String s2 = "Aajay Kumar D";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("------");
		
		// 2. print the sum of two numbers
		int num1 = 74;
		int num2 = 36;;
		
		int sum = num1+num2;
		System.out.println("The sum is : " + sum);
		
		System.out.println("------");
		
		// 3. divide two numbers 
		int num3 = 50;
		int num4 = 3;
		
		int div = num3/num4;
		
		System.out.println("The quotient is :" + div);
		
		System.out.println("------");
		
		// 5. 
		double muldata1 = 25.5 * 3.5;
		double muldata2 = 3.5 * 3.5;
		
		double div2 = ((muldata1 - muldata2)/(40.5 - 4.5));
		
		System.out.println("The expression is : " + div2);
		
		System.out.println("------");
		
		
		// 6. concat Hello Selenium with character t
		char c= 't';
		String s = "Hello Selenium";
		System.out.println(s+c);
		
		System.out.println("------");
		
		
		// 7. 
		int num5 = 100;
		int num6 = 200;
		int num7 = 3400;
		
		int sum4 = num5 + num6 + num7;
		
		System.out.println("Total amount is : " + sum4);
		

		System.out.println("------");
		
		// 8.
		byte b4 = 065;   // octal number range is 0 to 7 only - base 8
		System.out.println(b4);
	// 065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
		
		double div3 = 12.34 % 5;
		System.out.println(div3);
		
		

	}

}
