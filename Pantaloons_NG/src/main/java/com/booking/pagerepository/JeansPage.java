package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeansPage
{
		//test11
		
		@FindBy(xpath = "//h1[text()='Mens Jeans & Denims']")
		private WebElement jeanspage;
		
		
		public JeansPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);	
		}
		
		//test11 page verification
		public String checkPage()
		{
			jeanspage.isDisplayed();
			String b = jeanspage.getText();
			 return b;
		}
}
