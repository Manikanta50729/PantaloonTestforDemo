package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.genericLib.Utility;
import com.booking.pagerepository.Cartpage;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.SweatersnSweatShirtsPage;
import com.booking.pagerepository.genericProductPage;

public class Test020_EndtoEnd extends Base
{
	//test 20 go to men major tab select Swaeters & SweatShirts filter by small size 
	//Select 10th product add item to cart check for error message
	//select size and go to cart and fetch total cart amount
	
	@Test
	public void test20()
	{
		Homepage home = new Homepage(driver);
		SweatersnSweatShirtsPage sweaterPage = new SweatersnSweatShirtsPage(driver);
		genericProductPage product = new genericProductPage(driver);
		Cartpage cart = new Cartpage(driver);
		
		try {
			Utility.mouseAction(driver, home.menMajortab());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.clicksweatersandSweatShirts();
		genericWait();
		
		sweaterPage.clickSize();
		
		genericWait();
		
		sweaterPage.clickSmallSize();
		
		genericWait();
		
		sweaterPage.selectSweater();
		
		JSscrollAction(driver, 0, 500);
		
		genericWait();
		
		product.clickaddToBagButton();
		
		genericWait();
		
		if(product.SizeNotSelectederror()==true)
		{
			Reporter.log("Proper error message displayed for not slecting size");
			product.chooseSmallSize();
			product.clickaddToBagButton();	
		}
		
		home.clickCartButton();
		genericWait();
		
		 Reporter.log("Total Cart amount is "+cart.getCartAmount());	
		
	}
}
