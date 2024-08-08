package Com_framework;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public  class extent_listerners extends ExtentReport_setup implements ITestListener
{
// ************************listeners dint work. also testng2 nt working******************************
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	


	@Override
	//@AfterMethod
	public void onTestFailure(ITestResult result) {
		String  failmethod=result.getMethod().getMethodName();
		
		System.out.println("****method failed is ********* "+failmethod);
	
	 System.out.println("/////////////");
	et.fail("failed due to assertion");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	//ext.flush();
		
	}

	@Override
	public void onTestSkipped(ITestResult result2) {
		// TODO Auto-generated method stub
		String  skipmethod=result2.getMethod().getMethodName();
		System.out.println("****method skipped is ********* "+skipmethod);
		/*
	 et=	ext.createTest("method name skip");
	et.skip("skip due to dependency");
	*/	
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
String  successmethod=arg0.getMethod().getMethodName();
		
		System.out.println("****method pass is ********* "+successmethod);
	
	 System.out.println("/////////////");
	et.pass("passed***********");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	
	}
	
	@AfterMethod
	public void flush()
	{
		
		ext.flush();
	}

}
