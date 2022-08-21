package webdriver_arch;

public class AmazonPageTest {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//chrome
		//firefox
		
	//	ChromeDriver driver = new ChromeDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
	//	SafariDriver driver = new SafariDriver();
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			//driver will be initialized 
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
		case "safari":
		     driver = new SafariDriver();
		default:
			System.out.println("please pass the right browser: " + browser);
			break;
		}
		
		//top/up casting
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.amazon.com");
		
		String title =	driver.getTitle();
		System.out.println(title);
		
		driver.sendKeys("emailId", "perserveranceandhope12@gmaoil.com");
		driver.sendKeys("password", "positiveandlearningatittude");

		driver.close();
	}

}
