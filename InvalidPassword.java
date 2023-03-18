package oops.web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\SeleniumProject\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver mf=new FirefoxDriver();
		mf.get("https://demo.guru99.com/V4/");
		mf.findElement(By.name("uid")).sendKeys("mngr481779");
		mf.findElement(By.name("password")).sendKeys("ydUje");
		mf.findElement(By.name("btnLogin")).click();
		Alert alt=mf.switchTo().alert();
		alt.accept();
	}

}
