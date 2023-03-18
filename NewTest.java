package oops.web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver mf;
  @Test
  public void f() 
  {
	    mf.findElement(By.name("uid")).sendKeys("mngr481779");
		mf.findElement(By.name("password")).sendKeys("ydUjepE");
		mf.findElement(By.name("btnLogin")).click();
		String ExpectedTitle="Guru99 Bank Manager HomePage";
		String ActualTitle=mf.getTitle();
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Expected Title Matches with the Actual Title");
		}
		else
		{
			System.out.println("Expected Title Matches with the Actual Title");
		}
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\SeleniumProject\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		mf=new FirefoxDriver();
		mf.get("https://demo.guru99.com/V4/");
		mf.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  mf.close();
  }

}
