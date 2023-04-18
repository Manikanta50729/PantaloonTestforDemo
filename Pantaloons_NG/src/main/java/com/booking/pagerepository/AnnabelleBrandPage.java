package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnabelleBrandPage 
{
	//test10
	@FindBy(xpath = "//h1[text()='annabelle']")
	private WebElement annabelleName;
	
	@FindBy(xpath = "//*[@id='products-wrapper']/div[1]/div[1]/div/text()[1]")
	private String annabelleProductCount;
	
	
	public AnnabelleBrandPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	
	
	
	
	//test10 brand page verification
	public String checkProductCount()
	{
		annabelleName.isDisplayed();
		String b = annabelleProductCount;
		 return b;
	}
}
