package arraysConcepts;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// ctrl + shift + o -> for the imports
		ArrayList<Integer>  marksList= new ArrayList<Integer>();
		
		System.out.println(marksList.size());
		
		marksList.add(100);
		marksList.add(200);
		marksList.add(11);
		marksList.add(20);
		
		System.out.println(marksList.get(2));
		
		// indexing always starts from zero in java
		
		marksList.remove(2);
		
		System.out.println(marksList.get(2));
		
		// the movement you remove from the arraylist
		// size will be adjusted accordingly
		
		
		// how to update the value at the specific index
		
		marksList.add(0, 1000);
		System.out.println(marksList.get(0));
		
		// elements are stored in the continous memory location
		// in java
		// elements are stored in the sequence in the arraylist
		 
		marksList.add(7, 1500);
		System.out.println(marksList.get(7));
		
		// duplicate values are allowed in the arraylist
		
		
		

	}

}
