package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage{

	@FindBy(name = "addtocart_13.EnteredQuantity")
	  public WebElement qty;
	
	@FindBy(id = "add-to-cart-button-13")
	  public WebElement addToCartButton;
	
	@FindBy(linkText="Shopping cart")
	  public WebElement shoppingcart;
	
	public void EnterNumberOfQty(String s)
	  {
		qty.clear();  
		qty.sendKeys(s);
	  }
	
	public void ClickAddToCart()
	{
		addToCartButton.click();
	}
	
	public void shoppingcart() {
	      shoppingcart.click();
	     }
}
