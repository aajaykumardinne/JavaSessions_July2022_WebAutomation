package methodOverloadingConcepts;

public class StaticMethodOverLoading {

	public static void printLogo(int x) {

		StaticMethodOverLoading.printLogo(x, 30);
	}

	public static void printLogo(int y, int z) {
		System.out.println(y+z);

	}

	public static String printLogo(String name) {
		return name + " logo ";
	}

	public static void main(String[] args) {

		
		String n = StaticMethodOverLoading.printLogo("aajay");
		System.out.println(n);
		
		StaticMethodOverLoading.printLogo(50);
	}

}
