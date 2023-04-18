package com.booking.pagerepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.booking.genericLib.Base;

public class Homepage extends Base
{
	@FindBy(xpath = "//button[@id='wzrk-cancel']")
	private WebElement doLater;
	
	@FindBy(xpath = "//a[@title='Cart']")
	private WebElement cartButton;
	
	@FindBy(xpath = "//img[@class='banner-img' and @title='Spring Collection']")
	private WebElement SpringCollectionBanner;
	
	@FindBy(xpath = "//div[@class='swiper-button-next']")
	private WebElement nextArrowBustton;
	
	@FindBy(xpath= "//img[@alt='Kidswear']")
	private WebElement kidswearBanner;
	
	@FindBy(xpath = "//span[text()='WOMEN']")
	private WebElement Womensection;
	
	@FindBy(xpath = "//a[text()='WESTERN WEAR']")
	private WebElement WesternWearLink;
	
	
	//Multicontainer elements
	//should contain Easy returns , call center , Free shipping , COD , Secure payment , Free alterations 
	
	@FindBy(xpath="//section[1]/div/div/div/div/div/span/img")
	private List<WebElement> icons;
	
	
	//Shop the look elements and click action on all belongs to test5
	
	@FindBy(xpath = "//span[@class='ShopTheLook_active-shop-tab__1ikFi' and text()='Women']")
	private List<WebElement> majorTabs;
	
	@FindBy(xpath = "//div[@class='MuiGrid-root ShopTheLook_app-shop-tab-item__2SO9X MuiGrid-item']/span[text()='Women']/../../../div[2]/div[3]/div")
	private List<WebElement> optionsInMajortab;
	
	
	//Test6 Accessories to sandals and fetch nor of product displayed
	
	@FindBy(xpath = "//span[text()='ACCESSORIES']")
	private WebElement accessoriesMajorTab;
	
	@FindBy(xpath = "//div/div[4]/div/a[text()='Sandals']")
	private WebElement sandalsLink;
	
	@FindBy(xpath = "//input[@placeholder='Search for products and more...']")
	private WebElement searchBox;
	
	@FindBy(xpath = "//div[@class='search-bar-content-textSearch-icon']")
	private WebElement searchButton;
	
	//test9 checking ios & android app icons visibility
	
	@FindBy(xpath = "//p[text()='EXPERIENCE PANTALOONS APP']/following-sibling::div/a[1]/a/span/img")
	private WebElement iosAppIcon;
	
	@FindBy(xpath = "//p[text()='EXPERIENCE PANTALOONS APP']/following-sibling::div/a[2]/a/span/img")
	private WebElement androidAppIcon;
	
	//test 10 
	
	@FindBy(xpath = "//span[text()='BRANDS']")
	private WebElement brandMajortab;
	
	
	//test11
	@FindBy(xpath = "//span[text()='MEN']")
	private WebElement menMajortab;
	
	@FindBy(xpath = "//a[text()='Jeans' and contains(@href,'/c/men/jeans')]")
	private WebElement jeansLink;
	
	
	//test12
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccountButton;
	
	@FindBy(xpath = "//a[@title='Wishlist']")
	private WebElement wishlistButton;
	
	
	//test14
	@FindBy(xpath = "//h3[text()='Deals of the Day']/../a")
	private WebElement viewAllButton;
	
	//test 13 womenTab is already available
	@FindBy(xpath = "//div[15]/a/div/div/img[@title='Van Heusen']")
	private WebElement vanhusen;
	
	//test15
	@FindBy(xpath = "//h4[text()='Pantaloons Gift Card']/../a")
	private WebElement ExploreNOWinpantaloongiftcardframe;
	
	
	//test16
	@FindBy(xpath = "//a[text()='TRACK ORDER']")
	private WebElement trackOrderButton;
	
	//test 17
	@FindBy(xpath = "//a[text()='STORE LOCATOR']")
	private WebElement storeLocator;
	
	//test19
	@FindBy(xpath = "//h3[text()='Must Have Styles of the Season']/../../div[2]/div/div[3]/div[1]/div/a/div/div/div/img")
	private WebElement FirstProductInMustHaveStylesoftheSeason;
	
	
	//test 20
	@FindBy(xpath = "//div/div/a[text()='Sweaters & Sweatshirts' and contains(@as,'/c/men/sweaters-sweatshirts')]")
	private WebElement sweatersandSweatShirts;
	
	//test21
	@FindBy(xpath = "//span[text()='KIDS']")
	private WebElement kidsMajorTab;
	
	@FindBy(xpath = "//a[text()='Dresses' and contains(@as,'/c/kids/dresses')]")
	private WebElement dressinKids;
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	//test21
	public WebElement getkidsmajorTab()
	{
		return kidsMajorTab;
	}
	
	public void dressInKids()
	{
		dressinKids.click();
	}
	
	
	
	
	
	//test20
	public void clicksweatersandSweatShirts()
	{
		sweatersandSweatShirts.click();
	}
	
	
	
	//test19
	public void click_1st_ItemOn_MustHaveStylesoftheSeason()
	{
		FirstProductInMustHaveStylesoftheSeason.click();
	}
	
	
	
	//test17
	public void clickStoreLocator()
	{
		storeLocator.click();
	}
	
	
	//test16
	public void clickTrackOrder()
	{
		trackOrderButton.click();
	}
	
	//test15
	public void clickExploreinPLGiftcard()
	{
	ExploreNOWinpantaloongiftcardframe.click();
	}
	
	//test13
	public WebElement WomenSection()
	{
		return Womensection;
	}
	
	
	public WebElement vanhusenlogo()
	{
		return vanhusen;
	}
	
	
	//test14
	public void clickViewAllButton()
	{
		viewAllButton.click();
	}
	
	//test12
	public void clickMyAccount()
	{
		myAccountButton.click();
	}
	
	public void clickWsishlist()
	{
		wishlistButton.click();
	}
	
	
	
	//test11
	
	public WebElement menMajortab()
	{
		return menMajortab;
	}
	
	public void menJeans()
	{
		
		jeansLink.click();
		
		
	}
	
	//test10
	
	public void clickBrandMajortab()
	{
		brandMajortab.click();
	}
	
	//test 9
	
	public boolean checkIOSIcon()
	{
		return iosAppIcon.isDisplayed();
		
	}
	public boolean checkAndroidicon()
	{
		
		return androidAppIcon.isDisplayed();
	}
	
	public void SearchProduct(String product)
	{
		searchBox.sendKeys(product);
		searchButton.click();
	}
	
	public void clickSandalsLink()
	{
		sandalsLink.click();
	}
	
	public WebElement accessoriesLink() 
	{
		return accessoriesMajorTab;
	}

	public void clickCartButton() 
	{
		cartButton.click();
	}
		
	public void promptingForSendingUpdates() 
	{
		doLater.click();		
	}
	
	
	//test2
	public void checkabanner()
	{
		boolean b = SpringCollectionBanner.isDisplayed();
		Reporter.log("Spring Collection banner is visible" + b);
		
	}
	
	public void clickNextArraowButton()
	{
		nextArrowBustton.click();
		
	}
	
	public boolean clickKidsWearBanner()
	{
		boolean b = kidswearBanner.isEnabled();
		kidswearBanner.click();
		return b; 
		
	}
	
	public boolean iconsVerification()
	{
		boolean b=false;
		for (WebElement icon : icons) 
		{
			if(icon.isDisplayed())
			{
				
			}
			else
			{
				b=false;
			}
			
		}
		return b;
	}
	
	public void majorTabTextvalues()
	{
		for (WebElement majortab : majorTabs) 
		{
			majortab.isDisplayed();
			Reporter.log("majortab "+ majortab.getText() + "is visible");
			majortab.click();
		}
	}
	
	public List<WebElement> optionsInWomenMajorTabs()
	{
		Reporter.log("Women major tab options count is  "+ optionsInMajortab.size());
		for (WebElement options : optionsInMajortab)
		{
			options.isEnabled();
		}
		return optionsInMajortab;
	}
	
}