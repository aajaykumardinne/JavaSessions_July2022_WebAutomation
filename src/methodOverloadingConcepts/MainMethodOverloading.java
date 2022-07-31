package methodOverloadingConcepts;

public class MainMethodOverloading {

	// command line arguments
	// static 
	public static int main(String[] a) {
		System.out.println("hi");
//		System.out.println(a.length);
//		System.out.println(a[0]);
		MainMethodOverloading.main();
		MainMethodOverloading.main(20);
		
		return 100;
	}

	public static void main() {
		System.out.println("bye");
	}

	public static void main(int b) {
		System.out.println("pop: " + b);
	}

}
