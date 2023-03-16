package Com_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Right_click 
{
	@Test
	public void rghtclk() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	

	d.get("http://open.qa/");
	Thread.sleep(5000);
	//d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	WebElement btn=d.findElement(By.xpath("//a[@class='btn btn-lg btn-success']"));
	Thread.sleep(5000);
	Actions a=new Actions(d);
	a.contextClick(btn).perform();
	Thread.sleep(2000);
	//d.switchTo().alert().accept();
	//a.moveToElement(btn, 0, 0)
	/*
	a.contextClick(btn).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
	sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	*/
	
	}

}
