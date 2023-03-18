package oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\SeleniumProject\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver mf=new FirefoxDriver();
		mf.get("https://demo.guru99.com/V4/");
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

}
