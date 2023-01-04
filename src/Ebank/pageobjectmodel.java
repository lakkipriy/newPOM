package Ebank;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmodel {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	pageTests pot=PageFactory.initElements(driver,pageTests.class);
	pot.userName1().sendKeys("bujji");
	Thread.sleep(3000);
	pot.password1().sendKeys("lucky");
	
			
	

	}

}
