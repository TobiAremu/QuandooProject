package baseClasses;

import org.openqa.selenium.support.PageFactory;

public abstract class PageObjectInit {
	
	public PageObjectInit() {
		
		PageFactory.initElements(DriverContent.getDriver(), this);
	}

}
