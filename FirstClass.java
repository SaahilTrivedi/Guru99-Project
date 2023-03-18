package oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\SeleniumProject\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://demo.guru99.com/V4/");
		d.findElement(By.name("uid")).sendKeys("mngr481779");
		d.findElement(By.name("password")).sendKeys("ydUjepE");
		d.findElement(By.name("btnLogin")).click();
	}

}
