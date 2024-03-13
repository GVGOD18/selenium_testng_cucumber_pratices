package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Declaration
	@FindBy(name = "username")
	public WebElement textUsername;

	@FindBy(name = "password")
	public WebElement textPassword;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement buttonLogin;

	// Initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization

	public void enterUsername(String str) {
		textUsername.sendKeys(str);
	}

	public void enterPassword(String str) {
		textPassword.sendKeys(str);
	}

	public void clickLogin() {
		buttonLogin.click();
	}

}
