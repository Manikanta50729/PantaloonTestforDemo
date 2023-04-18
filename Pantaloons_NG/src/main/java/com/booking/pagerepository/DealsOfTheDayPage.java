package com.booking.pagerepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsOfTheDayPage 
{
	@FindBy(xpath = "//a[contains(@class,'dealtextlink ')]")
	private List<WebElement> majorTabs;
	

	public DealsOfTheDayPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public int verifyAllTabs()
	{
		int a=0;
		for (WebElement webElement : majorTabs) 
		{
			webElement.isDisplayed();
			a++;
		}
		return a;
		
	}
}
