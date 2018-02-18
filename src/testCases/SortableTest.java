package testCases;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseClasses.DriverContent;
import browserFactory.BrowserSelection;
import pageObject.SortablePage;

public class SortableTest {
	SortablePage sortablepage;
	
	@BeforeMethod
	public void setUp() {
		
		DriverContent.setDriverContent(BrowserSelection.SelectBrowser("chrome", "http://the-internet.herokuapp.com/tables#edit"));
		sortablepage = new SortablePage();

}
	
	@Test
	public void tableSortTestAscending(){
		ArrayList<String> allLastNames = sortablepage.getTableLastName();
		System.out.println("Original output from page: " + allLastNames);
		System.out.println("Expected sorted output in ascending order: " + sortablepage.sortedAscending());
		Assert.assertTrue(sortablepage.sortedAscending().equals(allLastNames));
		
		

	}
	
	@Test
	public void tableSortTestDescending() {
		ArrayList<String> allLastNames = sortablepage.getTableLastName();
		System.out.println("Original output from page: " + allLastNames);
		System.out.println("Expected sorted output in descending order: " + sortablepage.sortedDescending());
		Assert.assertTrue(sortablepage.sortedDescending().equals(allLastNames));
	}
	
	@AfterMethod
	public void quitDriver() {
		DriverContent.getDriver().quit();
	}
	
}
