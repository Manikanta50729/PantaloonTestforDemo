package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Cartpage;
import com.booking.pagerepository.Homepage;

public class Test001 extends Base
{
//test1 clicking on cart button will take to cart and verifying its a cart page
	
	@Test
	public void test1()
	{
		
		Homepage home = new Homepage(driver);
		Cartpage cart = new Cartpage(driver);
		
		//home.promptingForSendingUpdates();
		home.clickCartButton();
	 
		Reporter.log("verify my bag page is displayed" + cart.verifymybag());	
		
	}
	
}
