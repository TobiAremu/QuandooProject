package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClasses.PageObjectInit;

public class LoginPage extends PageObjectInit {
	
	WebDriver driver;

	
	
	@FindBy(id = "username")
	WebElement txtUserName;
	
	@FindBy(id = "password")
	WebElement txtPassWord;
	
	@FindBy(css = "button[type ='submit']")
	WebElement btnLogin;
	
	@FindBy(css="div[id='flash']")
	WebElement msgErrorMessage;
	
	
	public SecurePage userLogin(String userName, String passWord) {
		txtUserName.sendKeys(userName);
		txtPassWord.sendKeys(passWord);
		btnLogin.click();
		
		return new SecurePage();
		
	}
	
	public String getInvalidCredentialsErrorMessage() {
		
		return msgErrorMessage.getText().trim();
	}

}
