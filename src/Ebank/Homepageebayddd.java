package Ebank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class Homepageebayddd {
	public WebDriver driver;
@BeforeMethod
	public void bujji(){
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		properties p=PageFactory.initElements(driver,properties.class);
//		p.userid().sendKeys("sony");
//		p.searchbtn().click();
	}

}
