package oops_InterfaceConcepts;

public interface USMedical extends WHO {

	static final int min_fee = 10;
	//interface vars are static and final by default
	
	
	// interface can not have business logic
	// just method declaration
	// 100% abstraction

	// abstract method: having no method body
	
	public void pediaServices();

	public void physioServices();
	
	public void orthoServices();
	
	public void emergencyServices();
	
	// after jdk 1.8
	
	// two major changes
	
	// 1. can have a static method with method body
	
	public static void training() {
		System.out.println("US Medical Training");
	}
	
	// 2. can have a default method
	default void donation() {
		System.out.println("US Medical donation");
	}

}
