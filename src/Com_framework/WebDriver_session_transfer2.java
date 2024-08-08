package Com_framework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_session_transfer2 //extends WebDriver_session_transfer 
{
	static WebDriver d1;       // if we make it static it is working
	// static String str;   // if we make the string static, the value is retained for transfer2 and string value methods.
	
	
	
	public WebDriver_session_transfer2(WebDriver dr)
	{
		this.d1=dr;
	}
	
	
	/*
	public WebDriver_session_transfer2(String s)
	{
		this.str=s;
		System.out.println("values of string "+str);
	}
	*/
	
	@Test(priority=3)
	public static void title_to_be_shown_as() 
	{
		//WebDriver_session_transfer wb=new WebDriver_session_transfer();
		//d1=wb.enter_searchvalue();
		
	   String s= d1.getTitle();
		Assert.assertEquals(s,"TCS - Google Search");	
		
		System.out.println("TCS Pass************");
		//d1.close();
	   
	}
	
	@Test(priority=4)
	public static void close() 
	{
		
		 System.out.println("close***************** ");
		d1.close();
	   
	}
	
	/*
	
	@Test(priority=4)
	public  void string_value() 
	{
	   System.out.println("Value of d "+str);
	   
	}
*/
}
