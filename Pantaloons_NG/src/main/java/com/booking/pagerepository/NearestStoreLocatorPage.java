package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NearestStoreLocatorPage 
{
	//test17
	@FindBy(xpath = "//span[text()='USE CURRENT LOCATION']")
	private WebElement useCurrentLocationButton;
	
	@FindBy(xpath = "//div/div[2]/div[1]/div[1]/div/p")
	private WebElement nearbyStoreAdd;

	public NearestStoreLocatorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickUseCurrentLocationButton()
	{
		
		useCurrentLocationButton.click();
		
	}
	
	public String FetchnearestStore()
	{
		return nearbyStoreAdd.getText();
	}
}
