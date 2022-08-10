package inheritanceConcepts;

public class BMW extends Car{
	
	int speed = 200;
	// Method overriding : PolyMorphism (Run time/dynamic)
	// When you have a method in the parent and same the method in the class:
	// 1. with the same method name
	// 2. same number of parameters with the same sequence.
	// 3. same return type
	
	// decision will be taken at the run time for calling the method hence it
	// is called runtime polymorphism.
	
	// class can only be public 
	
	// can not override the private methods .
	// can not inherit the private methods
	
	// the scope of the private vars and methods is within the class only
	@Override
	public void start() {
		System.out.println("BMW - start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW - engine");
	}
	
	public void autoParking() {
		System.out.println("BMW - auto parking");
	}
	
	public static void billing() {
		System.out.println("BMW -- billing");
	}

}
