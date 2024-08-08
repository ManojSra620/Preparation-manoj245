package Com_framework;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.bcel.generic.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Screenshot_Failure_TestNG_Listener implements ITestListener
{
	// https://boodmo.com/
	static WebDriver dr;
	@Test
	public void listener_test() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://boodmo.com/");
		d.manage().window().maximize();
		this.dr=d;
		Assert.assertTrue(false);
		
		// d.findElement(By.xpath("//input[@type='searc']")).sendKeys("VW");
		/*
		WebElement wb=d.findElement(By.xpath("//select[@class=\"form-control ng-pristine ng-invalid ng-touched\"]"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(wb);
		s.selectByVisibleText("VW");
		*/
	}

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
		//ITestResult.
		
	}

	@Override
	public void onTestFailure(ITestResult arg0)  
	{
		File f=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File("C:\\Users\\manoj\\OneDrive\\Desktop\\TCS GCP\\failureimage.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//copyFile(f, new "C:\\Users\\manoj\\OneDrive\\Desktop\\TCS GCP\\failureimage.jpg");
		System.out.println("Listener for failure");
		dr.close();
		
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

}
