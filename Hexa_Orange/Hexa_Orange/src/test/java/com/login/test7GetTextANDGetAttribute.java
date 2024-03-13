package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7GetTextANDGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\Hexa_Orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.example.com/");
		
		WebElement headingElement = driver.findElement(By.cssSelector("h1"));
		
		String headingText = headingElement.getText();
		System.out.println("Text using getText(): " + headingText);
		
		String classAttributeValues = headingElement.getAttribute("class");
		System.out.println("Value of 'class' attribute using getAttribute(): " + classAttributeValues);
		
		//driver.quit();

	}

}
