package encapsulationConcepts;

public class TestEmployee {

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		
//		e1.setName("aajay kumar");
//		e1.setAge(27);
//		e1.setPerm(true);
//		
//		
//		System.out.println(e1.getName());
//		System.out.println(e1.getAge());
//		System.out.println(e1.isPerm());

		// CRUD operations
		Employee e2 = new Employee("peter", 27, true); // POST - create the user details

		// GET call - Retrieve the user details
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.isPerm());

		// PUT call - update the user details
		// setter method is used to update the users values
		e2.setAge(28);

		// GET call - Retrieve the user details
		// getter method is used to get the user values	
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.isPerm());

		e2.setPerm(false);

		// GET call - Retrieve the user details
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.isPerm());

	}

}
