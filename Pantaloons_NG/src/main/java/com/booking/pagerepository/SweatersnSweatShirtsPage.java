package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SweatersnSweatShirtsPage 
{
	
	//test20
	@FindBy(xpath = "//div/p[text()='Sizes']")
	private WebElement sizeButton;
	
	@FindBy(xpath = "//span/div[text()='S']/../..")
	private WebElement sSizeButton;
	
	@FindBy(xpath = "//div[10]/div/div/a/div[2]/div/img")
	private WebElement choosesweater;
	

	public SweatersnSweatShirtsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//test 20
	public void clickSize()
	{
		sizeButton.click();
	}
	
	public void clickSmallSize()
	{
		sSizeButton.click();
	}
	
	public void selectSweater()
	{
		choosesweater.click();
	}
}
