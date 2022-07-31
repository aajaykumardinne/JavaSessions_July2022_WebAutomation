package classandObjectsConcepts;

public class Customer {

	String name;
	long phoneNo;
	String emailId;

	public static void main(String[] args) {

//	 	object reference interchange example
		// create the three different users

		Customer c1 = new Customer();

		c1.name = "Anthony";
		c1.phoneNo = 3325345435L;
		c1.emailId = "anthony_super@gmail.com";

		Customer c2 = new Customer();
		c2.name = "Bharath";
		c2.phoneNo = 798150343L;
		c2.emailId = "bharat12@yahoo.com";

		Customer c3 = new Customer();
		c3.name = "Shamili";
		c3.phoneNo = 9156813201543L;
		c3.emailId = "shamili_112@outlook.com";

		// class variables and class methods can only be accessed

		System.out.println(c1.name + " " + c1.phoneNo + " " + c1.emailId);
		System.out.println(c2.name + " " + c2.phoneNo + " " + c2.emailId);
		System.out.println(c3.name + " " + c3.phoneNo + " " + c3.emailId);

		System.out.println("*******");

		c1 = c2;

		System.out.println(c1.name + " " + c1.phoneNo + " " + c1.emailId);
		System.out.println(c2.name + " " + c2.phoneNo + " " + c2.emailId);
		System.out.println(c3.name + " " + c3.phoneNo + " " + c3.emailId);

		System.out.println("*******");

		c2 = c3;

		System.out.println(c1.name + " " + c1.phoneNo + " " + c1.emailId);
		System.out.println(c2.name + " " + c2.phoneNo + " " + c2.emailId);
		System.out.println(c3.name + " " + c3.phoneNo + " " + c3.emailId);

		System.out.println("*******");

		c3 = c1;

		System.out.println(c1.name + " " + c1.phoneNo + " " + c1.emailId);
		System.out.println(c2.name + " " + c2.phoneNo + " " + c2.emailId);
		System.out.println(c3.name + " " + c3.phoneNo + " " + c3.emailId);

		System.out.println("*******");

		c1 = c3;

		System.out.println(c1.name + " " + c1.phoneNo + " " + c1.emailId);
		System.out.println(c2.name + " " + c2.phoneNo + " " + c2.emailId);
		System.out.println(c3.name + " " + c3.phoneNo + " " + c3.emailId);

		System.out.println("*******");

	}

}
