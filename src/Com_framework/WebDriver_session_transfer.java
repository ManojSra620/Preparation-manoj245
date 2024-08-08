package Com_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebDriver_session_transfer 
{
	WebDriver d;
// WebDriver_session_transfer2 dd=new WebDriver_session_transfer2(d);
	
	// WebDriver_session_transfer2 d2=new WebDriver_session_transfer2("imp");
	
	@Test(priority=1)
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		d=new ChromeDriver(op);
		d.get("https://www.google.com/");
		d.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void enter_searchvalue() 
	{
	    d.findElement(By.id("APjFqb")).sendKeys("TCS"+Keys.ENTER); 
	   // WebDriver_session_transfer2 d2=new WebDriver_session_transfer2("imp");
	   WebDriver_session_transfer2 dd=new WebDriver_session_transfer2(d); // ok
	  //  return this.d;
	}
	
	

}
