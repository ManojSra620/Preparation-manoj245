package Com_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

	public static void main(String[] args) 
	{
		String k="Amazon";
     org.testng.Assert.assertTrue(true);
     //assert.a
     //org.testng.Assert.assertf
		//a.equals(a)
     /* when u give webdriver d=null
      *  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
     d.get("https://www.google.com/");
      * we get below exception.
      * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.WebDriver.get(String)" because "d" is null
	at Com_framework.Assert.main(Assert.java:15)   */
   // org.testng.Assert.assertNull(args, k);
     WebDriver d = null;
     System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
     d=new ChromeDriver();
     d.get("https://www.google.com/");
     
     		
	}

}
