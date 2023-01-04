package Ebank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestDemo {
	
	@Test
	@Parameters({"ddValue","txtValue"})
	public void Search(String ddValue,String txtValue ){
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
//		WebdriverManager.chromedriver().browserversion("108").setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		s.selectByVisibleText(ddValue);
		driver.findElement(By.id("gh-ac")).sendKeys(txtValue);
		driver.findElement(By.id("gh-btn")).click();
		Reporter.log("'" + txtValue + "' Product Search in '" + ddValue + "' Category Test is Successful..",true);
		
				
		
	}

}


