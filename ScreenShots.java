package oops.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShots {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\SeleniumProject\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver mf=new FirefoxDriver();
		mf.get("https://demo.guru99.com/V4/");
		mf.findElement(By.name("uid")).sendKeys("mngr481779");
		mf.findElement(By.name("password")).sendKeys("ydUjepE");
		mf.findElement(By.name("btnLogin")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) mf;
        
		js.executeScript("alert('Verify the Manager ID')");
		Thread.sleep(1800);
		TakesScreenshot scrshot=((TakesScreenshot)mf);

		

		File srcfile=scrshot.getScreenshotAs(OutputType.FILE);

		

		File destfile=new File("D:\\sahil\\Selenium\\samplepic56.jpg");

		

		FileUtils.copyFile(srcfile, destfile);
	}

}
