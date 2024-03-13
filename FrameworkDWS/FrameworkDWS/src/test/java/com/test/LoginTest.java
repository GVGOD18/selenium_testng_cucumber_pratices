package com.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic.DriverUtils;
import com.pom.LoginPage;

public class LoginTest {

	@DataProvider
	public Object[][] getData()
	{
			Object[][] Data=new Object[1][2];
			Data[0][0]="gnnanavel@gmail.com";
			Data[0][1]="26Nov@2001";
 
		return Data;
	}
	
	@Test(dataProvider="getData")
	public void verifyLogin(String un, String pd) { 
		
		LoginPage lp = new LoginPage();
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/");
		
		  WebDriverWait wait=new WebDriverWait(DriverUtils.getDriver(),10);
	      wait.until(ExpectedConditions.titleContains("Demo Web Shop"));
	      System.out.println("Page Loaded");
	      
			lp.clickLogin();
			lp.enterUsername(un);
			lp.enterPassword(pd);
			lp.login();
			lp.logout();
//			lp.books();
//			lp.addtocart1();
//			lp.shoppingcart();

		
	}
}
