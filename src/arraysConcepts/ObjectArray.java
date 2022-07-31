package arraysConcepts;

public class ObjectArray {

	public static void main(String[] args) {
		
		
		// object static array 	
		//default value object array is null
		
		// memory will be allocated during the run time.
		// Compiler will not give show all the errors
		
		Object emp[] = new Object[5]; //0-4
		
		emp[0] = "harinath";
		emp[1] = 25;
		emp[2] = 12.45;
		emp[3] = 'm';
		emp[4] = true;
//s		emp[5] = 789121212;
		
		System.out.println(emp[0]);
//		System.out.println(emp[5]); //AIOB
		System.out.println("-----");
		
		// print all the values : iterate the array using for loop
		for(int k=0; k<emp.length; k++) {
			System.out.println(emp[k]);
		}
		
		System.out.println("-----");
		
		// e is the type of the array or the element 
		for(Object e: emp) {
			System.out.println(e);
			if(e.equals("harinath")) {
				System.out.println(e + " Hi... ");
				break;
			}
		}
		
		

	}

}
