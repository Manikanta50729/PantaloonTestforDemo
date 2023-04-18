package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class redirectToLoginPage 
{
	@FindBy(xpath = "//h1[text()='Login/Register']")
	private WebElement loginrequired;
	

	public redirectToLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifymybag()
	{
		boolean b = false;
		if(loginrequired.isDisplayed())
		{
			b=true;
		}
		return b;
	}
}
