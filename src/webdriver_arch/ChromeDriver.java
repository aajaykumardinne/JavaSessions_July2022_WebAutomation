package webdriver_arch;

public class ChromeDriver implements WebDriver {

	//ChromeDriver class responsibility is
	//to implement the methods present in the 
	//WebDriver interface
	
	
	public  ChromeDriver() {
		System.out.println("launch chrome browser");
	}
	
	
	@Override
	public void get(String url) {
		System.out.println("launch url: " + url);
	}

	@Override
	public String getTitle() {
		return "amazon";
	}
       

	@Override
	public void click(String element) {
		System.out.println("click on the : " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering the element: " + value);
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}

}
