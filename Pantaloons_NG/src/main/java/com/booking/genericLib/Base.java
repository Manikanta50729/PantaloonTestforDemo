package com.booking.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Parameters;




@Listeners(com.booking.genericLib.ListenerImp.class)

public class Base extends Utility
{
	public WebDriver driver;
	public static WebDriver staticdriver;
	
	public BrowserActions browseraction;
	
	
	

	@BeforeClass()
	public void configBC()
	{
		System.setProperty("webdriver.chrome.driver",".\\Softwares\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
			System.out.println("Browser Started for execution");
			staticdriver = driver;
			browseraction=new BrowserActions();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Framework_Constants.url);
		genericWait();
		
		
		}

	
	@AfterClass
	public void cnfigAC()
	{
		
//		if(ITestResult.FAILURE==res.getStatus())     //if failure take screenshot
//		{
//			Utility.takeScreenshot(driver, res);
//		}
//		driver.quit();
//			Reporter.log("Browser closed" , true);

		driver.quit();
		Reporter.log("Browser closed", true);
	}
}
