package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Typecasting
			// 1. Widening type casting
		// Autoconversion of lower data types  into higher types.
		
		byte b = 5;
		short s = b;
		int i = b;
		long l = b;
		
		System.out.println(b);
		System.out.println(l);
		
		// 2. Narrowing type casting
		// conversion of higher data types into lower types.
		
		int r = 200;
		short s1 = (short) r;
		
		byte b1 =(byte) r;
		
		System.out.println(s1);
		System.out.println(b1);
		
		byte c = 127;
		byte d = 110;
		
		byte e = (byte) (c+d);
		System.out.println(e);
		
		int y = c + d;
		System.out.println(y);

		
		char g = 100;
		System.out.println(g+'e');
	}

}
