package arraysConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest_2 {

	public static void main(String[] args) {

		// use cases of selenium for arraylist
		// to find the no of images
		// to find the no of options available

		// virtual capacity is 20 in this example
		ArrayList<Integer> ar = new ArrayList<Integer>(20);

		ar.add(250);
		ar.add(12);
		ar.add(800);
		ar.add(1000);

		// print all the values in the arraylist with out using any loop
		System.out.println(ar);
		System.out.println("----");

//		Collections.sort(ar);
//		System.out.println(ar);
//		System.out.println(ar);
//		System.out.println("----");
//	
//		System.out.println("min value is : " + ar.get(0));
//		System.out.println("max value is: " + ar.get(ar.size()-1));
//		System.out.println("----");

		// arraylist in reverse order using sort
		// sort the elements and print the elements in reverse order
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);
		System.out.println("----");

		ArrayList<Integer> ar1 = new ArrayList<Integer>(20);

		ar1.add(40);
		ar1.add(500);
		ar1.add(19);
		ar1.add(1);

		System.out.println(ar1);

		// adding the two arraylists
		ar1.addAll(ar);

		System.out.println("----");

		System.out.println(ar1);

		System.out.println("----");

		ArrayList<String> names = new ArrayList<String>(20);

		names.add("Rohit");
		names.add("Aarthi");
		names.add("Paul");
		names.add("Saleem");
		names.add("Bharani");

		System.out.println(names);

		System.out.println("----");

		// sort the values present in the arraylist
//		Collections.sort(names);
//		System.out.println(names);

		// swap the values present in the arraylist
		Collections.swap(names, 1, 2);

		System.out.println(names);

		System.out.println("----");
		// using char array literals
		char c1[] = { 'a', 'b', 'c', 'd' };

		// print all the values in the static array with out using any loop
		System.out.println(Arrays.toString(c1));

		// toString() method is applicable to all the primitive data types

		System.out.println("----");
		// clear the values in the arraylist
		
		ArrayList<String> emp = new ArrayList<String>(20);
		
		emp.add("Ram");
		emp.add("Manohar");
		emp.add("Hanumanth");
		emp.add("Gaurav");
		emp.add("Joe");
		
		System.out.println(emp);

		System.out.println("----");
		
		//java is always case sensitive
		
//		emp.clear();
//		System.out.println(emp);  // empty array list
		
		if(emp.contains("Manohar")) {
			System.out.println("Employee is present");
		}
		
		
	}

}
