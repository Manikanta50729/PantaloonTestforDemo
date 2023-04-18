package com.booking.genericLib;

import java.util.Set;

public class BrowserActions extends Base
{
	public void back()
	{


		staticdriver.navigate().back();
	}

	public void forward()
	{
		staticdriver.navigate().forward();
	}

	public void refresh()
	{
		staticdriver.navigate().refresh();
	} 


	public void switchToWindowByTitlewithContains(String WindowTitle)
	{
		Set<String> windowHandles = staticdriver.getWindowHandles();

		for (String handle : windowHandles) 
		{
			staticdriver.switchTo().window(handle);
			String title = staticdriver.getTitle();
			if (title.contains(WindowTitle))
			{
				break;
			}
		}
	}
	
	public void switchToWindowByTitlewithEquals(String WindowTitle)
	{
		Set<String> windowHandles = staticdriver.getWindowHandles();

		for (String handle : windowHandles) 
		{
			staticdriver.switchTo().window(handle);
			String title = staticdriver.getTitle();
			if (title.equals(WindowTitle))
			{
				break;
			}
		}
	}
	
}



