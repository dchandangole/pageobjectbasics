package com.w2a.listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.aventstack.extentreports.Status;
import com.w2a.base.Page;

import com.w2a.utilities.Utilities;

public class CustomListeners extends Page implements ITestListener, ISuiteListener {

	public void onTestStart(ITestResult result) {
		
		test = rep.createTest(result.getName().toUpperCase());
		//runmodes - Y
		System.out.println(Utilities.isTestRunnable(result.getName(), excel));
		
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS,result.getName().toUpperCase()+ "PASS");
		rep.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(Status.FAIL, result.getName().toUpperCase()+ "Failed with exception : "+result.getThrowable());
	
		try {
			test.addScreenCaptureFromPath(Utilities.screenshotName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//test.log(Status.FAIL, test.addScreenCaptureFromPath(TestUtil.screenshotName));
	
		
		
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\""
				+ "_blank\" href="+Utilities.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\""
				+ "_blank\" href="+Utilities.screenshotName+"><img src="+Utilities.screenshotName+" height=200 width=200></a>");
		
		rep.flush();
	}

	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, result.getName().toUpperCase()+" Skipped the test as the Run mode is NO");
		rep.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
		
	}

}
