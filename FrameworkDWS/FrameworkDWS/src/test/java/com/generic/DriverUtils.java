package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

public static WebDriver driver;
	
	public static void CreateDriver() {

	// TODO Auto-generated method stub                 
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\FrameworkDWS\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
	}
	
	public static WebDriver getDriver() {
		
		if(driver ==null)
		{
			CreateDriver();
		}
		
		return driver;
		
	}
}
