package Com_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 
{
	@Test
	public void parallel2_1() throws InterruptedException
	{
		System.out.println("parallel2_1");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	     d.get("https://docs.pytest.org/en/7.2.x/");
	     Thread.sleep(3000);
	     d.close();
		long  i=Thread.currentThread().getId();  // https://docs.pytest.org/en/7.2.x/
		System.out.println("parallel2_1 "+i);
	}
	
	@Test
	public void parallel2_2() throws InterruptedException
	{
		System.out.println("parallel2_2");  // https://appium.io/
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	     d.get("https://appium.io/");
	     Thread.sleep(3000);
	     d.close();
		long  i=Thread.currentThread().getId();
		System.out.println("parallel2_2 "+i);
	}
	
	@Test
	public void parallel2_3() throws InterruptedException
	{
		System.out.println("parallel2_3");  // https://www.python.org/
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	     d.get("https://www.python.org/");
	     Thread.sleep(3000);
		d.close();
		long  i=Thread.currentThread().getId();
		System.out.println("parallel2_3 "+i);
	}

}
