package pageObject;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClasses.MySortClass;
import baseClasses.PageObjectInit;

public class SortablePage extends PageObjectInit {
	
	
	@FindBy(css = "td[class='last-name']")
	List <WebElement> tblLastName;
	
	
	public ArrayList<String> getTableLastName() {
		ArrayList<String> Name = new ArrayList<String>();
		
		
		for(WebElement LastName: tblLastName) {
			
			Name.add(LastName.getText());
			
		}
		return Name;
		
	}
	
	public ArrayList<String> sortedAscending() {
		ArrayList<String> isSorted =  getTableLastName();
		Collections.sort(isSorted);
		return isSorted;
		
	}
	
	public ArrayList<String> sortedDescending(){
		MySortClass mysortclass = new MySortClass();
		
		ArrayList<String> isSorted =  getTableLastName();
		Collections.sort(isSorted, mysortclass);
		return isSorted;
		
	}

}
