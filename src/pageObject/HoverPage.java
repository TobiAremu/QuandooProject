package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import baseClasses.DriverContent;
import baseClasses.PageObjectInit;

public class HoverPage extends PageObjectInit {
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/img")
	public WebElement user1Image;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/h5")
	public WebElement user1Profile;
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/img")
	public WebElement user2Image;
	
	@FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div/h5")
	public WebElement user2Profile;
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/img")
	public WebElement user3Image;
	
	@FindBy(xpath ="/html/body/div[2]/div/div/div[3]/div/h5")
	public WebElement user3Profile;
	
	
	
	public void moveElementTo(WebElement element) {
		Actions action = new Actions(DriverContent.getDriver());
		action.moveToElement(element).build().perform();
	}

}



