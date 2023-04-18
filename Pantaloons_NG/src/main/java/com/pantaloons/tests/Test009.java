package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.genericLib.Utility;
import com.booking.pagerepository.Homepage;

public class Test009 extends Base
{
	//scroll in homepage till ios and android icon and check is it displayed
	
	@Test
	public void test9()
	{
		Homepage home= new Homepage(driver);
		JSscrollAction(driver, 0, 1500);
		Utility.genericWait();
		JSscrollAction(driver, 0, 2500);
		Utility.genericWait();
		JSscrollAction(driver, 0, 3500);
		Utility.genericWait();
		JSscrollAction(driver, 0, 1800);
		Reporter.log("ios icon is displayed " + home.checkIOSIcon());
		Reporter.log("Android icon is displayed " + home.checkAndroidicon());
	}
}
