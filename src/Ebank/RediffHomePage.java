package Ebank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePage {

	@FindBy(id = "login1")
	WebElement userid;

	@FindBy(id = "password")
	WebElement pwd;

	@FindBy(name = "proceed")
	WebElement signin1;

	public WebElement useridobj() {
		return (userid);
	}

	public WebElement passwdobj() {
		return (pwd);

	}

	public WebElement signin10bj() {
		return (signin1);
	}

}
