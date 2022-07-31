package arraysConcepts;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		
		// array literals : is also the static array
		// if you are sure how many values you will store in the array
		// then uses array literals 
		int i[] = {10,20,30,40};
		
		System.out.println(i.length);
		System.out.println("highest index = " + (i.length-1));
		System.out.println("lowest index = " + 0);
		
		// for each
		for(int e : i) {
			System.out.println(e);
		}
	
		// 2. string literals
		
		String studentNames[] = {"Ramu" , "Aajay" , "Kumar", "Dhoni"};
		
		System.out.println(studentNames.length);
		
		// for each
		for(String e : studentNames) {
			System.out.println(e);
			if(e.equals("Kumar")) {
				System.out.println("Software Tester");
				break;
			}
		}
		
		// 3. Object literals
		
		Object emp[] = {"Sahu" , 25, 35.7 , true, 'm'};
		
		for(Object e : emp) {
			System.out.println(e);
		}
		

	}

}
