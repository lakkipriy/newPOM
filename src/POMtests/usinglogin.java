package POMtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class usinglogin {
	public static WebDriver driver;

@BeforeTest
public void Esearch() {
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		

	}

}
