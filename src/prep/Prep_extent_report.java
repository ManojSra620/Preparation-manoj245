package prep;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Prep_extent_report extends Prep_Extent_Setup implements ITestListener
{

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
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void report(ITestResult r)
	{
		if (r.getStatus()==ITestResult.SUCCESS) 
		{
			et.pass("test pass");
			et.log(Status.PASS, MarkupHelper.createLabel(r.getName(), ExtentColor.GREEN));
		
			
		}
		
		else if (r.getStatus()==ITestResult.FAILURE) 
		{
			et.fail("test pass");
			et.log(Status.FAIL, MarkupHelper.createLabel(r.getName(), ExtentColor.RED));
		
			
		}
		ext.flush();
		
	}
	
	

}
