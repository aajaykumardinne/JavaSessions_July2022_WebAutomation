package timeComplexityConcepts;

public class TimeComplexity {

	public static void main(String[] args) {

		// BIG O - time complexity
		// how much time taken to exceute the program

		int i = 1; // how many times this statement will be executed
		// O(1)

		int y = 2;
		int total = i + y;
		System.out.println(total);

		// O(N) -> N=1 -> O(1) -> constant time

		for (int k = 0; k <= 10; k++) {
			System.out.println(k);
		}

		// 1 + n + n + n = 1 + 3n => linear equation
		// 1+3n => 3n -> O(n)

		// two for loops
		for (int k = 0; k <= 10; k++) {
			System.out.println(k);
		}

		for (int k = 0; k <= 10; k++) {
			System.out.println(k);
		}

		
		// 3n + 3n => 6n => O(n) 
		
		
		// nested loops
		
	}

}
