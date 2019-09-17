package com.aeo.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

	/**
	 * All WebElements are identified by @FindBy annotation
	 */

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='streetAddress']")
	WebElement streetAddress;

	@FindBy(xpath = "//input[@name='streetAddress2']")
	WebElement apt;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement zipCode;

	@FindBy(xpath = "//input[@name='cardNumber']")
	WebElement cardNumber;

	@FindBy(xpath = "//input[@name='expirationDate']")
	WebElement expirationDate;

	@FindBy(xpath = "//input[@name='securityCode']")
	WebElement securityCode;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	WebElement phoneNumber;

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAddress;

	@FindBy(xpath = "//button[@data-tl='btn-gift-card-show-form']")
	WebElement selectGiftCard;

	@FindBy(xpath = "//input[@name='giftCardNumber']")
	WebElement giftCardNumber;

	@FindBy(xpath = "//input[@name='giftCardPin']")
	WebElement giftCardPin;

	@FindBy(xpath = "//button[@data-tl='gift-card-apply']")
	WebElement giftCardApply;

	@FindBy(xpath = "//button[@name='place-order']")
	WebElement placeOrder;

	public void setFirstName(String first) {
		firstName.sendKeys(first);
	}

	public void setLastName(String last) {
		lastName.sendKeys(last);
	}

	public void setStreetAddress(String address1) {
		streetAddress.sendKeys(address1);
	}

	public void setStreetAddress2(String address2) {
		apt.sendKeys(address2);
	}

	public void setCity(String ct) {
		city.sendKeys(ct);
	}
 	
	public void setZipCode(String zip){
		zipCode.sendKeys(zip);
	}
	
	
	public void setGiftCardNumber(String gift) {
		giftCardNumber.sendKeys(gift);
		
	}
	public void setGiftCardPin(String giftPin) {
		giftCardPin.sendKeys(giftPin);
		
	}
	public void setCardNumber(String card){
 		cardNumber.sendKeys(card);
	}
 	
 	public void setExpirationDate(String exp){
 		expirationDate.sendKeys(exp);
	}
 	
  	public void setSecurityCode(String cvv){
 		securityCode.sendKeys(cvv);
	}
 	
	public void setPhoneNumber(String ph){
		phoneNumber.sendKeys(ph);
	}
	

	public void setEMailAdresss(String email){
		emailAddress.sendKeys(email);
	}
	
	
	public void selectGiftCard() {
  		selectGiftCard.click();
 	}
	
	public void applyGiftCard() {
		giftCardApply.click();
		
	}
	
	public void placeOrder(){
		placeOrder.click();
 	}
	
}
