package com.booking.pagerepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage 
{
	@FindBy(xpath = "//select[1]")
	private WebElement sortDropdown;
	
	
	@FindBy(xpath = "//*[@id=\"products-wrapper\"]/div[3]/div[1]/div/div/a/div[4]/div[2]")
	private WebElement firstProductName;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//test 7
	public String dropdownSelection(String choose)
	{
		
		Select s =new Select(sortDropdown);
		List<WebElement> opts = s.getOptions();
		String str = null;
		for (WebElement opt : opts)
		{
			if(opt.getText().contains(choose))
			{
				opt.click();
				break;
			}
			str = opt.getText();
		}
		return str;
	}
	
	//test 8
	
	@FindBy(xpath = "//div[3]/div[1]/div/div/a/div[@class='PlpWeb_product-image__1VeLy ']/div")
	private WebElement firstProduct;
	
	public void choose1stProduct()
	{
		firstProduct.click();
	}
	
	//test 3
	public String fetch1stProductName()
	{
		return firstProductName.getText();
	}
}
