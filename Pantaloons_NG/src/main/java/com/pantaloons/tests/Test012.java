package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.redirectToLoginPage;

public class Test012 extends Base
{
	// verify both my account and wishlist buttons will redirect to login page
	
	@Test
	public void test12()
	{
		Homepage home = new Homepage(driver);
		redirectToLoginPage login = new redirectToLoginPage(driver);
		
		
		home.clickMyAccount();
		Reporter.log("login required " + login.verifymybag());
		
		browseraction.back();
		genericWait();
		
		home.clickWsishlist();
		Reporter.log("login required " + login.verifymybag());
		
	}

}
