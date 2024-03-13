package com.Stepdef;

import com.pom.ItemPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ItemStep {

	ItemPage ip = new ItemPage();
	
	@When("Enter Quantity number <{string}>")
	public void enter_quantity_number(String string) {
	    ip.EnterNumberOfQty(string);
	}

	@Then("Click on add to cart")
	public void click_on_add_to_cart() {
	    ip.ClickAddToCart();
	}
	
	@Then("Click on Shopping Cart")
	public void click_on_shopping_cart() {
	   ip.shoppingcart();
	}
}
