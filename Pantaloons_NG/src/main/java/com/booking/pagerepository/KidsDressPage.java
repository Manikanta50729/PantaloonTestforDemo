package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsDressPage
{
	//test21
		@FindBy(xpath = "//p[text()='Brand']")
		private WebElement brandButton;
		
		@FindBy(xpath = "//div[3]/div[contains(text(),'StyleUp')]")
		private WebElement StyleUP;
		
		@FindBy(xpath = "//div[3]/div[1]/div/div/a/div[2]/div/img")
		private WebElement SelectAProduct;
		
		
		public KidsDressPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		
		//test21
	public void clickbrandButton()
	{
		brandButton.click();
	}
	
	public void clickStyleUp()
	{
		StyleUP.click();
	}
	
	public void clickOnProduct()
	{
		SelectAProduct.click();
	}

}
