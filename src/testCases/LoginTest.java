package testCases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.DriverContent;
import browserFactory.BrowserSelection;
import pageObject.LoginPage;
import pageObject.SecurePage;

public class LoginTest {
	LoginPage loginpage;
	SecurePage securepage;
	WebDriver driver;
	final String errorMessage ="Your username is invalid!";
	final String errorMessage2 ="Your password is invalid!";
	final String secureMessage = "You logged into a secure area!";
	
	@BeforeMethod
	public void setUp() {
		
		DriverContent.setDriverContent(BrowserSelection.SelectBrowser("chrome", "http://the-internet.herokuapp.com/login"));
		loginpage = new LoginPage();
		DriverContent.getDriver().manage().window().maximize();
		
		
	}
	
	@Test
	public void testCorrectUserNameCorrectPassWord() {
		securepage = loginpage.userLogin("tomsmith", "SuperSecretPassword!");
		String Actual = securepage.getSecureMessage();
		Assert.assertEquals(secureMessage.trim(), Actual.substring(0, 30));
		
	}
	
	@Test
	public void testWrongUserNameCorrectPassWord() {
		
		loginpage.userLogin("tomsmith01", "SuperSecretPassword!");
		String Actual = loginpage.getInvalidCredentialsErrorMessage();
		Assert.assertEquals(errorMessage.trim(), Actual.substring(0, 25));
		
	}
	
	@Test
	public void testCorrectUserNameWrongPassWord() {
		
		loginpage.userLogin("tomsmith", "SuperSecretPassword!01");
		String Actual = loginpage.getInvalidCredentialsErrorMessage();
		Assert.assertEquals(errorMessage2.trim(), Actual.substring(0, 25));
		
	}
	
	
	@AfterMethod
	public void quitDriver() {
		DriverContent.getDriver().quit();
	}

}
