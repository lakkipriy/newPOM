package Ebank;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class prioritised {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("bigboss");
  }
  @Test(enabled=false)
  public void meka() {
	  System.out.println("super singer");
  }
  @Test
  public void shehari1() {
	  System.out.println("super singer1");
  }
  @Test
  public void shehari2() {
	  System.out.println("super singer2");
  }
  @Test
  public void shehari3() {
	  System.out.println("super singer3");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("user1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("good morning");
  }
  @Test
  public void meka1() {
	  System.out.println("super singer5");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("good");
  }

}
