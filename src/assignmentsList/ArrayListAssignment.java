package assignmentsList;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {

		// 1. create a new array list, add some colors (string)
		// and print out the collection

		ArrayList<String> colorsNames = new ArrayList<String>(5); // vc = 5 in this example

//		colorsNames is the object ref name
		// add the colors
		// elements are stored in the order in the arraylist
		
		colorsNames.add("Yellow");
		colorsNames.add("Red");
		colorsNames.add("Orange");
		colorsNames.add("Blue");
		colorsNames.add("Violet");
		colorsNames.add("Purple");

		// print all the values present in the arraylist
		for (String e : colorsNames) {
			System.out.println(e);
		}
		
		System.out.println("----");
		
		// using the index based for loop:
		for(int j=0; j<colorsNames.size(); j++) {
			System.out.println(colorsNames.get(j));
		}
		

		System.out.println("----");

		// 2. insert an element into the array list at the first and last positions.

		
		colorsNames.add(0, "White");
		colorsNames.add(colorsNames.size(), "Black");
		
		for(int j=0; j<colorsNames.size(); j++) {
			System.out.println(colorsNames.get(j));
		}
		
		System.out.println("----");
		
		// 3. retrieve an element (at a specified index) from a given array list

		System.out.println(colorsNames.get(5));

		System.out.println("----");

		// 4. update specific array element by given element.

		colorsNames.add(3, "Pink");
		System.out.println(colorsNames.get(3));
		System.out.println("----");

		for (String e : colorsNames) {
			System.out.println(e);
		}

		System.out.println("----");
		
		// 5. remove the third element from a array list.

		colorsNames.remove(3);

		System.out.println(colorsNames.get(3));
		
		System.out.println("----");
		
		for (String e : colorsNames) {
			System.out.println(e);
		}

		
		// 6. 
	}

}
