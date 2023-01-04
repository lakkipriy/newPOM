package POMTests12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PomHomePage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Pomobjects po=PageFactory.initElements(driver,Pomobjects.class);
	po.userid().sendKeys("sony");
	po.buttonsearch().click();

	}

}
