package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.SearchPage;
import com.booking.pagerepository.genericProductPage;
import com.booking.pagerepository.redirectToLoginPage;

public class Test008 extends Base
{
	@Test
	public void test8()
	{
	
	Homepage home = new Homepage(driver);
	SearchPage searchResult= new SearchPage(driver);
	genericProductPage productview = new genericProductPage(driver);
	redirectToLoginPage loginrequest = new redirectToLoginPage(driver);
	
	home.SearchProduct("men sandals");
	searchResult.dropdownSelection("Best Selling");
	genericWait();
	searchResult.choose1stProduct();
	genericWait();
	productview.additemToWishList();
	genericWait();
	Reporter.log(" login required to add product to wishlist" + loginrequest);
	}
}
