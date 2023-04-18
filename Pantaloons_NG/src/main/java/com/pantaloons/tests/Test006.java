package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.KidsSandalPage;

public class Test006 extends Base
{
	
	//test 6 in home go to kids major tab and select sandals and fetch product count
@Test
public void test6() throws InterruptedException
{
	Homepage homePage = new Homepage(driver);
	KidsSandalPage sandalpage=new KidsSandalPage(driver);
	
	mouseAction(driver, homePage.accessoriesLink());
	homePage.clickSandalsLink();
	Reporter.log("Product count is " + sandalpage.getProductCount());
	
}
}
