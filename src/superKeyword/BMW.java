package superKeyword;

public class BMW extends Car{

	int minSpeed = 200;
	
	
	public void displaySpeed() {
		System.out.println("BMW Speed: " + minSpeed);
		System.out.println("Car Speed: " + super.minSpeed);
	}
	
	@Override
	public void getMileage() {
		System.out.println("BMW mileage is 18");
		super.getMileage();
	}
	
	public void  gearType() {
		System.out.println("Car transmission type: " + super.transmissionType());
	}
	
	public BMW() {
		super(20, "Electic Car");
	//	super();
		System.out.println("default constructor");
	}
}
