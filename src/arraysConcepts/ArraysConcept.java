package arraysConcepts;

public class ArraysConcept {

	public static void main(String[] args) {
		
		
		// very very important
		
		// Array Def: stores the similar type of data in a variable
		
		// 1. int array
		// ways of creating the static array
		// a. using the new keyword . new keyword is used to allocate the memory of the array
		// b. Array Iterals 
		
		
		// if you are not sure how many values you will store in the array
		// then create the array with new keyword
		
	//	int[] i = new int[4]; 
		int i[] = new int[4]; // 0-3
		// here i is the array name of type int and  length 4 
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
//		System.out.println(i[4]); 
// ArrayIndexOutOfBoundsException is thrown at the run time
		
		System.out.println(i[1]);
		System.out.println(i[2]);

		System.out.println("-----");
		
		
		// no concept of negative indexing in java
//		System.out.println(i[-2]); // ArrayIndexOutOfBoundsException
		
		// to print all the values in the array : iterate 
		
		// k represents indexing
		for(int k=0; k<i.length ; k++) {
			System.out.println(i[k]);  // i is the array name and k is the indexing
		}
		
		System.out.println("-----");
		
		// to print in reverse order
		for(int p=i.length-1; p>=0 ; p--) {
			System.out.println(i[p]);
		}
		

		System.out.println("-----");
		System.out.println(i[0] + i[1]);
		
		
		
		
		int j[] = new int[5];  // lowest index = 0 , highest index = 4
		// 5 is the array j length
		j[2] = 30;
		
		// default value of integer is zero
		System.out.println(j[3]);
		
		System.out.println(j[4]);
		

		System.out.println("-----");
		
		// 2. double array
		double d[] = new double[2]; // 0-1
		
		d[0] = 12.33;
		d[1] = 18.25;
		
		System.out.println(d[1]);
		
		System.out.println("-----");
		
		// number of iterations are fixed in for loop
		
		// 3. char array
		
		char c[] = new char[2];
		
		c[0] ='a';
		c[1] ='b';
		
		// default value of char is space
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		System.out.println(c[0] + c[1]);  // ascii values will be printed
		
		// here g represents the indexing
		// c is the array name
		for(int g=0 ; g<c.length ; g++) {
			System.out.println(c[g]);
		}
		
		// dis adv of array
		// can not store different data types
		
		
		
		// limitations of array
		// 1. similar type of data : to overcome this issue we have to use : Dynamic Array: ArrayList
		// 2. size is fixed : static array  to overcome this issue we have to use : Dynamic Array: ArrayList
		
		// major limitation is size is fixed
		
//		practical examples of static array
		// months in a year
		// days in a week
		// 6 balls in a over
		// menu items in a ecommerce application
		// flight ticket booking
		// book my show to book the movie tickets
		
		
		
		byte b[] = new byte[6];
		
		short b1[] = new short[8];
		
		int []h9 = new int[99];
		
		long h[] = new long[5];
		
		boolean b10[] = new boolean[90];
		
		char c2[] = new char[5];
		
		float b5[] = new float[9];
		
		double d5[] = new double[50];
		
		
		
		
	}

}
