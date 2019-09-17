package com.aeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	WebDriver driver;

	@FindBy(xpath="//a[text()[contains(.,'SHOP MEN')]]")
	WebElement clickMenShop;
 	 
	public HomePage(WebDriver driver){
		super();
		this.driver = driver;
 		PageFactory.initElements(driver, this);
	}
	 
	
	public void clickMenShop(){
       clickMenShop.click();
	}
		 
}
