package Ebank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	@FindBy(linkText="Sign in")
	WebElement signinlink;
	
	public WebElement signlinkobj() {
		
		return(signinlink);
	}

}
