package com.booking.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsSandalPage 
{
//belongs to test6 in size in sandals page
	
	@FindBy(xpath = "//p[text()='Sizes']/../following-sibling::div/span[2]")
	private WebElement sizeDropdown;
	
	


	@FindBy(xpath = "//div[text()='EU-35']")
	private WebElement sizeEU26;
	
	
	@FindBy(xpath = "//div[contains(@class,'PlpWeb_products-count')]/text()[1]")
	private String productCount;
	
	
	//test21
	@FindBy(xpath = "//div[4]/div/div/a/div[2]/div/img")
	private WebElement selectsandal;
	
	
	public KidsSandalPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//test21
public void selectSandal()
{
	selectsandal.click();
}


//
public void clickSizeDd() {
	 sizeDropdown.click();
}


public void selectSize() {
	 sizeEU26.click();
}


public String getProductCount() 
{
		 
		 return productCount;
		 
	 
}

}