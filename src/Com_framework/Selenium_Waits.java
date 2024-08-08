package Com_framework;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Selenium_Waits 
{
 WebDriver d;
	@Test
	public void waits() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\Selenium\\\\\\chromedriver.exe");
		
		
		ChromeOptions cop=new ChromeOptions();
		cop.addArguments("--remote-allow-origins=*");
		//cop.setHeadless(true);
		WebDriver d=new ChromeDriver(cop);
		this.d=d;
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//d.manage().window().
		d.get("https://app.vwo.com/#/login");
		
		//Thread.sleep(3000);
		// (//*[local-name()='svg' and @class='checkbox-radio-icon'])[3]
		
		//(//span[@class='checkbox-radio-button ng-scope'])[1]/*[local-name()='svg'][1]
		d.findElement(By.xpath("(//span[@class='checkbox-radio-button ng-scope'])[1]/*[local-name()='svg'][1]")).click();
		Thread.sleep(3000);
		Boolean b=d.findElement(By.xpath("(//span[@class='checkbox-radio-button ng-scope'])[1]/*[local-name()='svg'][1]")).isSelected();
		System.out.println("true or false:------------"+b);
		Thread.sleep(3000);
		if(d.findElement(By.xpath("(//span[@class='checkbox-radio-button ng-scope'])[1]/*[local-name()='svg'][1]")).isSelected())
		{
			System.out.println("checked");
		}
		else 
		{
			System.out.println("unchecked");
			
		}
		
	}
	
	@AfterTest
	public void close()
	{
		d.close();
	}

}
