package practicePrograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34 55 89 ... .... ....

		// not sure how many iterations should i perform hence
		// use for loop

		int firstNumber = 0;
		int secondNumber = 1;
		int n = 10;

		//for loop  -- used when not sure about no of iterations to perform
//		for (int i = 1; i <= n; i++) {
//			System.out.print(firstNumber + ",");
//			int nextNumber = firstNumber + secondNumber;
//
//			firstNumber = secondNumber;
//			secondNumber = nextNumber;
//
//		}
		
		//while loop -- sure about no of iterations to perform
		int i = 1;
		while(i<=n) {
			System.out.print(firstNumber + ",");
			
			int nextNumber = firstNumber + secondNumber;

			firstNumber = secondNumber;
			secondNumber = nextNumber;
			
			i++;
		}
	}

}
