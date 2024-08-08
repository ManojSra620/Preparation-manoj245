package Listeners_retry;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Pgm_under_test /*extends annotationtransformer */ // implements ITestListener
{
	@RetryCountIfFailed()
	
	@Test
	public void test()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
	//	op.setc
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.manage().window().maximize();
		d.get("http://omayo.blogspot.com/");
		
		
		WebElement e;
	//	d.findElement(By.id("drop1")).click();
		// WebElement e=d.findElement(By.id("drop1")); correct
		
			 e=d.findElement(By.id("ddrop1"));
			
		
		
		
		
		Select s=new Select(e);
		List<WebElement> l=s.getOptions();
		//System.out.println(l);
		for(WebElement w:l)
		{
		System.out.println(w.getText());
		}
		s.selectByIndex(2);  // selects the third ele of dropdown in UI.
		d.close();
		
	}

	
}
