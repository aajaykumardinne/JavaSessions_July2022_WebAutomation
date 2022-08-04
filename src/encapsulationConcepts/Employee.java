package encapsulationConcepts;

public class Employee {
	
	private String name;
	private int age;
	private boolean isPerm;
	
	// How to achieve encapsulation
	// 1. using the getter and setter
	// 2. by creating the constructor
	
	//
	
	// is applied to variables and methods
	
	
	// not mandatory to use the setter methods to achieve the encapsulation
	// constructor and setter methods are used to initialize the class variables
	
	//constructor - to create the object
	public Employee(String name, int age, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.isPerm = isPerm;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	
	
	

}
