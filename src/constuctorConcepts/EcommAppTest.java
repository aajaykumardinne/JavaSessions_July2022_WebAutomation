package constuctorConcepts;

public class EcommAppTest {

	public static void main(String[] args) {
		
		EcommApplicationSystem appTest = new EcommApplicationSystem("amazon", 10, "https://wwww.amazon.com");

		/*
		 * always check the return type of the method
		 * getPageCount() -> returns int
		 */
		int c = appTest.getPageCount(appTest.name);
		System.out.println(c);
	}

}
