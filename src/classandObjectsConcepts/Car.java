package classandObjectsConcepts;


/**
 * 
 * @author dinne
 *
 */
public class Car {

	// instance or class vars
	String name;
	int price;
	String color;
	boolean isAutomatic;

	public static void main(String[] args) {
		
		// create the object of the class using the new keyword
		Car c = new Car();
		c.name= "Honda";
		c.color = "white";
		c.price = 1200000;
		c.isAutomatic = true;
		
		// the moment object is created java automatically 
		// creates the photo copy of the class variables and methods 
		// which are defined at the class level
		
		// with the help of the object ref name we can access
		// the class properties
		
		
		System.out.println(c.name + " " + c.color + " " + c.price + " " + c.isAutomatic);
		
		Car c1 = new Car();
		
		// it is not mandatory to iniatilise all the class vars
		
		System.out.println(c1.name); // prints the default value of the String
		System.out.println(c1.price); // prints the default value of the int
		System.out.println(c1.color);
		System.out.println(c1.isAutomatic); // prints the default value of the boolean
		
		// no reference objects
		new Car().name="Toyota";
		new Car().price = 300000;
		new Car().isAutomatic = false;
		new Car().color = "blue";
		
		//new classname(name of the class)() -> object is created with the new keyword
		
		// when the heap size is full garbage collector will remove all the no reference objects 
		// and null reference objects which are stored in the heap 
		// memory in java
		
		
		// Objects are stored in the Heap memory
		// Object reference names are stored in the Stack memory
		
		// null ref objects
//		Car t1 = new Car();
//		t1= null;
//		t1.price = 45;
//		System.out.println(t1.color); //NullPointer Exception
		
		// java is very smart
		// gc will read the instructions from jvm
		// jvm will check the heap size
		
		Car t2 = null;
		t2.color = "white";
		System.out.println(t2.color);
		
		// call the garbage collector programatically
		System.gc();  // will not give you gaurantee it will call the gc
		
		
		
	}
		
}	
