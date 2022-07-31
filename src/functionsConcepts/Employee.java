package functionsConcepts;

public class Employee {

	// class data members: class vars and class methods

	// All methods should be defined in the class only
	// 1. can not create a method inside a method.
	// 2. methods are independent or parallel to each other

	// it is not mandatory for the method to return something
	// return statement should be the last statement in the method
	// only one return statement

	// 1. no input and no return
	// void means does not return anything
	public void test() {
		System.out.println("test method");
	}

	// 2. no input and some return
	public String getName() {
//		return name;
		System.out.println("get name method");
		String name = "Gambhir";
		return name;
	}

	public int add() {
		System.out.println("add numbers");
		int x = 100;
		int y = 200;
		int sum = x + y;
		return sum;

		// return x;
	}

	// 3. some input and some return
	// x and y are called the method parameters
	public int sum(int x, int y) {
		System.out.println("sum method");
		int total = x + y;
		return total;

	}

	public static void main(String[] args) {

		// Functions and Methods are same

		// program execution starts from the main method in java

		// In object oriented it is called as Methods

//		class vars and class methods can be accessed by object

		// new Employee() is the object
		Employee emp = new Employee();
		emp.test();

		// always store the method return value in some variable
		// and use the variable in different ways to perform
		// additional operations

		String personName = emp.getName();
		System.out.println(personName);

		int total = emp.add();
		System.out.println(total);

		int add = emp.sum(20, 30); // 20 , 30 are called the method arguments
		System.out.println(add);

		// method arguments : the actual values you are passing when calling the method
		// design the method what exactly you are expecting as the input it is called
		// the method parameters

		int m = emp.getMarks("anil");
		System.out.println(m);

	}

	// WAF: getMarks() -> input param : studentName(string)
	// return the student marks;
	// if student name is not found --> return ???

	public int getMarks(String studentName) {
		System.out.println("get the student marks : " + studentName);

		int marks = -1;

		if (studentName.equals("Aajay")) {
			// return 90;
			marks = 90;

		}

		if (studentName.equals("Kumar")) {
			// return 95;
			marks = 95;
		}

		if (studentName.equals("Dinne")) {
			// return 80;
			marks = 80;
		}

		else {
			System.out.println("student name is not found: " + studentName);
			// return -1;

		}

		return marks;
	}

}
