package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;

public class Test002 extends Base
{
	
	//test 2 check for a banner click next 2 times click on kidsWearbanner 
	@Test()
	public void test2()
	{
		Homepage home = new Homepage(driver);
		home.checkabanner();
		genericWait();
		genericWait();
		home.clickNextArraowButton();
		genericWait();
		genericWait();
		home.clickNextArraowButton();
		genericWait();
		home.clickNextArraowButton();
		
		Reporter.log("KidsBanner is enabled and working fine ", home.clickKidsWearBanner());
		
	}
}
