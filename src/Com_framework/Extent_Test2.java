package Com_framework;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Extent_Test2 extends ExtentReport_setup


{
	//Logger log2=LogManager.getLogger(this.getClass().getSimpleName());
	// public ExtentTest et;
	@BeforeTest
	public void pass4()
	{
		//log2.fatal("fatal pass");
	et=	ext.createTest("pass4 method");
	/*
	System.out.println("pass");
	et.pass("test pass");
	*/
	l.trace("pass log");
		System.out.println("pass 4");
	//	et.pass("test got passed");
		String cl=et.getClass().getName();
		
	
	// ext = ExtentReporter.generateExtentReport();
	
	}
	
	@Test
	public void pass3()
	{
		//log2.fatal("fatal pass");
	et=	ext.createTest("pass3 method");
	/*
	System.out.println("pass");
	et.pass("test pass");
	*/
	l.trace("pass log");
		System.out.println("pass 3");
	//	et.pass("test got passed");
		String cl=et.getClass().getName();
		
	
	// ext = ExtentReporter.generateExtentReport();
	
	}
	

}
