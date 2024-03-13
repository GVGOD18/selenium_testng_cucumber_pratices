package com.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generic.DriverUtils;
import com.pom.LoginPage;

public class LoginTest{
	
	@Test
	public void verifyLogin() { 
		
		LoginPage lp = new LoginPage();
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/");
		
		  WebDriverWait wait=new WebDriverWait(DriverUtils.getDriver(),10);
	      wait.until(ExpectedConditions.titleContains("Demo Web Shop"));
	      System.out.println("Page Loaded");
	      
			lp.clickLogin();
			lp.enterUsername("gnnanavel@gmail.com");
			lp.enterPassword("26Nov@2001");
			lp.login();
//			lp.books();
//			lp.addtocart1();
//			lp.shoppingcart();

		
	}
	
	

}
