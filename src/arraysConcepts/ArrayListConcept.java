package arraysConcepts;

import java.util.ArrayList;


// do not create the class as ArrayList as it already predefined by the java guys
public class ArrayListConcept {

	public static void main(String[] args) {
		
		// ArrayList - default class
		// maintains the order/index
		// indexing starts from the zero both in static array and arraylist
		
		
		// create the object of ArrayList class with: new keyword
		// here arList is the object reference name
		
		// as a programmer we are worried about the physical capacity 
		// not the virtual capacity which is the internal mechanism
		
		ArrayList arlist = new ArrayList(20);
		System.out.println(arlist.size());
		
		
		
		// add method to add the values in the arraylist
		// going to the particular index and enetering the values ie i[0]=10
		arlist.add(100);
		arlist.add(100);
		
		
		// gives the current or actual size of the arraylist
		// length variable to get the size of the static array
		// size method will get the physical capacity of the arraylist
		
		System.out.println(arlist.size());
		
//		for()	
		
		arlist.add(400);
		arlist.add(500);
		
		System.out.println(arlist.size());

		
		// virtual cpacity calc when pc is full
		// then vc = pc/2 which is called as the calc of load factor
		
		// vc does not occupy bits or bytes in the memory
		// vc is an internal mechanism for the optimization
		// java takes care of the memory management
		
		// be default vc = 10
		// we can define our own virtual capacity as well
		// ie ArrayList arlist = new ArrayList(20);
		
		
		// to fetch the data from the arraylist
		System.out.println(arlist.get(0));
//		System.out.println(arlist.get(4)); // IndexOutOfBoundsException
		
//		System.out.println(arlist.get(-1));  //IOB
		
		// to print all the values of arraylist
		// why for loop - i have to perform 4 iterations
		
		// data type of index ; name of the arraylist ; increment the arraylist
		for(int k=0; k<arlist.size(); k++) {
			System.out.println(arlist.get(k));
		}
		
		// for each 
		for(Object e : arlist) {
			System.out.println(e);
		}
		
		
	}

}
