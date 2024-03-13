package com.Stepdef;

import com.pom.CartPage;

import io.cucumber.java.en.When;

public class CartStep {

	CartPage cp = new CartPage();
	
	@When("Click on TermsOfService")
	public void click_on_terms_of_service() {
	    cp.termsofservice();
	}

	@When("Click on CheckOut")
	public void click_on_check_out() {
	    cp.checkout();
	}
}
