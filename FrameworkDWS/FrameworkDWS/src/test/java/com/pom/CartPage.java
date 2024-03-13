package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	@FindBy(xpath = "//input[@id='termsofservice']")
	public WebElement termsofservice;

	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement checkout;

	public void termsofservice() {
		termsofservice.click();
	}

	public void checkout() {
		checkout.click();
	}
}
