package assignmentsList;

public class PracticeExamples {

	public static void main(String[] args) {

		// diff between print and println

		int j = 40;

		System.out.println(j);
//		System.out.print("aajay");

		// add the values in the arraylist
		int p[] = new int[5];

		p[0] = 1;
		p[2] = 5;
		p[1] = 20;
		p[3] = 35;
		p[4] = 50;

		int sum = 0;
		for (int j1 = 0; j1 < p.length; j1++) {
			sum = sum + p[j1];

		}
		System.out.println(sum);

		// max number from the given numbers

		int a = 400;
		int b = 15;
		int c = 1;

		// & -> and operator
		// && -> short circuit operator or logical and operator
		if (a>b && a > c) {
			System.out.println("a is the greatest");

		}
		else if(b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
		
		// when ever you peform arithmetic operator on char data type
		// ascii value will be taken
		
//		for(byte b3=119 ;b3<=127; b3++) {
//			System.out.println(b3);  // generates the infinite loop
//		}
		
		
	

	}

}
