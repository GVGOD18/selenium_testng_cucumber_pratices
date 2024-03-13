package com.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMDataProvider {
	// this code for @parameters 
//	@Test
//	@Parameters({"Username","Password"})
//	public void login(String un, String pw)
//	{
//		System.out.println(un + " " + pw);
//	}
	
	//this code for @DataProvider
	
//	@DataProvider
//	public Object[][] getData()
//	{
//			Object[][] Data=new Object[2][2];
//			Data[0][0]="UserA";
//			Data[0][1]="PassA";
//			Data[1][0]="UserB";
//			Data[1][1]="PassB";
// 
//		return Data;
//	}
//	@Test(dataProvider="getData")
//	public void test(Object un,Object pw)
//	{
//		Reporter.log(un + " " + pw,true);
//	}
	
	@DataProvider
	public Object[][] getData()
	{
			Object[][] Data=new Object[2][2];
			Data[0][0]="Admin";
			Data[0][1]="admin123";
			Data[1][0]="UserB";
			Data[1][1]="PassB";
 
		return Data;
	}
	@Test(dataProvider="getData")
	public void test(String un,String pd)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']")));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		driver.findElement(By.name("password")).sendKeys(pd);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}

}
