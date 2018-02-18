package baseClasses;

import org.openqa.selenium.WebDriver;

public class DriverContent {
	
	
	static WebDriver driver;
	
	public static void setDriverContent(WebDriver _driver) {
		
		driver = _driver;
		
		
	}

	public static WebDriver getDriver() {
		
		
		return driver;
	}
}
