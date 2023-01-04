package POMtests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Driverfact {
	
	@FindBy(id="gh-ac")
	WebElement ebaysearch;
	@FindBy(id="gh-btn")
	WebElement button;
	
	public WebElement search() {
		return(ebaysearch);
		
	}
	public WebElement buttonbt() {
		return(button);
	}
	


}
