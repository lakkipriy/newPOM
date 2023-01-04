package Ebank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageTests {
	@FindBy(name="username")
	WebElement uid;
	
@FindBy(name="password")
WebElement pwd;
@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
WebElement login;


public WebElement userName1() {
	return(uid);
}
	
	public WebElement password1() {
		return(pwd);
	}
	public WebElement login1() {
		
		return(login);
		
	}
}

