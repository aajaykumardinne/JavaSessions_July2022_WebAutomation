package functionsConcepts;

import java.util.ArrayList;

public class Application {

	public double getNumber(double d1, double d2) {

		double d = d1 + d2;
		return d;
	}

	// Req: getDevicesList(empName)
	// param: empName(String) 
	// return : List of devices -> ArrayList(dynamic array)

	// using ArrayList because we are sure how many devices does the employee have
	//method parameter should also always be included in the method logic
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("getting devices list for: " + empName);

		// solving using the static array
		// String devicesList[] = new String[10];

		// be specific about the object ref name and variable name also
		ArrayList<String> devicesList = new ArrayList<String>();

		if (empName.equalsIgnoreCase("Prashanth")) {
			devicesList.add("iPhone XR");
			devicesList.add("Samsung Galaxy S21");
			devicesList.add("Google Pixel 3");
		}

		else if (empName.equalsIgnoreCase("John")) {
			devicesList.add("iPhone 11");
			devicesList.add("Samsung Galaxy S20");
			devicesList.add("Google Pixel 2");
		}

		
		else if (empName.equalsIgnoreCase("Suman")) {
			devicesList.add("iPhone 13");
			devicesList.add("Samsung Galaxy S22");
			devicesList.add("Google Pixel 4");
		}

		else {
			System.out.println("emp name is not found : " + empName);
		}

		return devicesList;
	}
	
	
	public static void main(String[] args) {

		Application obj = new Application();

		double sum = obj.getNumber(18.35, 25.46); // call by values
		// calling the function and passing the values to the function

		// method arguments and values both are same
		System.out.println(sum);

		ArrayList<String> empDevicesList = obj.getDevicesList("john");
		
		System.out.println(empDevicesList);

	}

	

}
