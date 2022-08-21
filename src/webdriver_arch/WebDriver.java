package webdriver_arch;

public interface WebDriver {
	
	// it is not mandatory to write abstract keyword for 
	// the methods declaration in the interface
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element,String value);
	
	public void close();

}
