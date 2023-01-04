package Ebank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class properties {
	
@FindBy(id="gh-ac")
WebElement uid;

@FindBy(id="gh-btn")
WebElement button;

public WebElement userid() {
	return(uid);
}
public WebElement searchbtn() {
	return(button);
}

}
