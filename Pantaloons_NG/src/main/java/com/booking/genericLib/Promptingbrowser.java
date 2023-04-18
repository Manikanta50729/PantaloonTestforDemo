package com.booking.genericLib;

import org.openqa.selenium.Alert;

public class Promptingbrowser extends Base
{
  
	  public Alert a;
			   
		
		public void sendKeys(String keysToSend) 
		{
			a=staticdriver.switchTo().alert();
			a.sendKeys(keysToSend);
		}
		
		
		public String getText() {
			// TODO Auto-generated method stub
			a=staticdriver.switchTo().alert();
			return a.getText();
		}
		
		
		public void dismiss() {
			// TODO Auto-generated method stub
			a=staticdriver.switchTo().alert();
			a.dismiss();
		}
		
		
		public void accept() {
			// TODO Auto-generated method stub
			a=staticdriver.switchTo().alert();
			a.accept();
		}
	}
   
	   
   

