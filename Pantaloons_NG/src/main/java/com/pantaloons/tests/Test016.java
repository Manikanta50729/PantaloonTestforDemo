package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.Pantaloons_TrackOrderPage;

public class Test016 extends Base
{
	//test 16 go to track-order 
	//it will open to new tab
	//switch to new tab
	//click on dummy tracking id and  search check for proper message
	
	
	@Test
	public void test16()
	{
		Homepage home = new Homepage(driver);
		Pantaloons_TrackOrderPage trackpage=new Pantaloons_TrackOrderPage(driver);
		
		home.clickTrackOrder();
		
		browseraction.switchToWindowByTitlewithEquals("Pantaloons");
		
		trackpage.clickTrackingIDButton();
		genericWait();
		trackpage.passvalueTOSearchBox("65206520367206");
		genericWait();
		trackpage.clickSearch();
		
		genericWait();
		
		Reporter.log("Proper error message is diplayed "+ trackpage.validerrorMessage());
		
		
		
	}
}
