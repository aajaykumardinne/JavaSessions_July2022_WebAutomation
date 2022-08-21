package stackMemory;

public class A {

	public static void main(String[] aajay) {

		// infinite calling
		System.out.println("A-main");

		B.main(aajay);
	}
}
