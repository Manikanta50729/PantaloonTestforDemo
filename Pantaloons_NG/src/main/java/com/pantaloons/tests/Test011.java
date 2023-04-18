package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.genericLib.Utility;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.JeansPage;

public class Test011 extends Base
{
	
	//test 11
@Test
public void test11() throws InterruptedException
{
	 Homepage home = new Homepage(driver);
	 JeansPage jeansPage=new JeansPage(driver);
	 
	 Utility.mouseAction(driver, home.menMajortab());
	 genericWait();
	 home.menJeans();
	 genericWait();
	 //System.out.println(jeansPage.checkPage());
	 Reporter.log("Product page is displayed"+  jeansPage.checkPage());
}
}
