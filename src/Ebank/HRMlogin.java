package Ebank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRMlogin {
	@FindBy(name="username")
	WebElement uid;

@FindBy(name="password")
WebElement pwd;


public WebElement Ologin() {
	
	return(uid);
}
public WebElement password() {
	return(pwd);
}

}