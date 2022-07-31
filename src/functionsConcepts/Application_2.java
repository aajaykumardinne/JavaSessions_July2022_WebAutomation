package functionsConcepts;

public class Application_2 {

	// Req: getDevicesList(empName)
	// param: empName(String)
	// return : List of devices -> Array (static array)

	public String[] getDevicesList(String empName) {

		System.out.println("getting devices for: " + empName);

		// String[] devicesList= new String[3];
		String devicesList[] = new String[4];

		if (empName.equalsIgnoreCase("Aajay")) {
//			devicesList[0] = "iPhone XR";
			devicesList[1] = "Redmi note 6";
			devicesList[2] = "Oppo a52";
		}

		else if (empName.equalsIgnoreCase("kumar")) {
			devicesList[0] = "iPhone 13 pro";
			devicesList[1] = "Redmi note 3";
			devicesList[2] = "Oppo A51";
		}

		else if (empName.equalsIgnoreCase("dinne")) {
			devicesList[0] = "iPhone 8";
			devicesList[1] = "Redmi note 4";
			devicesList[2] = "Oppo A35";
		}

		else {
			System.out.println("employee name is not found: " + empName);
		}

		return devicesList;
	}

	public static void main(String[] args) {

		Application_2 obj = new Application_2();

		String empDevicesList[] = obj.getDevicesList("aajay");

		// for each
		// empDevicesList is the arrayname
		// e is the variable name
		for(String e : empDevicesList) {
			System.out.println(e);
		}
		
		System.out.println("---");
		
		// for loop - index based loop
		for(int i=0;i<empDevicesList.length ;i++) {
			System.out.println(empDevicesList[i]);
		}
		
		System.out.println("total devices for the employee: " + empDevicesList.length);

	}

}
