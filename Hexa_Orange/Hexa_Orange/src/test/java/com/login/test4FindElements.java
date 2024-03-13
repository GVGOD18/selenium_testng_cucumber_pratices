package com.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("QSpiders ");
		Thread.sleep(3000);
		
		List<WebElement> suggestion =   driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		Thread.sleep(3000);
		int count = suggestion.size();
		System.out.println(count);
		
		for (WebElement webElement : suggestion) {
			Thread.sleep(2000);
			System.out.println(webElement.getText());
			Thread.sleep(2000);
			if(webElement.getText().contains("QSpiders Velachery")) {
				webElement.click();
				break;
			}
		}
//		for(int i=0; i<count; i++) {
//			Thread.sleep(2000);
//			WebElement element1 = suggestion.get(i);
//			Thread.sleep(2000);
//			System.out.println(element1.getText());
//			Thread.sleep(2000);
//			if(element1.getText().contains("QSpiders Velachery")) {
//				element1.click();
//				break;
//			}
//			
//		}
	}

}
