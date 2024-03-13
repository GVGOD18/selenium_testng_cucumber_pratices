package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookPage extends BasePage {

  @FindBy(linkText = "Books")
  public WebElement books;
  
  @FindBy(name = "products-orderby")
  public WebElement sort;
  
  @FindBy(linkText = "Computing and Internet")
  public WebElement item;
  
  public void clickBook()
  {
	  books.click();
  }
  
  public void clickSort() 
  {
	  sort.click();
  }
  
  public void selectSort()
  {
	  Select sc = new Select(sort);
	  sc.selectByVisibleText("Price: Low to High");
  }
 
  public void clickItem()
  {
	  item.click();
  }
  
}
