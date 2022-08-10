package assignmentsList;

import java.util.ArrayList;

public class MethodOverLoadingAssignment {

	// 1. login feature
	public boolean doLogin(String phone, String password) {
		System.out.println("Login with: " + phone + " " + password);
		return true;
	}

	public boolean doLogin(String phone, int otp) {
		System.out.println("Login with: " + phone + " " + otp);
		return false;
	}

	// duplicate methods the method parameters data type should be different
	// for method overloading
//	public void doLogin(String username, String password) {
//		
//	}

	public boolean doLogin(String username, String password, int otp) {
		System.out.println("Login with: " + username + " " + password + " " + otp);
		return true;
	}

	// 2. search for a restaurant
	public int doSearch(String restaurantName) {
		System.out.println("Search for the restaurant: " + restaurantName);
		return 100;
	}

	public ArrayList<String> doSearch(String restaurantName, String foodItem) {

		ArrayList<String> restaurantList = new ArrayList<String>();
		restaurantList.add("Food World");
		restaurantList.add("Chicken 65");

		if (restaurantName.equalsIgnoreCase("food world")) {
			return restaurantList;
		} else if (foodItem.equalsIgnoreCase("chicken curry")) {
			return restaurantList;
		} else {
			return null;
		}
	}

	public ArrayList<String> doSearch(String restaurantName, String foodItem, int price) {

		//ArrayList is a dynamic array 
		ArrayList<String> restaurantList = new ArrayList<String>();
		restaurantList.add("Sri Kanya");
		restaurantList.add("Paneer Curry");
		restaurantList.add("250");
		
		for(String e : restaurantList) {
			System.out.println(e);
		}

		if (restaurantName.equalsIgnoreCase("Sri kanya")) {
			return restaurantList;
		} 
		else if (foodItem.equalsIgnoreCase("Paneer curry")) {
			return restaurantList;
		} 
		else if (price == 100) {
			return restaurantList;
		} 
		else {
			return null;
		}

	}

	public ArrayList<String> doSearch(String restaurantName, String foodItem, int price, double rating) {

		ArrayList<String> restaurantList = new ArrayList<String>();
		restaurantList.add("Himalaya");
		restaurantList.add("Mutton pulav");
		restaurantList.add("1000");
		restaurantList.add("3.5");

		if (restaurantName.equalsIgnoreCase("Sri kanya")) {
			return restaurantList;
		} else if (foodItem.equalsIgnoreCase("Paneer curry")) {
			return restaurantList;
		} else if (price == 100) {
			return restaurantList;
		} else if (rating == 3.5) {
			return restaurantList;
		} else {
			return null;
		}
	}

}
