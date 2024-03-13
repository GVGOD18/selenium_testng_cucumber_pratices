package com.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test5Synconization {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		//login
//		driver.findElement(By.xpath("//a[contains(@class, 'login')]")).click();
		WebDriverWait wait=new WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		wait.until(ExpectedConditions.titleContains("Demo Web Shop"));
		System.out.println("Website Page Loaded");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Log")));
		driver.findElement(By.partialLinkText("Log in")).click();
		System.out.println("Login Page Loaded");
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("gnnanavel@gmail.com");
		wait.until(ExpectedConditions.attributeToBe(driver.findElement(By.name("Email")), "value", "gnnanavel@gmail.com"));
		System.out.println("email is present");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("26Nov@2001");
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.attributeToBe(driver.findElement(By.name("Password")), "value", "26Nov@2001"));
		System.out.println("password is present");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.button-1.login-button[type='submit']")));
		driver.findElement(By.cssSelector("input.button-1.login-button[type='submit']")).click();
		System.out.println("login successful");
//		driver.findElement(By.xpath("(//input[contains(@type,'submit')])[2]")).click();
//		Thread.sleep(1000);
		
		//book
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Books")));
		System.out.println("Books option is visible");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
//		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Price: Low to High");
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Computing and Internet")));
		driver.findElement(By.linkText("Computing and Internet")).click();
		System.out.println("item is clicked");
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id,'add-to-cart')]")));
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart')]")).click();
		System.out.println("added to cart");
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Shopping cart")));
		driver.findElement(By.linkText("Shopping cart")).click();
		System.out.println("cart page link");
//		driver.findElement(By.xpath("(//input[contains(@value,'Add to cart')])[1]")).click();
//		Thread.sleep(2000);
		
		// cart page
//		driver.findElement(By.xpath("(//a[contains(@href,'/cart')])[1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[contains(@type,'checkbox')])[2]")));
		driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
		System.out.println("checkbox clicked");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@name,'checkout')]")));
		driver.findElement(By.xpath("//button[contains(@name,'checkout')]")).click();
		System.out.println("checkout button clicked");
		
		//checkout billing address
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@name,'BillingNewAddress.City')]")).sendKeys("Chennai");
//		driver.findElement(By.xpath("//input[contains(@name,'BillingNewAddress.Address1')]")).sendKeys("No.15, 12th street, main road, vandalur");
//		driver.findElement(By.xpath("//input[contains(@name,'BillingNewAddress.ZipPostalCode')]")).sendKeys("600127");
//		driver.findElement(By.xpath("//input[contains(@name,'BillingNewAddress.PhoneNumber')]")).sendKeys("9073987620");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@onclick,'Billing.save')]")));
		driver.findElement(By.xpath("//input[contains(@onclick,'Billing.save')]")).click();
		System.out.println("Billing address confirmed");
		//shipping address
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[contains(@onclick,'Shipping.save')])")));
		driver.findElement(By.xpath("(//input[contains(@onclick,'Shipping.save')])")).click();
		System.out.println("Shipping address confirmed");
		//shipping method
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id ='shippingoption_1']")));
		WebElement button2 = driver.findElement(By.id("shippingoption_1"));
        button2.click();
        System.out.println("credit card option is selected");
        wait.until(ExpectedConditions.elementToBeSelected(button2));
        System.out.println("button2 selected");
//		driver.findElement(By.id("shippingoption_1")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@onclick,'ShippingMethod.save')]")));
		driver.findElement(By.xpath("//input[contains(@onclick,'ShippingMethod.save')]")).click();
		System.out.println("Shipping method confirmed");
		//payment method 
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id ='paymentmethod_3']")));
        WebElement button = driver.findElement(By.id("paymentmethod_3"));
        button.click();
        System.out.println("Purchase order option is selected");
        wait.until(ExpectedConditions.elementToBeSelected(button));
        System.out.println("button selected");
//		driver.findElement(By.id("paymentmethod_3")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id ='paymentmethod_3']")));
		driver.findElement(By.xpath("//input[contains(@onclick,'PaymentMethod.save')]")).click();
		System.out.println("payment method confirmed");
		//payment info
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@onclick,'PaymentInfo.save')]")));
		driver.findElement(By.xpath("//input[contains(@onclick,'PaymentInfo.save')]")).click(); 
		System.out.println("payment info confirmed");
		//confirm order
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@onclick,'ConfirmOrder.save')]")));
		driver.findElement(By.xpath("//input[contains(@onclick,'ConfirmOrder.save')]")).click();
		System.out.println("order confirmed");
		
		//thank you 
//		Thread.sleep(2000);
		TakesScreenshot scr=(TakesScreenshot)driver;
		File src=scr.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\hexaware sdet training\\Automation notes\\pratice screenshots\\Screenshot1.png");
		FileUtils.copyFile(src, dest);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@type,'button')]")));
		driver.findElement(By.xpath("//input[contains(@type,'button')]")).click();
		System.out.println("continued to home page");
	}

}
