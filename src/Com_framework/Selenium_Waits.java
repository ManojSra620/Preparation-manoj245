package Com_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Waits 
{
	
	@Test
	public void waits() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\Selenium\\\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://app.vwo.com/#/login");
		Thread.sleep(3000);
		d.findElement(By.id("checkbox-remember")).click();
		if(d.findElement(By.id("checkbox-remember")).isSelected())
		{
			System.out.println("checked");
		}
		else 
		{
			System.out.println("unchecked");
			
		}
		d.close();
		
		
	}

}
