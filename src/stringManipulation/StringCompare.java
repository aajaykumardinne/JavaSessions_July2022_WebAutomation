package stringManipulation;

public class StringCompare {

	public static void main(String[] args) {
	
		String t1 = "java";
		String t2 =  "java";
		
		System.out.println(t1==t2); //true
		
		String t3 = new String("java");
		
		// == operator checks the memory address of reference vars
		System.out.println(t1==t3);  //false
		System.out.println(t2==t3);  //false
		
		
		//always use .equals method for the string comparison
		System.out.println(t2.equals(t3));
		
		

	}

}
