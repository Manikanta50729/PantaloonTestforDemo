package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.genericLib.Utility;
import com.booking.pagerepository.AnnabelleBrandPage;
import com.booking.pagerepository.BrandPage;
import com.booking.pagerepository.Homepage;

public class Test010 extends Base 
{
	@Test
	public void test10()
	{
		Homepage home= new Homepage(driver);
		BrandPage brand=new BrandPage(driver);
		AnnabelleBrandPage AnnabelleBrand = new AnnabelleBrandPage(driver);
		
		
		home.clickBrandMajortab();
		
		JSscrollAction(driver, 0, 1500);
		Utility.genericWait();
		JSscrollAction(driver, 0, 1500);
		
		Reporter.log("brand page is displayed  " + brand.checkPage());
		
		brand.clickAnnabelleBrand();
		Reporter.log("Product count displayed in annabelle Brand page are " + AnnabelleBrand.checkProductCount());
	}

}
