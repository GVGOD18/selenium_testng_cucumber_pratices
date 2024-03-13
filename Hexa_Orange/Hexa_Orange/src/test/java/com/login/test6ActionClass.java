package com.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test6ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		driver.get("https://demowebshop.tricentis.com/");
//		wait.until(ExpectedConditions.titleContains("Demo Web Shop"));
//		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		Actions act=new Actions(driver);
		
//		act.moveToElement(element).build().perform();
//		act.doubleClick(element).build().perform();
		
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		wait.until(ExpectedConditions.titleContains("Simple Context Menu"));
		
//		WebElement element2 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		act.contextClick(element2).perform();
//		WebElement element3 = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
//		act.doubleClick(element3).build().perform();
		
		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		wait.until(ExpectedConditions.titleContains("Selenium Easy Demo - Drag and Drop Demo"));
		
		WebElement element4 = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
		WebElement element5 = driver.findElement(By.id("mydropzone"));
		act.dragAndDrop(element4, element5).perform();
		

	}

}
