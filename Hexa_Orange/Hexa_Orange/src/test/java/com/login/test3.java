package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		//login
//		driver.findElement(By.xpath("//a[contains(@class, 'login')]")).click();
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("gnnanavel@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("26Nov@2001");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[contains(@type,'submit')])[2]")).click();
		Thread.sleep(1000);
		
		//book
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Computing and Internet")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("shopping cart")).click();
	}

}
