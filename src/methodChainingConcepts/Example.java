package methodChainingConcepts;

public class Example {
	
	
	public int doUturn() {
		System.out.println("Car uturn done");
		return 100;
	}
	public static void main(String[] args) {
		
		Example obj = new Example();
		
//		obj.doUturn(); 
		// does not have return value and you are printing hence it is giving the error
		System.out.println(obj.doUturn());
		//println accepts only boolean arguments
		
		
		
	}

}
