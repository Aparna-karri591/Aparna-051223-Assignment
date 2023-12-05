package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
WebDriver driver;
	
	@FindBy(xpath="//strong[contains(text(),'Sub-Total')]")
	private WebElement assertSubTotal;
	
	@FindBy(xpath="//button[@title='Remove']/following::td[2]")
	private WebElement assertsubtotalValue;
	

	@FindBy(xpath="//button[@title='Remove']/following::td[3]")
	private WebElement assertEchotax;
	

	@FindBy(xpath="//button[@title='Remove']/following::td[4]")
	private WebElement assertEchotaxValue;
	
	@FindBy(xpath="//button[@title='Remove']/following::td[5]")
	private WebElement assertVat;
	
	@FindBy(xpath="//button[@title='Remove']/following::td[6]")
	private WebElement assertVatValue;
	
	@FindBy(xpath="//button[@title='Remove']/following::td[7]")
	private WebElement assertTotal;
	
	@FindBy(xpath="//button[@title='Remove']/following::td[8]")
	private WebElement assertTotalValue;
	
	@FindBy(xpath="//strong[contains(text(),'Checkout')]")
	private WebElement checkout;
	
	@FindBy(xpath="//strong[contains(text(),'Checkout')]")
	private WebElement remove;
	 
	@FindBy(xpath="//div[contains(text(),'Products marked with *** are not available in the desired quantity or not in stock!')]")
	private WebElement assertnotAvailabemsg;
	
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	


public boolean subTotal() {
	boolean subtotal = assertSubTotal.isDisplayed();
	return subtotal;
}

public boolean subTotalValue() {
	boolean subtotalvalue = assertsubtotalValue.isDisplayed();
	return subtotalvalue;
}
public boolean echoTax() {
	boolean et = assertEchotax.isDisplayed();
	return et;
}

public boolean echoTaxValue() {
	boolean etv = assertEchotaxValue.isDisplayed();
	return etv;
}

public boolean vat() {
	boolean vt = assertVat.isDisplayed();
	return vt;
}

public boolean vatValue() {
	boolean vtvalue = assertVatValue.isDisplayed();
	return vtvalue;
}

public boolean total() {
	boolean t = assertTotal.isDisplayed();
	return t;
}

public boolean totalValue() {
	boolean ttv = assertTotalValue.isDisplayed();
	return ttv;
}

public void   checkoutTheCart() {
	
	checkout.click();

}






public boolean notAvailable() {
	boolean notavail = assertnotAvailabemsg.isDisplayed();
	return notavail;
}


}
