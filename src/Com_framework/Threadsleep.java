package Com_framework;

import java.sql.Time;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Threadsleep 
{

	public void wait1(Timeout t)
	{
		System.out.println("time function");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://boodmo.com/");
		Thread.sleep(5000);
		Threadsleep t=new Threadsleep();
	//	t.wait1(Timeout.seconds(1)); not working
		//t.wait(3000);
		//d.switchTo().alert().dismiss();
		d.findElement(By.xpath("//input[@type='search']")).sendKeys("VW");
		Thread.sleep(5000);
		d.close();
	}
	
	

}
