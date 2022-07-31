package arraysConcepts;

import java.util.ArrayList;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
	
		// ArrayList with Generics
		
		// diamond bracket
		// Integer is the wrapper class on the top of int
		
		ArrayList<Integer>  marksList= new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		
		bmiList.add(12.78);
		bmiList.add(67.90);
		
		ArrayList<String>   empNamesList = new ArrayList<String>();
		
		empNamesList.add("vimal");
		empNamesList.add("Tharun");
		
		
		System.out.println(empNamesList.size());
		
		// for  index loop
		for(int index=0; index<empNamesList.size(); index++) {
			System.out.println(empNamesList.get(index));
		}
		
		// for each
		// e is the variable name
		for(String e :empNamesList) {
			System.out.println(e);
		}
		
		// Acceptance criteria means the requirement
		// design a list of employee data
		// name(String) , age(int) , salary(double) , isPermanent(boolean)
		// gender(male)
		
		ArrayList<Object>   empList = new ArrayList<Object>();
		
		empList.add("aajay");
		empList.add(27);
		empList.add(50.00);
		empList.add(true);
		empList.add('m');
		
		// for each
		for(Object empData: empList) {
			System.out.println(empData);
			if(empData.equals("aajay")) {
				System.out.println("nice human being");
				break;
			}
		}

		System.out.println("----");
		
		// for loop
		for(int index=0; index<empList.size() ; index++) {
			System.out.println(empList.get(index));
		}
		
		System.out.println("----");
		
		// print in the reverse order using the for loop
		for(int index= empList.size()-1 ;index>=0;index--) {
			System.out.println(empList.get(index));
		}
	}

}
