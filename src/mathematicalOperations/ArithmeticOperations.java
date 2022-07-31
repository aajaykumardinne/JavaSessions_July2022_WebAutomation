package mathematicalOperations;

public class ArithmeticOperations {
	
	public static void main(String[] args) {

		System.out.println(15/3); 
		
		System.out.println(30/4); // 7
		System.out.println(30/4.0); // 7.5 
		System.out.println(30.0/4); // 7.5
		System.out.println(30.0/4.0); // 7.5
		
//		System.out.println(50/0); // ArithmeticException: / by zero
		
		System.out.println(80.0/0); // Infinity
		
		System.out.println(0/100);  // 0
		
		System.out.println(80/0.0);  // Infinity
		
//		System.out.println(0/0);  // ArithmeticException: / by zero
		
		System.out.println(0.0/0); //NaN
		System.out.println(0/0.0); //NaN
		System.out.println(0.0/0.0); //NaN
		
		System.out.println(9 % 6); // gives the remainder when percentile or modulus operator is used
		
		System.out.println(100/5 +"hello");
		
		String c = "TestNg";
		String d = "Framework";
		
		System.out.println(c+" "+d);
		System.out.println(c+' '+d);
		
		
	}
}
