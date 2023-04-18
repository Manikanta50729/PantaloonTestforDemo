package com.booking.pagerepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class genericProductPage 
{	
	@FindBy(xpath = "//span[text()='ADD TO WISHLIST']")
	private WebElement addToWishListButton;
	
	
	//test19
	@FindBy(xpath = "//div/div/div[contains(@id,'size')]/span")
	private List<WebElement> sizes;
	
	//test20
	@FindBy(xpath = "//span[text()='ADD TO BAG']")
	private WebElement addToBagButton;
	
	@FindBy(xpath = "//span[text()='Please select size']")
	private WebElement sizenotSelected;
	
	@FindBy(xpath = "//span[text()='S']")
	private WebElement sSizeButton;
	
	//test 21
	@FindBy(xpath = "//div[text()='SELECT SIZE']/../../div[2]/div[3]")
	private WebElement selectSize;
	
	@FindBy(xpath = "//span[text()='+']")
	private WebElement addquantity;
	
	@FindBy(xpath = "//a[@title='Pantaloons']")
	private WebElement pantaloonLogo;
	
	@FindBy(xpath = "//div/div[3]/div/span")
	private WebElement selectaSize;
	
	public genericProductPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//test 21
	public void select32Size()
	{
		selectSize.click();
	}
	
	public void addQuanitiy(int s)
	{
		for (int i = 0; i < s-1; i++) 
		{
			addquantity.click();
		}
	}
		public void clickHome()
		{
			pantaloonLogo.click();
		}
		
		public void SelectASize()
		{
			selectaSize.click();
		}
	
	//test20 and 21
	public void clickaddToBagButton()
	{
		addToBagButton.click();
	}
	
	
	
	
	//
	public boolean SizeNotSelectederror()
	{
		boolean b = sizenotSelected.isDisplayed();
		return b;
	}
	
	public void chooseSmallSize()
	{
		sSizeButton.click();
	}
	
	
	
	
	
	//test19
	public String fetchSizes() 
	{
		StringBuffer sb = new StringBuffer();
		
		for (WebElement size : sizes) 
		{
			String s = size.getText();
			sb.append(s+" ");
			
		}
		String ret = sb.toString();
		return ret;
	}
	
	
	public void additemToWishList()
	{
		addToWishListButton.click();
	}
	
}
