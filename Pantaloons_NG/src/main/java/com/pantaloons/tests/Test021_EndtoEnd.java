package com.pantaloons.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.pagerepository.Cartpage;
import com.booking.pagerepository.Homepage;
import com.booking.pagerepository.KidsDressPage;
import com.booking.pagerepository.KidsSandalPage;
import com.booking.pagerepository.genericProductPage;

public class Test021_EndtoEnd extends Base
{
	//test 21 
	
	@Test
	public void test21()
	{
		Homepage home = new Homepage(driver);
		KidsSandalPage sandalPage= new KidsSandalPage(driver);
		genericProductPage product=new genericProductPage(driver);
		KidsDressPage dressPage= new KidsDressPage(driver);
		Cartpage cart= new Cartpage(driver);
		
		try {
			mouseAction(driver, home.accessoriesLink());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		home.clickSandalsLink();
		genericWait();
		JSscrollAction(driver, 0, 200);
		
		sandalPage.selectSandal();
		
		genericWait();
		product.select32Size();
		
		product.addQuanitiy(3);
		
		product.clickaddToBagButton();
		
		product.clickHome();
		
																			try {
		mouseAction(driver, home.getkidsmajorTab());
																			} catch (InterruptedException e) {
																			// TODO Auto-generated catch block
																				e.printStackTrace();}
		
																			
		home.dressInKids();
		dressPage.clickbrandButton();
		
		dressPage.clickStyleUp();
		
		dressPage.clickOnProduct();
		
		product.SelectASize();
		
		product.addQuanitiy(4);
		
		product.clickaddToBagButton();
		
		product.clickHome();
		
		home.clickCartButton();
		
		Reporter.log("Total cart amount is  "+
		cart.getCartAmount());
		
		
		
		
																				
																				
		}
	}	
																			
		
		
		


