package assignmentsList;

public class ArrayAssignments {

	public static void main(String[] args) {

		// 1. print the program using for loop

//		00 01 02 03 04 05 06 07 08 09 
//		10 11 12 13 14 15 16 17 18 19 
//		20 21 22 23 24 25 26 27 28 29 
//		30 31 32 33 34 35 36 37 38 39 

		// "" -> empty or blank character
		// " " -> space character

// print() -> will print on the console
// println() -> means will print on the new line with space
		
		for (int i = 0; i <= 3; i++) {
			// 0 ; 0<=3(true) ; i= 1
			// 1 ; 1<=3(true) ; i=2
			// 2; 2<=3(true) ; i=3
			for (int j = 0; j <= 9; j++) {
				System.out.print(i+""+j+" ");
				// 00 01 ---- 09
				// 10 11 ---- 19
				// 20 21 ---- 29
				// 30 31 ---- 39
			}
			System.out.println();
		}

		// 2. create a object static array
		Object cricketData[] = new Object[7];

		cricketData[0] = "aajay kumar";
		cricketData[1] = 27;
		cricketData[2] = "Orange bulls";
		cricketData[3] = "18-02-1995";
		cricketData[4] = 'm';
		cricketData[5] = 160.57;
		cricketData[6] = true;

		Object cricketData1[] = new Object[7];

		cricketData1[0] = "shivani thakur";
		cricketData1[1] = 20;
		cricketData1[2] = "Hyderabad Blues";
		cricketData1[3] = "25-10-2002";
		cricketData1[4] = 'f';
		cricketData1[5] = 200.30;
		cricketData1[6] = false;

		Object cricketData2[] = new Object[7];

		cricketData2[0] = "Amit PAndey";
		cricketData2[1] = 35;
		cricketData2[2] = "Madras Mates";
		cricketData2[3] = "15-8-1987";
		cricketData2[4] = 'm';
		cricketData2[5] = 250.90;
		cricketData2[6] = true;

		// print all the values of the object static array
		System.out.println("----");

		// while loop
		int index = 0;
		while (index < cricketData.length) {
			System.out.println(cricketData[index]);
			if (cricketData[index].equals(27)) {
				System.out.println("Professional Cricketer");
				// break;
			}
			index++;
		}

		System.out.println("----");
		// for loop : index based loop

		for (int index1 = 0; index1 < cricketData1.length; index1++) {
			System.out.println(cricketData1[index1]);
			if (cricketData1[index1].equals('f')) {
				System.out.println("No Gender Bias");
			}
		}

		System.out.println("----");

		// for each
		for (Object e : cricketData2) {
			System.out.println(e);
			if (e.equals(35)) {
				System.out.println("Age is just a number");
			}
		}

		System.out.println("----");

		// 3
		int numbers[] = { 4, 3, 2, 1, 0 };

		// index based for loop
		for (int index1 = 0; index1 < numbers.length; index1++) {
			System.out.println("n" + " = " + numbers[index1]);
		}

	}

}
