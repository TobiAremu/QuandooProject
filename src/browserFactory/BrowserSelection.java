package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelection {
	
	
	static WebDriver driver;
	
	public static WebDriver SelectBrowser(String browserName, String url) {
		
		if (browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		}
		driver.get(url);
		return driver;
		
	}

}
