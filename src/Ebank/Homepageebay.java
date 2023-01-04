package Ebank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import priyaroy.Dfactory;
import priyaroy.pageobjects;

public class Homepageebay extends Homepageebayddd {
    @Test
	public void search() {
    	properties hr=PageFactory.initElements(driver,properties.class);
    	hr.userid().sendKeys("sony");
    	hr.searchbtn().click();;
   
	
	}

}
//System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
//WebDriver driver=new ChromeDriver(); 
//driver.get("https://www.ebay.com");
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
