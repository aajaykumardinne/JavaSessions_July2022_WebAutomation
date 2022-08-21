package callByReferenceConcepts;

public class Employee {

	String name;
	int age;
	
	public void getInfo(Employee e1) {
		e1.name = "Kumar";
		e1.age = 25;
		
		sendMail(e1);
	}
	
	public void getInfo(String nameValue) {
		System.out.println(nameValue);
	}
	
	public void sendMail(Employee e2) {
		e2.name = "dinne";
		e2.age = 30;
	}
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		obj.name = "Aajay";
		obj.age = 27;
		
		System.out.println(obj.name + " " + obj.age);
		
		obj.getInfo(obj);
		
		System.out.println(obj.name + " " + obj.age);
		
//		obj.sendMail(obj);
//		
//		System.out.println(obj.name + " " + obj.age);
		
		obj.getInfo(obj.name);

	}

}
