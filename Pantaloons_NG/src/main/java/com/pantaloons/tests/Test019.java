package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.genericProductPage;

public class Test019 extends Base
{
	//test 19 choose 1st product in Must Have Styles of the Season Tab Check for available sizes
	
	@Test
	public void test19()
	{
		Homepage home = new Homepage(driver);
		genericProductPage productview= new genericProductPage(driver);
		JSscrollAction(driver, 0, 800);
		home.click_1st_ItemOn_MustHaveStylesoftheSeason();
		genericWait();
	  Reporter.log(productview.fetchSizes());
	}
}
