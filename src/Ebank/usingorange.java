package Ebank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class usingorange {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
			HRMlogin rm=PageFactory.initElements(driver,HRMlogin.class);
			rm.Ologin().sendKeys("lucky");
			rm.password().sendKeys("bjji");
			rm.login2().click();
			
			
						

		

	}

}
