package assignmentsList;

import java.util.ArrayList;

public class TestMethodOverloading {

	public static void main(String[] args) {
		
		MethodOverLoadingAssignment test = new MethodOverLoadingAssignment();
		
		//1. login feature
		boolean flag = test.doLogin("43986107", 3240);
		System.out.println(flag);
		
		boolean flag1 = test.doLogin("968405012", "qwerty@95");
		System.out.println(flag1);
		
		boolean flag2 = test.doLogin("ajay89", "sydney_45", 9531);
		System.out.println(flag2);
		
		//2. search for a restaurant
		int num = test.doSearch("Paradise");
		System.out.println(num);
		
		ArrayList<String>	searchList	= test.doSearch("sri kanya", "paneer curry");
		System.out.println(searchList);
		
		ArrayList<String>	searchList1	= test.doSearch("sri kanya", "paneer curry",200);
		System.out.println(searchList1);
		
		ArrayList<String>	searchList2	= test.doSearch("sri kanya", "paneer curry",100, 4);
		System.out.println(searchList2);
		
	}

}
