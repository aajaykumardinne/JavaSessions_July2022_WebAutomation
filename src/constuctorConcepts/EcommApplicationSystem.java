package constuctorConcepts;

public class EcommApplicationSystem {

	/*
	 * Never declare the main method in the page class
	 */
	String name;
	int pages;
	String url;
	
	public EcommApplicationSystem(String name, int pages, String url) {
		
		//initialize the class variables
		this.name = name;
		this.pages = pages;
		this.url = url;
	}
	
	public int getPageCount(String appName) {
		
		switch (appName) {
		case "amazon":
			return pages;
		case "flipkart":
			return pages;	

		default:
			System.out.println("app" + appName + "is not found") ;
			return -1;
		}
		
	}
	
	
	
}
