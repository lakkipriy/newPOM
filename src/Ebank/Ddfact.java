package Ebank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Ddfact {
	public WebDriver driver;
	@BeforeTest
	public void search() {
	System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


}
}