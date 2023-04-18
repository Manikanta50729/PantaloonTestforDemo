package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantaloonGiftCardPage 
{
	//test15
		@FindBy(xpath = "//div/input[@type='submit' and @value='PAY NOW']")
		private WebElement payNowButton;
		
		
		public PantaloonGiftCardPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
			
		}
		
		public boolean verifyButtonisEnable() 
		{
			payNowButton.isDisplayed();
			return payNowButton.isEnabled();
		}
}
