package com.aeo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {

 
	
	WebDriver driver;
	

	public ItemPage(WebDriver driver){
		super();
		this.driver = driver;
 		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//ul[@class='dropdown-menu']")
	WebElement selectSize;
	
	@FindBy(xpath="//button[@name='addToBag']")
	WebElement addToBag;
	 
	@FindBy(xpath="//button[@name='viewBag']")
	WebElement viewBag;
	
	
  
	public void selectSize(){
 		List<WebElement> sizes =  selectSize.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
 		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sizes.get(0));
	}
	
	public void addToBag(){
		addToBag.click();
	}
	
	public void viewBag(){
        WaitHelper.waitForPageLoad(driver);
		viewBag.click();
	}
		 
}
