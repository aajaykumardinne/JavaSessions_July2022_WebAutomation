package stackMemory;

public class Testing {

	//static and non-static methods execution takes place
	//in the StackMemory
	
	//Memory will also be allocated for the execution of the methods.
	
	public void m1() {
		m2();
	}
	
	public void m2() {
		m3();
	}
	
	public void m3() {
		System.out.println("bye");
//		m1(); //StackOverflow error
		//error occurs due to infinite method calling
	}
	
	public static void main(String[] args) {
		
		Testing t = new Testing();
		
		t.m1();
		
		System.out.println("API Testing with Rest Assured");

	}

}
