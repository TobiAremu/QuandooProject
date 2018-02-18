package testCases;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClasses.DriverContent;
import browserFactory.BrowserSelection;
import pageObject.HoverPage;

public class HoverTestCase {
	
	HoverPage hoverpage;
	
	
	@BeforeMethod
	public void setUp() {
		
		DriverContent.setDriverContent(BrowserSelection.SelectBrowser("chrome", "http://the-internet.herokuapp.com/hovers"));
		hoverpage = new HoverPage();
		DriverContent.getDriver().manage().window().maximize();
		
		
	}
	
	@Test
	public void firstImageHover() throws InterruptedException {
		
		SoftAssert softassert = new SoftAssert();
		
		DriverContent.getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		hoverpage.moveElementTo(hoverpage.user1Image);
		
		
		boolean profile_1_Displayed = hoverpage.user1Profile.isDisplayed();
		Thread.sleep(1000);
		softassert.assertTrue(profile_1_Displayed);
		
		hoverpage.moveElementTo(hoverpage.user2Image);
		Thread.sleep(1000);
		boolean profile_2_Displayed = hoverpage.user2Profile.isDisplayed();
		softassert.assertTrue(profile_2_Displayed);
		
		hoverpage.moveElementTo(hoverpage.user3Image);
		Thread.sleep(1000);
		boolean profile_3_Displayed = hoverpage.user3Profile.isDisplayed();
		softassert.assertTrue(profile_3_Displayed);
		
		softassert.assertAll();

		
	}
	
	@AfterMethod
	public void quitDriver() {
		DriverContent.getDriver().quit();
	}

}
