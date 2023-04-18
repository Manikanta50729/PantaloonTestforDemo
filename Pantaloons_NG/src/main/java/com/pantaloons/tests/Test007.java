package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.SearchPage;

public class Test007 extends Base
{
 //test 7 search for mens jeans and sort it by Latest by using containing text in dropdown options
	
	@Test
	public void test7()
	{
			
			Homepage home = new Homepage(driver);
			SearchPage searchResult= new SearchPage(driver);
			home.SearchProduct("men jeans");
			String str = searchResult.dropdownSelection("Latest");
			//System.out.println(str);
			Reporter.log("Selected option in dropdown is :"+ str);		
	}
}
