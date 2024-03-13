package com.login;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test6AmazonImplementationAssig {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(30000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElement(By.xpath("//input[contains(@name,'field-')]")).sendKeys("Iphone");

		List<WebElement> suggestion = driver.findElements(By.xpath("//div[contains(@aria-label,'iphone')]"));
		
		int count = suggestion.size();
		
		System.out.println(count);
		
//		String s = "iphone 15 pro max";
		
		for(int i=0;i<count;i++) {
			WebElement element=suggestion.get(i);
			if(element.getText().equalsIgnoreCase("iphone 15 pro max")) {
				System.out.println(element.getText());
				driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[4]")).click();
				break;
			}
		}
		
//		for (WebElement webElement : suggestion) {
//			System.out.println(webElement.getText());
//			String text = webElement.getText();
//			if(text.equalsIgnoreCase(s)) {
//				wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
//				//webElement.click();
//				break;
//			}
//		}
		
//		for(int i=0; i<count; i++) {
//			WebElement element1 = suggestion.get(i);
////			Thread.sleep(2000);
//			System.out.println(element1.getText());
////			Thread.sleep(2000);
//			if(element1.getText().contains("iphone 15 pro")) {
//				element1.click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("(//span[contains(text(),'iPhone 15 Pro (128 GB) - Natural Titanium')])[1]")).click();
		
		String parent_handle= driver.getWindowHandle();
		System.out.println(parent_handle);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for(String handle1:handles) {
		    if(!handle1.equalsIgnoreCase(parent_handle))
		    {
		        driver.switchTo().window(handle1);
		        break;	
		    }
		}
		
		System.out.println("button");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[contains(@name,'submit.add-to-cart')])[2]"))).click();
		driver.findElement(By.xpath("//input[contains(@aria-labelledby,'attach-sidesheet-checkout-button-announce')]")).click();
		
//		driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']"))).click();
		System.out.println("Shipping address confirmed");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[4]"))).click();
//		driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[4]")).click();
		System.out.println("credit card option is selected");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Enter card details"))).click();
		System.out.println("Frame is opening");
		
		driver.switchTo().frame(0);
		System.out.println("Frame swtiched");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='addCreditCardNumber']"))).sendKeys("467318631489");
		System.out.println("card name entered");
		
		driver.findElement(By.xpath("(//span[contains(@class,'a-button-dropdown pmts-expiry')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'04')]")).click();
	 	
	 	driver.findElement(By.xpath("(//span[contains(@class,'a-button-dropdown pmts-expiry')])[2]")).click();
	 	driver.findElement(By.xpath("//a[contains(text(),'2025')]")).click();
	 	
	 	driver.findElement(By.xpath("//button[contains(@name,'CancelAddCreditCardEvent')]")).click();
	 	System.out.println("cancel button");
	 	
	 	driver.switchTo().defaultContent();
	 	
		
	}

}
