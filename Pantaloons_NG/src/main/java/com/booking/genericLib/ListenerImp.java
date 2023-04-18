package com.booking.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		Utility.takeScreenshot(Base.staticdriver, result);
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}
