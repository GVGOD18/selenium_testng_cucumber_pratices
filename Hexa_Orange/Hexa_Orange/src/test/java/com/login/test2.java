package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

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
		driver.findElement(By.cssSelector("input.button-1.login-button[type='submit']")).click();
//		driver.findElement(By.xpath("(//input[contains(@type,'submit')])[2]")).click();
		Thread.sleep(1000);
		
		//book
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Computing and Internet")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Shopping cart")).click();
//		driver.findElement(By.xpath("(//input[contains(@value,'Add to cart')])[1]")).click();
		Thread.sleep(2000);
		
		// cart page
//		driver.findElement(By.xpath("(//a[contains(@href,'/cart')])[1]")).click();
		driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
		driver.findElement(By.xpath("//button[contains(@name,'checkout')]")).click();
		
		//checkout billing address
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@name,'BillingNewAddress.City')]")).sendKeys("Chennai");
//		driver.findElement(By.xpath("//input[contains(@name,'BillingNewAddress.Address1')]")).sendKeys("No.15, 12th street, main road, vandalur");
//		driver.findElement(By.xpath("//input[contains(@name,'BillingNewAddress.ZipPostalCode')]")).sendKeys("600127");
//		driver.findElement(By.xpath("//input[contains(@name,'BillingNewAddress.PhoneNumber')]")).sendKeys("9073987620");
		driver.findElement(By.xpath("//input[contains(@onclick,'Billing.save')]")).click();
		//shipping address
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@onclick,'Shipping.save')])")).click();
		//shipping method
		Thread.sleep(2000);
		driver.findElement(By.id("shippingoption_1")).click();
		driver.findElement(By.xpath("//input[contains(@onclick,'ShippingMethod.save')]")).click();
		//payment method 
		Thread.sleep(2000);
		driver.findElement(By.id("paymentmethod_3")).click();
		driver.findElement(By.xpath("//input[contains(@onclick,'PaymentMethod.save')]")).click(); 
		//payment info
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@onclick,'PaymentInfo.save')]")).click(); 
		//confirm order
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@onclick,'ConfirmOrder.save')]")).click();
		
		//thank you 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'button')]")).click();
		
	}

}
