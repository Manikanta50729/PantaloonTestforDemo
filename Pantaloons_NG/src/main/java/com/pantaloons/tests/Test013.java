package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;

public class Test013 extends Base
{
	//test 13 says in women major tab in shop by brands vanhusen brand logo is displayed?
	
	@Test
	public void test13() throws InterruptedException
	{
		Homepage home = new Homepage(driver);
		
		
		mouseAction(driver, home.WomenSection());
		Reporter.log("vanhusen logo in women majorTab is displayed: "+ home.vanhusenlogo().isDisplayed());
		
	}
}
