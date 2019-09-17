package com.aeo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aeo.pages.CheckoutPage;
import com.aeo.pages.HomePage;
import com.aeo.pages.ItemPage;
import com.aeo.pages.MensPage;
import com.aeo.pages.WaitHelper;

public class AEOUITests {

	WebDriver driver;

	/*
	 * Initilize whichever browser you would like
	 * 
	 */
	@BeforeSuite
	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "/Users/nkolla/Downloads/chromedriver");
//		driver = new ChromeDriver();

 	    System.setProperty("webdriver.gecko.driver", "/Users/nkolla/Downloads/geckodriver");
 	    driver = new FirefoxDriver();
 			  
		driver.manage().window().maximize();
	}

	/*
	 * Test to checkout only with DEBIT/CREDIT Card
	 */
	@Test
	public void checkoutWithCreditOrDebitCardOnly() throws InterruptedException {
		driver.get("https://www.ae.com/us/en");
		WaitHelper.waitForPageLoad(driver);
		Thread.sleep(2000);

		HomePage homePage = new HomePage(driver);
		homePage.clickMenShop();
		Thread.sleep(2000);
		driver.getCurrentUrl();
		WaitHelper.waitForPageLoad(driver);

		MensPage mensPage = new MensPage(driver);
		mensPage.clickItem();
		Thread.sleep(3000);

		driver.getCurrentUrl();
		WaitHelper.waitForPageLoad(driver);
		ItemPage itemPage = new ItemPage(driver);
		itemPage.selectSize();
		Thread.sleep(2000);
		itemPage.addToBag();
		Thread.sleep(3000);
		itemPage.viewBag();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-tl='proceed-to-checkout']")).click();
		;

		Thread.sleep(2000);
		driver.getCurrentUrl();
		WaitHelper.waitForPageLoad(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.setFirstName("JOHN");
		checkoutPage.setLastName("SMITH");
		checkoutPage.setStreetAddress("333 Market St");
		checkoutPage.setStreetAddress2("Unit 299");
		checkoutPage.setCity("San Francisco");
		checkoutPage.setZipCode("94105");
		Select select = new Select(driver.findElement(By.xpath("//select[@name='states']")));
		select.selectByVisibleText("California");
		checkoutPage.setEMailAdresss("abc@xyz.com");
		checkoutPage.setPhoneNumber("2345235435");
		checkoutPage.selectGiftCard();
		Thread.sleep(2000);

		checkoutPage.setCardNumber("411111111111111");
		checkoutPage.setExpirationDate("09/21");
		checkoutPage.setSecurityCode("111");

		checkoutPage.placeOrder();
		Thread.sleep(5000);
	}

	/*
	 * Test to checkout only with Gift Card
	 */
	@Test
	public void checkoutWithGiftCardOnly() throws InterruptedException {
		driver.get("https://www.ae.com/us/en");

		WaitHelper.waitForPageLoad(driver);

		HomePage homePage = new HomePage(driver);
		homePage.clickMenShop();
		Thread.sleep(2000);

		driver.getCurrentUrl();
		WaitHelper.waitForPageLoad(driver);

		MensPage mensPage = new MensPage(driver);
		mensPage.clickItem();
		Thread.sleep(2000);

		driver.getCurrentUrl();
		WaitHelper.waitForPageLoad(driver);

		ItemPage itemPage = new ItemPage(driver);
		itemPage.selectSize();
		Thread.sleep(2000);
		itemPage.addToBag();
		Thread.sleep(3000);
		itemPage.viewBag();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-tl='proceed-to-checkout']")).click();
		;
		Thread.sleep(2000);

		driver.getCurrentUrl();
		WaitHelper.waitForPageLoad(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.setFirstName("JOHN");
		checkoutPage.setLastName("SMITH");
		checkoutPage.setStreetAddress("333 Market St");
		checkoutPage.setStreetAddress2("Unit 299");
		checkoutPage.setCity("SanFrancisco");
		checkoutPage.setZipCode("94105");
		Select select = new Select(driver.findElement(By.xpath("//select[@name='states']")));
		select.selectByVisibleText("California");
		checkoutPage.setEMailAdresss("abc@xyz.com");
		checkoutPage.setPhoneNumber("2345235435");
		checkoutPage.selectGiftCard();
		Thread.sleep(2000);
		checkoutPage.setGiftCardNumber("1234123231233434345");
		checkoutPage.setGiftCardPin("213232");
		checkoutPage.applyGiftCard();
		Thread.sleep(2000);

		checkoutPage.placeOrder();
		Thread.sleep(5000);

	}

	/*
	 * Test to checkout with both Gift and Credit/Debit Card
	 */
	@Test
	public void checkoutWithGiftAndCreditCard() throws InterruptedException {
		driver.get("https://www.ae.com/us/en");

		WaitHelper.waitForPageLoad(driver);
		Thread.sleep(3000);

		HomePage homePage = new HomePage(driver);
		homePage.clickMenShop();
		Thread.sleep(2000);

		driver.getCurrentUrl();
		WaitHelper.waitForPageLoad(driver);

		MensPage mensPage = new MensPage(driver);
		mensPage.clickItem();
		Thread.sleep(2000);

		driver.getCurrentUrl();
		WaitHelper.waitForPageLoad(driver);
		ItemPage itemPage = new ItemPage(driver);
		itemPage.selectSize();
		Thread.sleep(2000);
		itemPage.addToBag();
		Thread.sleep(3000);
		itemPage.viewBag();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-tl='proceed-to-checkout']")).click();
		;

		driver.getCurrentUrl();
		Thread.sleep(2000);

		WaitHelper.waitForPageLoad(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.setFirstName("JOHN");
		checkoutPage.setLastName("SMITH");
		checkoutPage.setStreetAddress("333 Market St");
		checkoutPage.setStreetAddress2("Unit 299");
		checkoutPage.setCity("SanFrancisco");
		checkoutPage.setZipCode("94105");
		Select select = new Select(driver.findElement(By.xpath("//select[@name='states']")));
		select.selectByVisibleText("California");
		checkoutPage.setEMailAdresss("abc@xyz.com");
		checkoutPage.setPhoneNumber("2345235435");
		checkoutPage.selectGiftCard();
		Thread.sleep(2000);

		checkoutPage.setGiftCardNumber("12341232312334");
		checkoutPage.setGiftCardPin("213232");
		checkoutPage.applyGiftCard();
		Thread.sleep(2000);

		checkoutPage.setCardNumber("2020202020202020");
		checkoutPage.setExpirationDate("09/21");
		checkoutPage.setSecurityCode("111");

		checkoutPage.placeOrder();
		Thread.sleep(5000);

	}

	@AfterTest
	public void tearDown() throws InterruptedException {
			
		driver.quit();
	}

}
