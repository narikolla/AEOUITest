package com.aeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensPage {

 
	
	WebDriver driver;
	
	
 	
	@FindBy(xpath="//a[contains(@href,'1113_5071_095')]")
	WebElement selectItem;

	 
	public MensPage(WebDriver driver){
		super();
		this.driver = driver;
 		PageFactory.initElements(driver, this);
	}
	
  
	public void clickItem(){
  
		selectItem.click();
	}
		 
}
