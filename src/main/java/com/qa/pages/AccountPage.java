package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;

	// Objects
	@FindBy(linkText = "Edit your account information")
	private WebElement editYourAccountInformation;
	
	@FindBy(linkText = "Samsung Galaxy Tab 10.1")
	private WebElement tabName;
	
	public AccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Actions

	public boolean getDisplayStatusOfEditYourAccountInformation() {

		boolean displayStatus = editYourAccountInformation.isDisplayed();
		return displayStatus;

	}

	public boolean getTabletInformation() {

		boolean tname = tabName.isDisplayed();
		return tname;

	}

}
