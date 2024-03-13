package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
		/*driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
			driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		Thread.sleep(3000);
		driver.close();*/
	}

}
