package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.PantaloonGiftCardPage;

public class Test015 extends Base
{
	//test 15 open pantaloons click on explore now in pantaloons e gift card panel
	// it will open in new tab switch to that tab
	// check whether paynow button is enabled
	
	@Test
	public void test15()
	{
		Homepage home = new Homepage(driver);
		PantaloonGiftCardPage plgcpage = new PantaloonGiftCardPage(driver);
		
		JSscrollAction(driver, 0, 1500);
		genericWait();
		JSscrollAction(driver, 0, 1500);
		genericWait();
		
		home.clickExploreinPLGiftcard();
		browseraction.switchToWindowByTitlewithContains("gift");
		
		
		JSscrollAction(driver, 0, 1500);
		genericWait();
		JSscrollAction(driver, 0, 1500);
		genericWait();
		
		
		Reporter.log("paynow button is working fine" + plgcpage.verifyButtonisEnable());
		
	}
}
