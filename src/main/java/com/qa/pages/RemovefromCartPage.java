package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemovefromCartPage {
	WebDriver driver;

	// Objects
	@FindBy(xpath="//button[@data-original-title='Remove']")
	private WebElement removefromCart;

	@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]/following::p[1]")
	private WebElement assertcartEmpty;
	

	// Actions

	public RemovefromCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void removeItemfromCart() {

		removefromCart.click();;

	}
	
	public boolean cartEmpty() {
		boolean cartempty = assertcartEmpty.isDisplayed();
		return cartempty;
	}

	
}
