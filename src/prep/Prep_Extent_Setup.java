package prep;

import java.net.Inet6Address;
import java.net.UnknownHostException;

import javax.swing.border.EtchedBorder;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Prep_Extent_Setup// implements ITestListener
{
	static ExtentReports ext;
	static ExtentTest et;
	
	public void extent_setup() throws UnknownHostException
	{
		
	
	ext=new ExtentReports();
	ExtentSparkReporter sp=new ExtentSparkReporter("Prep_extent.html");
	//ExtentTest et;
	ext.attachReporter(sp);
	ext.setSystemInfo("testername", System.getProperty("user.name"));
	ext.setSystemInfo("machine_name", Inet6Address.getLocalHost().getHostName());
	sp.config().setDocumentTitle("prep extent doc title");
	sp.config().setReportName("prep extent report name");
	
	
	}
}
