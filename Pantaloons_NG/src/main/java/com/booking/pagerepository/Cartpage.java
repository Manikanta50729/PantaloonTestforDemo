package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage 
{
	@FindBy(xpath = "//span[text()='My Bag']")
	private WebElement myBag;
	
	//test20
	@FindBy(xpath = "//div[2]/div/div[3]/div[1]/text()[2]/..")
	private WebElement price;
	

	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getCartAmount()
	{
		String ret = price.getText();
		return ret;
	}
	
	public boolean verifymybag()
	{
		boolean b =myBag.isDisplayed();
		return b;
	}
	
	
}
