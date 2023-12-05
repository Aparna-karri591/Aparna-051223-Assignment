package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// Objects
	@FindBy(id = "input-email")
	private WebElement enterEmail;

	@FindBy(id = "input-password")
	private WebElement enterPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	private WebElement emailPasswordNotMatchingWarning;
	
	
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Actions

	public void enterEmailAddress(String emailText) {

		enterEmail.sendKeys(emailText);

	}

	public void enterPassword(String passwordText) {

		enterPassword.sendKeys(passwordText);

	}

	public AccountPage clickOnLoginButton() {

		loginButton.click();
		return new AccountPage(driver);

	}
	
	public String retriveEmailPasswordNotMatchingWarningMessage() {
		
		
		String warningText = emailPasswordNotMatchingWarning.getText();
		return warningText;
	}

}