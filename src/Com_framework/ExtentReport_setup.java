package Com_framework;

import java.net.Inet6Address;
import java.net.UnknownHostException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.apache.logging.log4j.*;



public class ExtentReport_setup
{
	 public static  ExtentReports ext; 
	// ExtentSparkReporter sp;
	/*
	ExtentSparkReporter sf = new ExtentSparkReporter("ExtentSparkFail.html")
			  .filter()
			    .statusFilter()
			    .as(new Status[] { Status.FAIL, Status.PASS } )
			  .apply();
			  */
	public static ExtentSparkReporter sp;
	
	public static ExtentTest et;
	
	  // this.getClass().getSimpleName(
	org.apache.logging.log4j.Logger l=org.apache.logging.log4j.LogManager.getLogger(ExtentReport_setup.class.getName());
	
	
@BeforeSuite
	public void ext_setup() throws UnknownHostException
	{
	sp=new ExtentSparkReporter("extentspreport3.html");
	ext=new ExtentReports();
		ext.attachReporter(sp);
		sp.config().setDocumentTitle("sample extent doc title");
		sp.config().setReportName("sample extent report name");
		ext.setSystemInfo("testername", System.getProperty("user.name"));
		ext.setSystemInfo("machine_name", Inet6Address.getLocalHost().getHostName());
		
	}

@AfterMethod(alwaysRun=true)
public void report(ITestResult res)
{
	
try 
{
	if(res.getStatus() == ITestResult.FAILURE)
	{
		System.out.println(ITestResult.FAILURE);
		et.log(Status.FAIL, "*****failed msg****");
		et.fail(res.getName());
		l.trace("no trace in fail");
		
	} 
	
	else if(res.getStatus()== ITestResult.SKIP)
	{
		System.out.println("***print skip***");
		et=	ext.createTest("skip method");
		et.skip(res.getName());
		//ExtentTest et1=	ext.createTest("skip method");
		et.skip("*****skipped***********");
		l.trace("no trace in skip");
	}
	
	else if(res.getStatus()== ITestResult.SUCCESS)
	{
		
		System.out.println(ITestResult.SUCCESS);
		et.pass(res.getName());
		//ExtentTest et1=	ext.createTest("skip method");
	//	et.skip("*****passed***********");
		et.pass("******passed******");
		l.trace("trace in pass");
	}
	
	 ext.flush();

} 
catch (Exception e) 

{
	
}	

	//ext.flush();
}

// @AfterSuite
public void extentflush()
{
	ext.flush();
}



}
