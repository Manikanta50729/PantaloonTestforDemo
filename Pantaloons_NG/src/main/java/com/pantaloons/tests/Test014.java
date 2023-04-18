package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.DealsOfTheDayPage;
import com.booking.pagerepository.Homepage;

public class Test014 extends Base
{
	//test 14 in deals of day page check 6 major tabs are present
	
	@Test
	public void test14()
	{
		Homepage home = new Homepage(driver);
		DealsOfTheDayPage dealsPage = new DealsOfTheDayPage(driver);
		
		home.clickViewAllButton();
		
		Reporter.log("total tabs present in dealPage  " + dealsPage.verifyAllTabs());
	}
}
