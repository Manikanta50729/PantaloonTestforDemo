package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pantaloons_TrackOrderPage 
{
	//test16
	@FindBy(xpath = "//label[@for='order_id']")
	private WebElement orderIDButton;
	
	@FindBy(xpath = "//label[@for='waybill']")
	private WebElement trackingIDButton;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement SearchBox;
	
	@FindBy(xpath = "//div/p/span")
	private WebElement searchButton;
	
	
	@FindBy(xpath = "//div[@class='invalid-search']")
	private WebElement errorMessage;
	
	public Pantaloons_TrackOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//test16
	public void clickOrderIDButton() 
	{
		orderIDButton.click();
	}
	
	public void clickTrackingIDButton() 
	{
		trackingIDButton.click();
	}
	
	public void passvalueTOSearchBox(String id) 
	{
		SearchBox.sendKeys(id);
	}
	
	public void clickSearch()
	{
		searchButton.click();
	}
	
	public boolean validerrorMessage()
	{
		 boolean b = errorMessage.isDisplayed();
		return b;
	}
	
}
