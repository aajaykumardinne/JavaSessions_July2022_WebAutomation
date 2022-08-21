package accessModifiers_2;

import accessModifiers.Car;

public class Hyundai extends Car{

	public static void main(String[] args) {
		
		Hyundai hy = new Hyundai();
		
		hy.name = "Creta";  //public class vars
		hy.price = 20;     // protected class vars
		
		hy.start();  //public class methods
		hy.transmissionType(); //protected class methods
		

	}

}
