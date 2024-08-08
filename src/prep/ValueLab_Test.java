package prep;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValueLab_Test 
{
	WebDriver d;
	
	@BeforeClass
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.setHeadless(true);
		
		  d=new ChromeDriver(op);
		d.get("http://omayo.blogspot.com/");
		
	}
		
	@Test
	public void homepage_checkdate()
	{
			
		String date=d.findElement(By.xpath("//h2[@class='date-header']//span")).getText();
		
		String[] da=date.split(",");
		
		String datemon=da[1];
		String trimdate=datemon.strip();
		 
		 String[] f=trimdate.split(" ");
		 
		 String Actualmon=f[0];
		 String Actualdate=f[1];
		 
		 System.out.println(Actualmon+"  "+Actualdate);
		
		  String year1=da[2];
		  String actualyear=year1.strip();
		  System.out.println(actualyear);
		  
		  
		LocalDateTime ldt=LocalDateTime.now();
		Month expmonth=ldt.getMonth();
		String ss=Month.MARCH.name();
		int expyear=ldt.getYear();
		int expday=ldt.getDayOfMonth();
		System.out.println("expected month "+ss);
		
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualyear, expyear);
		sf.assertEquals(Actualmon, ss);
		sf.assertEquals(Actualdate, expday);
		sf.assertAll();
		
		
		
	
	}	
	
	@Test
	public void checkspelling()
	{
		String actual=d.findElement(By.xpath("//input[@id='alert2']")).getAttribute("value");  
		String expected="ClickAfterTextDisappears" ;
		Assert.assertEquals(actual, expected);
	}
	
	@AfterClass
	public void close()
	{
		d.close();	
	}
	
	

}
