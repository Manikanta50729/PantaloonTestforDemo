package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class WesternWearPage 
{
	
	@FindBy(xpath = "//div[text()='Multicoloured Shorts Set']")
	private WebElement product;

	
	
	
	public WesternWearPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnProduct() 
	{
		product.click();
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(product.getText(), "");
		
	}
}
