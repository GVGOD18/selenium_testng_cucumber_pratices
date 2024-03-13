package com.Stepdef;

import com.generic.DriverUtils;
import com.pom.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	LoginPage lp = new LoginPage();
	
	@Given("Enter a URL")
	public void enter_a_url() {
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		lp.clickLogin();
	}

	@When("Enter valid username and password <{string}> and <{string}>")
	public void enter_valid_username_and_password_and(String string, String string2) {
		lp.enterUsername(string);
		lp.enterPassword(string2);
	}

	@Then("Login Successful")
	public void login_successful() {
		lp.login();
	}

	@Then("logout the website")
	public void logout_the_website() {
		lp.logout();
	}
}
