package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.SearchPage;

public class Test003 extends Base
{
	//test3 General 1st product name fetching by searching any product

	@Test
	public void test3()
	{
		Homepage home = new Homepage(driver);
		SearchPage searchResults=new SearchPage(driver);
		home.SearchProduct("men Jeans");
		genericWait();
		genericWait();
		
		Reporter.log("first product Name is "+searchResults.fetch1stProductName());
		
		
	}
}
