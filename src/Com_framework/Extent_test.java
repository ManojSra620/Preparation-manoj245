package Com_framework;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class Extent_test extends ExtentReport_setup


{
	//Logger log2=LogManager.getLogger(this.getClass().getSimpleName());
	// public ExtentTest et;
	
	
	@Test
	public void pass1()
	{
		//log2.fatal("fatal pass");
	et=	ext.createTest("pass1 method");
	/*
	System.out.println("pass");
	et.pass("test pass");
	*/
	l.trace("pass log");
		System.out.println("pass 1");

		String cl=et.getClass().getName();

	}
	
	// @Test
	public void pass2()
	{
		//log2.fatal("fatal pass");
	et=	ext.createTest("pass2 method");
	/*
	System.out.println("pass");
	et.pass("test pass");
	*/
	l.trace("pass log");
		System.out.println("pass 2");
	//	et.pass("test got passed");
		String cl=et.getClass().getName();
	
	// ext = ExtentReporter.generateExtentReport();
	
	}
	
	
	
	
	@Test
	public void fail()
	{
		/*
		ExtentTest et=	ext.createTest("fail method");
		//Assert.assertTrue(false); dont use testng assertions for failing and reporting in extent report. use et.fail() to make test fail ???
		et.fail("test fail");
		
		*/
		l.trace("fail log");
		et=	ext.createTest("fail method");
		 
		System.out.println("fail");
		int i=10;
		int k=i/0;
		
	}
	
	
	// @Test(dependsOnMethods = {"fail"})
	public void skip()
	{
		
	//ExtentTest et=	ext.createTest("skip method");
		//et.skip("test skipped");
		
		System.out.println("skip");
	}
	
	

}
