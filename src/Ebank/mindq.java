package Ebank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class mindq {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("//a[@class='mailicon']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Loginpage lp=PageFactory.initElements(driver,Loginpage.class);
		RediffHomePage rp=PageFactory.initElements(driver,RediffHomePage.class);
		lp.signlinkobj().click();
		Thread.sleep(3000);
		rp.useridobj().sendKeys("priya");
		Thread.sleep(3000);
		rp.passwdobj().sendKeys("priya123");
		Thread.sleep(3000);
		rp.signin10bj().click();
		Thread.sleep(3000);
		

	}

}
