package incrementAndDecrementalOperators;

public class IncrementalAndDecremental {

	public static void main(String[] args) {

		// 1. post increment
		// variablename++

		int m = 2;
		int n = m++;
		/*
		 * assign the original value of m to n and then increment the value of m
		 */

		System.out.println(m); // 3
		System.out.println(n); // 2

		int p = -150;
		int q = p++;

		System.out.println(q); // -150
		System.out.println(p); // -149

		int a = 0;
		int b = a++;

		System.out.println(b); // 0
		System.out.println(a); // 1

		int count = 1;
		System.out.println(count++); // 1
		/*
		 * execution starts from the left to the right and then count =1 will be printed
		 * in the backend or in the memory the value will be incremented by 1
		 */
		System.out.println(count); // 2

		// 2. pre increment
		// ++variablename

		int i = 15;
		int j = ++i;
		/*
		 * Increment the value of i and then assign the incremental value to j
		 */

		System.out.println(i); // 16
		System.out.println(j); // 16

		int pop = 250;
		System.out.println(++pop);
		/*
		 * execution starts from the left to the right and then increment the value of
		 * pop and then print the value of pop
		 */
		System.out.println(pop);

		// 3.post decrement
		// variablename--

		int k = 7;
		int l = k--;
		/*
		 * assign the original value of k to l and then decrement the value of k
		 */

		System.out.println(k); // 6
		System.out.println(l); // 7

		int job = 10000;
		System.out.println(job--);
		/*
		 * execution starts from the left to the right and then job = 1000 will be
		 * printed . the value will be incremented by 1 in the backend or in the memory
		 */
		System.out.println(job);

		// 4. pre decrement
		// --variablename

		int u = 5000;
		int v = --u;

		System.out.println(u); // 4999
		System.out.println(v); // 4999

		int money = -400;
		System.out.println(--money); // -401
		System.out.println(money); // -401
		System.out.println(money++); // -401
		System.out.println(money); // -400

		int bal = 600;
		int totalBal = bal++ + 10;
		System.out.println(totalBal); // 610
		System.out.println(bal); // 601
		System.out.println(totalBal); // 610

		// practice question
		int le = 3;

		int te = ++le + le++ - le++; // le = 6

		System.out.println(te); // 3
		System.out.println(le);

//		int re = le+++le++-le++;  // le = 6
//		
//		System.out.println(re);   // re = 2
//		System.out.println(le);
	}

}
