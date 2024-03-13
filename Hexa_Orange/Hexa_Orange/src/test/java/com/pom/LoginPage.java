package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(partialLinkText="Log in")
	public WebElement buttonLogin;

	@FindBy(id="Email")
	public WebElement textUsername;

    @FindBy(name="Password")
	public WebElement textPassword;
    
    @FindBy(xpath = "//input[@class='button-1 login-button' and @type='submit']")
    public WebElement login;

//    @FindBy(linkText = "Books")
//    public WebElement books;
//    
//    @FindBy(className="button-2")
//    public WebElement addtocart1;
//    
//    @FindBy(linkText="Shopping cart")
//    public WebElement shoppingcart;
 

 
    //Utilization
    
    public void clickLogin(){
    	buttonLogin.click();
    	}
 
    public void enterUsername(String str){
    	textUsername.sendKeys(str);
    	}
 
    public void enterPassword(String str){
    	textPassword.sendKeys(str);
    	}
    
    public void login() {
    	login.click();
        }
    
//    public void books() {
//    	books.click();
//    }
//    
//    public void addtocart1(){
//    	addtocart1.click();
//    }
//    
//    public void shoppingcart() {
//    	shoppingcart.click();
//    }
// 


}