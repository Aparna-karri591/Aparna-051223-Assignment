package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	WebDriver driver;

	// Objects

	@FindBy(xpath = "//*[contains(text(),'Tablets')]")
	private WebElement tablet;
	
	@FindBy(linkText = "Samsung Galaxy Tab 10.1")
	private WebElement tabletname;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement addcart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement assertsuccessaddcart;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement checkcart;

	public AddtoCartPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	// Actions
public void   selecttablet() {
		
		tablet.click();
		//return new AddtoCartPage(driver);
	}

//public String asserttabletName() {
//	
//	
//	String nameofTablet = tabletname.getText();
//	return nameofTablet;
//}

public void   addtoCart() {
	
	addcart.click();

}


public boolean assertSuccessfullyaddedtoCart() {
	boolean p1 = assertsuccessaddcart.isDisplayed();
	return p1;
}


public void   checkTheCart() {
	
	checkcart.click();

}


public String asserttabletName() {

	String nameofTablet = tabletname.getText();
	return nameofTablet;
}

}


