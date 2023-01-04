package Ebank;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class lucky123 {
  @Test
  public void search() {
	  System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium Webdriver");
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).perform();
	  
	  
	  
  
  
  }
  
}
