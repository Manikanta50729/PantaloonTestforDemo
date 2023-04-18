package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;

public class Test005 extends Base
{
	
	//test 5  in home page scroll till women major tab check all tabs enabled and fetch the count
@Test	
public void test5()
{
	Homepage home = new Homepage(driver);
	JSscrollAction(driver, 0, 5000);
	JSscrollAction(driver, 0, 5000);
	home.majorTabTextvalues();
	home.optionsInWomenMajorTabs();
	
	Reporter.log("all options are enabled and count is " + home.optionsInWomenMajorTabs().size());
	
}
}
