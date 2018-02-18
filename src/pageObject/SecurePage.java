package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClasses.PageObjectInit;

public class SecurePage extends PageObjectInit{
	
	
	WebDriver driver;
	
	
	
	@FindBy(css = "div[id='flash']")
	public WebElement msgSecureMessage;
	
	
	public String getSecureMessage() {
		
		return msgSecureMessage.getText().trim();
	}

}
