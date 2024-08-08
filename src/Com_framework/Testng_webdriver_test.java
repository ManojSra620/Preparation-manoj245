package Com_framework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_webdriver_test // passed
{
	WebDriver d;
	
	@BeforeTest
	public void man1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		d=new ChromeDriver(op);
		d.get("https://hindustanpetroleum.com/");
		
	}
	
	
	@Test
	public void man2()
	{
		String s=d.getTitle();
		System.out.println(s);
	}
	
	@AfterTest
	public void man3()
	{
		d.close();
	}

}
