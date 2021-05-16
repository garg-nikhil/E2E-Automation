package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.testBase.TestBase;


public class SuiteListener implements ITestListener
{
	
	public void onTestStart(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestFailure(ITestResult iTestResult) {
		String filename = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator + iTestResult.getMethod().getMethodName(); 
		File file = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File(filename + ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
