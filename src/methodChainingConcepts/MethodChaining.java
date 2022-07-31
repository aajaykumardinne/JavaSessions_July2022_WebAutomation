package methodChainingConcepts;

public class MethodChaining {

	
	// one method can call the other method if they are part 
	// of the same object this is called the method chaining
	
	// main method is a part of the main memory
	public void m1() {
        m2();
	}

	public void m2() {
		m3();
		
	}

	public void m3() {
		System.out.println("bye");
	}

	public static void main(String[] args) {

		MethodChaining obj = new MethodChaining();
		
		obj.m1();
	}

}
