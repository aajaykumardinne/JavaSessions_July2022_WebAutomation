package stringManipulation;

public class StringTest {

	public static void main(String[] args) {
		
		String x = "hello selenium"; //String literals -> SCP
		String y =	x.concat("testing"); // hello Selenium testing
		System.out.println(x);
		System.out.println(y); 
		
		//
		String t1 = "java";
		String t2 = "java";
		
		String t3 = "Java";
		
		// creation of the string with the new keyword
		String t4 = new String("Selenium"); //2 objects heap + SCP
		String t5 = "Selenium"; // 0 objects
		String t6 = "Selenium"; // 0 objects
		
		t5 = "ruby";
		System.out.println(t5);
		
		String t7 = new String("Selenium"); //heap(1) + scp(0)
		
		String t8 = "selenium"; // 0 objects
		
		String t9  = new String("automation"); 
		
		String t10 = "automation";
		
		System.out.println(t10+"aajay"); //automationaajay
		
		
			
		
		

	}

}
