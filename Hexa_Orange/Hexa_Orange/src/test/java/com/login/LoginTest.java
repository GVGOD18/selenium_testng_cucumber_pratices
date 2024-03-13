package com.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(lp.textUsername));
		lp.enterUsername("Admin");
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(lp.textPassword));
		lp.enterPassword("admin123");
//		Thread.sleep(2000);
		lp.clickLogin();

	}

}
