package oops_abstract;

public abstract class Page {

	// can not create the object of abstract class
	// can have abstract + non-abstract methods in abstract class
	
	// can we create the constructor of the abstract class?
	// Answer: Yes
	// but this constructor will be called when you create the object 
	// of the child class
	
	// in abstract class
	// 1. No abstract methods - yes - 0% abstraction
	// 2. only abstract methods - yes - 100% abstraction
	// 3. both abstract and non-abstract methods - partial abstraction
	
	//Interface
	//100% abstraction
	
	//constructor overloading
	public Page() {
		System.out.println("page -- default constructor");
	}
	
	public Page(int j) {
		System.out.println("page constructor: " + j);
	}

	// abstract methods
	public abstract void title();

	public abstract void url();

	// non-abstract methods
	public void timeOut() {
		System.out.println("page time out -- 20 seconds");
	}

	// final keyword is used in the method such that no one will
	// override the displayLogo() method
	// static keyword can also be used as it is the common properties
	// for the pages in a web application
	public void displayLogo() {
		System.out.println("page -- display logo");
	}

}
