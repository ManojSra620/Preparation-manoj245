package Com_framework;

import static org.testng.Assert.assertEquals;

import java.io.PrintWriter;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Method_imple_Testng 
{
	WebDriver d;
	//this.d=null;
	
	
	//@BeforeMethod
public Method_imple_Testng(WebDriver dd)  // dont use void when object is created (in FrameWork_class_Testng) and argument is passed while creating object.  
{
	
	
	 this.d=dd;
}
	
	//@Test   // testng annotations wont show impact as we r running through FrameWork_class_Testng class where testng annotations have impact
	public void searchingfor_open_Testng()
	{
		
		d.findElement(By.name("q")).sendKeys(Keys.chord("open"+Keys.ENTER));
		//d.findElement(By.xpath("(//input[@classname='gNO89b'])[2]")).click();
		String actual=d.getTitle();
		// Assert.assertEquals(actual, "open - Google Search");  // its void. you cannot print the out come of this assert statement.
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, "open - Google Search");
				System.out.println("failed title verification");  // this is printed as sa.assertall is given at the end.
				sa.assertAll();	
		
				//return d;
		//return this.d=d;
		//System.out.println(d);
				
	}
	
	public void searchingfor_close_Testng()
	{
		
		d.findElement(By.name("q")).sendKeys("close");
		d.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		//return d;
		//return this.d=d;
		//System.out.println(d);
	}
	
	public void searchingfor_val_Testng()
	{
		
		d.findElement(By.name("q")).sendKeys("val");
		d.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		//return d;
		//return this.d=d;
		//System.out.println(d);
		
		
	}
	
	
	//@AfterMethod
	
	public void close_testng()
	{
		//System.out.println("close method");
		d.close();
		
	}
	

}
