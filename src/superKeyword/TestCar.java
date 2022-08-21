package superKeyword;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		System.out.println(b.minSpeed);
		
		b.displaySpeed();  //individual methods
		
		b.gearType();   //individual methods
		 
		
		b.getMileage();  //overridden methods
		
		Vehicle v = new Vehicle();
		
		//object will be not be created when constructor is 
		//defined as private
		// Example
//		System obj = new System();
		
//		Testing t = new Testing();
		
		System.out.println(Testing.timeOut);

	}

}
