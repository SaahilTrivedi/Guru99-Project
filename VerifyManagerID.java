package oops.web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class VerifyManagerID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\SeleniumProject\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver mf=new FirefoxDriver();
		mf.get("https://demo.guru99.com/V4/");
		mf.findElement(By.name("uid")).sendKeys("mngr481779");
		mf.findElement(By.name("password")).sendKeys("ydUjepE");
		mf.findElement(By.name("btnLogin")).click();
		//mf.findElement(By.linkText("See a sample prompt")).click();
		JavascriptExecutor js = (JavascriptExecutor) mf;

		js.executeScript("alert('Verify the Manager ID')");
		Alert ar=mf.switchTo().alert();
		ar.accept();
		}

}
