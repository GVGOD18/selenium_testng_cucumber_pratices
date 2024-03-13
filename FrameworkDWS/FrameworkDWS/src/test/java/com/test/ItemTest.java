package com.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.DriverUtils;
import com.pom.BookPage;
import com.pom.ItemPage;
import com.pom.LoginPage;

public class ItemTest {

	@Test
	@Parameters({"Username","Password"})
	public void verifyBook(String un, String pw) {
		LoginPage lp = new LoginPage();
		BookPage bp  = new BookPage();
		ItemPage ip = new ItemPage();
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/");

		WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(), 10);
		wait.until(ExpectedConditions.titleContains("Demo Web Shop"));
		System.out.println("Page Loaded");

		lp.clickLogin();
		lp.enterUsername(un);
		lp.enterPassword(pw);
		lp.login();
//		lp.books();
//		lp.addtocart1();
//		lp.shoppingcart();
		
		bp.clickBook();
		bp.clickSort();
		bp.selectSort();
		bp.clickItem();
		ip.EnterNumberOfQty("2");
		ip.ClickAddToCart();
		lp.logout();
	}
}
