package dataTypes;

/**
 * @author Aajay Kumar Dinne Date : june 30 th 2022
 */
public class DataTypesConcept {

	public static void main(String[] args) {

		// data types:
		// indicates the type of the data
		// strict data type
		// 1.primitive data types: can be used directly inside the memory
		// no need to create the object
		// a. boolean type: boolean (true/false)
		// b. Numeric type:
		// b.1: character type : char
		// b.2: Integral type:
		// b.2.1 Integer : byte,short,int,long
		// b.2.2 floating-point: float,double

		// 2.non-primitive data types : Class, String , Array,Interface , Abstract class

		// 1. byte
		// size: 1 byte = bits
		// range: -128 to 127 or -2^7 to 2^7-1
		byte b = 1;
		b = 20;
		System.out.println(b); // 20
		byte b1 = -10;
		
		// 2. short
		// size : 2 bytes = 2*8 = 16 bits
		// range : -32768 to 32767 or -2^15 to 2^15-1
		short s = 10000;
		System.out.println(s);
		
		/*
		 * bad practice which leads to wastage of memory
		 */
		short s1 = 25;
		System.out.println(s1);
		
		
		// 3. int
		// size : 4 bytes : 4*8 = 32 bits
		// range : -2^31 to 2^31-1
		int i = 1211211;
		int p = 1;
		int d = 4;
		System.out.println(p+d);  // peforms the arithmetic operation
		
		// 4. long
		// size : 8 bytes : 8*8 = 64 bits
		// range: -2^63 to 2^63-1
		long num = 5893539053905L; // l or L
		System.out.println(num);
		
		/*
		 * bad practice which leads to wastage of memory
		 */
		long dist = 10;
		
		
		// floating point
		// 5. float 
		// size : 4 bytes = 4 * 8 = 32 bits
		// stores the decimal/fractional numbers upto 7 digits after the decimal point
		float f = 15.67f;
		System.out.println(f);
		float f1 = (float) 12.84;
		System.out.println(f1);
		float f3 = 100;
		System.out.println(f3);
		
		float f2 = -55;
		System.out.println(f2);
		
		// 6 . double
	    // size : 8 bytes = 8 * 8 = 64 bits
		// stores the decimal/fractional numbers upto 16 digits after the decimal point\
		double t = 18.15;
		double h = -1546.78;
		System.out.println(t);
		System.out.println(h);
		
		// float and double can also store the negative fractional numbers also
		
		double t2 = 10.24;
		double t3 = 16.43;
		
		System.out.println(t2+t3);
		
		// 7. char
		// size : 2 bytes = 16 bits
		
		// stores single character or single number or ASCII values
		// stores ASCII values when you perform any arithmetic operation
		
		char r ='a';
		char l = 'd';
		
		System.out.println(r); // a
		System.out.println(l); // d
		System.out.println(r+l); // 97 + 100 
		
		char n = '1';
		char p3 = '$';
		
		System.out.println(n);
		System.out.println(n+p3);
		
		
		// ASCII range
		// a-z : 97 to 122
		// A-Z : 65 to 90
		// 0-9 : 48 to 57
		
		// get the ASCII values
		System.out.println((byte)r);
		System.out.println((int) 'z');
		
		char gender ='m';
		char currency ='$';
		
		// 8. boolean : true/false
		// size : ~1 bit
		boolean y = true;
		
		System.out.println(y);
		System.out.println(false);
		
		boolean flag = true;
		System.out.println(flag);
	}

}
