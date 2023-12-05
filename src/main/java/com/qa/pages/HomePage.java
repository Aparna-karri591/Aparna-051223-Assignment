package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;	
	
	
	//Objects
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
		
	//Actions
	
	public void clickOnMyAccount() {
		
		myAccountDropMenu.click();
	}
	
	//New Change
	
	public LoginPage selectLoginOption() {
		
		loginOption.click();
		return new LoginPage(driver);
		
	}
	
	


}
