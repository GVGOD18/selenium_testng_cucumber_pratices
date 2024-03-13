package com.Stepdef;

import com.pom.BookPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStep {
	
	BookPage bp = new BookPage();

	@When("Click on Book page")
	public void click_on_book_page() {
		bp.clickBook();
	}

	@When("Click on sort option")
	public void click_on_sort_option() {
		bp.clickSort();
	}

	@When("Click on Price low to high")
	public void click_on_price_low_to_high() {
		bp.selectSort();
	}

	@Then("Click on the item")
	public void click_on_the_item() {
		bp.clickItem();
	}
}
