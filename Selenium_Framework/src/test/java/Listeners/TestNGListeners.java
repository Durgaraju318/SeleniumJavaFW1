package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener

{

	public void onTestStart(ITestResult result)
	{
		System.out.println("*****Test Started******"+result.getName());


	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("*****Test Successed******"+result.getName());


	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("*****Test Skipped******"+result.getName());


	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{


	}
	public void onStart(ITestResult context)
	{


	}
	public void onFinish(ITestResult context)
	{
		System.out.println("*****Test Completed******"+context.getName());


	}



}
