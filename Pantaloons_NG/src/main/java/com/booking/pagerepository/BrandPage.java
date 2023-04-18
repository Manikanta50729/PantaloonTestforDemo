package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandPage 
{
	//test10 
	@FindBy(xpath = "//h3[text()='Brands in Focus']")
	private WebElement brandInFocustext;
	
	@FindBy(xpath = "//span[text()='Annabelle']")
	private WebElement annabelleBrand;
	
	public BrandPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	
	//brand page verification
	public boolean checkPage()
	{
		return brandInFocustext.isDisplayed();
	}
	
	public void clickAnnabelleBrand()
	{
		annabelleBrand.isEnabled();
		annabelleBrand.click();
	}
	
	
}
