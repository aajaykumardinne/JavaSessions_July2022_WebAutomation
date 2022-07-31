package assignmentsList;

public class LoopsAssignment {

	public static void main(String[] args) {
		
		// 1. print I am Batman four times
		int z = 1;
		for(;z<=4;) {
			System.out.println("I am Batman");
			z++;
		}

		System.out.println("******");
		
		// 2. print I am Batman 1 to I am Batman 9
		int x = 1;
		for(;x<=9;x++) {
			System.out.println("I am Batman " + x);
		}
		
		System.out.println("******");
		
		// 3.1 print 10 to 1 using the while loop
		
		int  rowCount = 10;
		while(rowCount>=1) {
			System.out.println(rowCount);
			rowCount--;
		}
		System.out.println("******");
		
		// 3.2 print 10 to 1 using the for loop
		
		int h = 10;
		for(;h>=1 ; h--) {
			System.out.println(h);
		}
		
		System.out.println("******");
		
		// 3.3 print 10 to 1 using the do-while loop
		
		int i = 10;
		do {
			System.out.println(i);
			i = i-1;
			
		}while(i>=1);
		System.out.println("******");
		
		// 4. print Hello world ten times using the while loop
		
		int y=1;
		while(y<=10) {
			System.out.println("Hello World");
			y = y + 1;
		}
		
		System.out.println("******");
		
		// 5. print 1 to 10 using the while loop
		
		int v = 1;
		while(v<=10) {
			System.out.println(v);
			++v;
		}
		
		System.out.println("******");
		
		// 6. max number from the given positive numbers
		
		
		
		
		// 7.1  print odd numbers from 1 to 100
		
		int a = 1;
		while(a<=100) {
			System.out.println(a);
			a = a + 2;
		}
		System.out.println("******");
		
		// 7.2 print even numbers from 1 to 100
		
		int b = 2;
		for(;b<=100;) {
			System.out.println(b);
			b = b+2;
		}
		
		System.out.println("******");
		
		// 8. output of the following program -- infinite loop
		// solution - write a condition/statement to come out of the infinite loop
		int i1 = 1;
		while(i1<=1) {
			System.out.println("Hi Java");
			break;
		}
		System.out.println("******");
		
		// 9.1 print A-Z with ASCII numbers 
		
		for(char d='A'; d<='Z'; d++) {
			System.out.println(d + ":" + (int)d);
		}
		System.out.println("******");
		
		// 9.2 print a-z with ASCII numbers
		for(char e='a'; e<='z'; e++) {
			System.out.println(e + ":" + (int)e);
		}
		System.out.println("******");
		
		// 9.3 print 0-9 with ASCII numbers
		for(char f='0'; f<='9'; f++) {
			System.out.println(f + ":" + (int)f);
		}
		System.out.println("******");
		
		// char is represented in single quotes in java
		
		// 10. print 1.0 2.0  10.0
		double r1 = 1.0;
		while(r1<=10.0) {
			System.out.println(r1);
			++r1;
		}
		System.out.println("******");
		
		// 11 print 1 to 10 break the loop once the multiplication of 7
		// with a message "bye , see you tomorrow"
		
		int i3 = 1;
		for(;i3<=10;) {
			System.out.println(i3);
			if(i3 % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
		i3++;	
		}
		
		System.out.println("******");
		
		// 12.1 cricket score card system using the for loop
		int score = 0;
		for(;score<=100;score++) {
			System.out.println(score);
			if(score == 0) {
				System.out.println("Zero - duck");
			}
			if(score == 25) {
				System.out.println("good job");
			//	break;
			}
			if(score == 50) {
				System.out.println("good job - half century");
			}
			if(score == 100) {
				System.out.println("good job - century");
			}
			
		}
		System.out.println("******");
		
		// 12.2 cricket score card system using the while loop
		
		int score1 = 0;
		while(score1<=100) {
			System.out.println(score1);
			if(score1 == 0) {
				System.out.println("Zero - duck");
			}
			if(score1 == 25) {
				System.out.println("good job");
			//	break;
			}
			if(score1 == 50) {
				System.out.println("good job - half century");
			}
			if(score1 == 100) {
				System.out.println("good job - century");
			}
			score1++;
		}
		
		
	
		
	}

}
