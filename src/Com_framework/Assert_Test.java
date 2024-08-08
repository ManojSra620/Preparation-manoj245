package Com_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Test 
{
	@Test
	public void assert_T1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		//WebDriver drv=new ChromeDriver();
		//drv.get("https://www.google.com/");
		String a="AAA";
		String b="BBB";
		SoftAssert s=new SoftAssert();
	
		s.assertEquals("AAA", a,"AAA cant be equal to string a");
		
		s.assertEquals("BBB", b,"BBB cant be equal to string b");
		
		//s.assertEquals(b , a,"string b cant be equal to string a");
		
		
		//s.assertEquals(a , "ccc","string a cant be equal to ccc");
		
		s.assertAll();
		
/* if assert all is not declared it l show all assertions as pass though failure occurs. If assertall is inserted, all 
 * above statements of assertall are executed but assertall below statements are not executed. 
 * Even if some  statements above assertall are fail, it l execute till asseertall statement and declares result.
 * */
 
	}
	
	//@Test
	public void assert_T2()
	{
		String c="CCC";
		String d="DDD";
		SoftAssert s=new SoftAssert();
	
		s.assertEquals("CCC", c,"CCC cant be equal to string c");
		
		s.assertEquals("DDD", d,"DDD cant be equal to string d");
		
		s.assertEquals(c , d,"string d cant be equal to string c");
		
		
		
		s.assertEquals(c , "DDD","string c cant be equal to DDD");
		s.assertAll(); // here assert_T1 is pass though failed statements are there.
	}
	
	public void assert_T3()
	{
		
	}
	

}
