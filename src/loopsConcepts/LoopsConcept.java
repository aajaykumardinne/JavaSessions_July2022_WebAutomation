package loopsConcepts;

public class LoopsConcept {

	// always the understand the code line by line
	public static void main(String[] args) {
		
		// Loop def : to avoid the repetitive statements we need to write the loops
		
	//	1 to 10
	// 1. while loop
		int i=1; // start
		while(i<=10) { // condition
			System.out.println(i);
		//	i++;
		//	++i;
			i = i+1;  // condition/statement to come out of the infinite loop
		}
		
		System.out.println("--------");
		
		// 1 to 10: 0 2 4 6 8 10 - even numbers
		
		int j = 0;
		while(j<=10) {
			System.out.println(j);
			j=j+2;
		}
		
		System.out.println("--------");
		
		// 1 to 10: 1 3 5 7 9 - odd numbers
		
		int l = 1;
		while(l<10) {
			System.out.println(l);
			l = l+2;
		}
		
		System.out.println("--------");
		
		// example of infinite loop
		while(true) {
			System.out.println("Welcome to the University");
			break;
		}
		
		System.out.println("--------");
		// Solution : write statement to come out of the infinite loop
		// write break in the above program
		
		// 1 to 100
		// multiplication of 5 -> print hi
		int m = 1;
		while(m<=100) {
			System.out.println(m);
			if(m % 5 == 0) {
				System.out.println("hi.....");
			}
			if(m == 50) {
				System.out.println("half century");
				break;
			}
			if(m == 100) {
				System.out.println("century ");
			}
		m++;	
		}
		
		System.out.println("--------");
		// break does not means coming out of the if condition it means 
		// coming out of the entire while loop in the above example
		
		// use cases of the while loop
		// when number of iterations are not fixed
		// page loading time
		// no of web elements on the page -- 10, 20, 40 
		// web table - pagination -> 1 2 3 4 5 .. next
			
		
		// 2. for loop
		
		// any loop can generate the infinite loop we need to write the 
		// right logic to come out of the infinite loop
		
		// 1 to 10
		for(int p=1; p<=10 ; p++) {
			System.out.println(p);
		}
		System.out.println("--------");
		
//		various ways of writing the for loop
		int t = 1;
		for(; t<=10 ; t++) {
			System.out.println(t);
		}
		System.out.println("--------");
		
		int s = 1;
		for(; s<=10 ; ) {
			System.out.println(s);
			s++;
		}
		System.out.println("--------");
		
		// break can be used in the for loop
		// break is used to come out of the loop
		int z = 1;
		for(;z<=10;z++) {
			System.out.println(z);
			if(z==6) {
				break;
			}
		}

		System.out.println("--------");
		// infinite loop example
		for(;;) {
			System.out.println("bye");
			break;
		}
		
		System.out.println("--------");
		
		for(byte b=1 ; b<=10 ; b++) {
			System.out.println(b);
		}
		
		System.out.println("--------");
		
		for(double d=12.0; d<=20.0; d++) {
			System.out.println(d);
		}
		
		System.out.println("--------");
		
		// chars can be used to increase the value in for loops
		// print all the ASCII values of the character
		// print A to Z along with ASCII number on the console
		// for loops because you know how many iterations to perform
		
		for(char c='A' ; c<='Z'; c++) {
			System.out.println(c + " : " + (int)c);
		}
		
		System.out.println("--------");
		
		for(char c1 = '0'; c1<='9' ; c1++) {
			System.out.println(c1 + " : " + (int)c1);
		}
		
		System.out.println("--------");
		
		for(char c2 = 'a'; c2<='z' ; c2++) {
			System.out.println(c2 + " : " + (int)c2);
		}
		
		System.out.println("--------");
		
		// use cases for the for loop
		// when number of iterations are fixed:
		// 5 elements - fixed
		
		// for 10 to 1
		for(int h=10; h>=1; h--) {
			System.out.println(h);
		}
		
		System.out.println("--------");
		
		// 3. do-while	
		
		// 1 to 10
		
		int p = 1;
		do {
			p++;
			System.out.println(p);// this line will be executed at least once
			// p++;
		} while (p<=10);
		
		System.out.println("--------");
		// uses cases 
		// 1 2 3 4 5 6 -> web table pagination if the element is available on the first page
		
		
		// 10 to 1 
		int count = 10;
		for(;count>=1;count--) {
			System.out.println(count);
		}
		
	}

}
