package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;

public class Test004 extends Base
{
	
	//Checking Multicontainer root
	
@Test
public void test4()
{
	Homepage home = new Homepage(driver);
	JSscrollAction(driver,0,15000);
	
	Reporter.log("Multicontainer root icons are displayed", home.iconsVerification());
}
}
