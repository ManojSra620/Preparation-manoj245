package Com_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty7.server.session.JDBCSessionManager.Session;
import org.testng.annotations.Test;

public class Parallel1 
{
	@Test (threadPoolSize = 5)
	public void parallel1_1() throws Exception
	{
		System.out.println("parallel1_1");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	     d.get("https://www.google.com/");
	     Thread.sleep(3000);
	     d.close();
		long  i=Thread.currentThread().getId();
		System.out.println("parallel1_1 "+i);
		
	}
	/* testng xml file thread-count="1" dominates threadpoolsize value. if th.poolsize is given and thread-count not given and parallel = true given 
	 * in xml then it l run based on poolsize n parllel=true. if u right click n run as testng, it l run normally and parallel is not there in class/ method.
	 * Thread count 1 means at a time only one pgm will launch. 3 means 3 browsers will open at a time
	 */
	
	@Test (threadPoolSize = 5)
	public void parallel1_2() throws InterruptedException
	{
		System.out.println("parallel1_2");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	     d.get("https://www.selenium.dev/");
	     Thread.sleep(3000);
	     d.close();
		long  i=Thread.currentThread().getId();
		System.out.println("parallel1_2 "+i);
	}
	
	@Test (threadPoolSize = 5)
	public void parallel1_3() throws InterruptedException
	{
		System.out.println("parallel1_3");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	     d.get("hhttps://www.thoughtworks.com/en-in");
	     Thread.sleep(3000);
	     d.close();
		long  i=Thread.currentThread().getId();
		System.out.println("parallel1_3 "+i);
	}

}
