package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.NearestStoreLocatorPage;

public class Test017 extends Base
{
	//test 17 go to store locator page use current location and fetch nearest store address
	
	@Test
	public void test17()
	{
		Homepage home = new Homepage(driver);
		//Promptingbrowser pro=new Promptingbrowser();
		NearestStoreLocatorPage storeFinder=new NearestStoreLocatorPage(driver);
		
		home.clickStoreLocator();
		genericWait();
		genericWait();
		
		storeFinder.clickUseCurrentLocationButton();
		genericWait();
		
		//pro.accept();
		
		genericWait();
		
		String store = storeFinder.FetchnearestStore();
		Reporter.log("Nearest store to your location is "+store);	
	}
}
