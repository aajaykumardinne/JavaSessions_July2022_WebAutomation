package constuctorConcepts;

public class EmployeeType {

	String name;
	int age;
	double salary;

	// constructor of the class
	// cons name is same as the class name but static and non-static functions can be anything
	// cons can not return anything but but static and non-static functions may or may not return anything.
	// cons no void keyword
	// cons will be called when creating the object 
	// static functions will be called by using class name
	// non-static functions will be called by using object reference name

	
	// cons restricts the creation of unnecessary object creation
	// a is the local variables and 
	public void test() {
		System.out.println("test method");
	}

	// constructor - overloading
	public EmployeeType() { // 0 parameters

	}

	public EmployeeType(int a) { // 1 parameter
		
	}
	
	public EmployeeType(int a, String x) { // 2 parameter
		System.out.println("two parameters: " + a + " " + x);
	}

	
	// constructor overriding is not possible in java
	public static void main(String[] args) {

		EmployeeType e1 = new EmployeeType(20, "macbook air m1");
		e1.test();

	}

}
