package Com_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Javascript_click 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("-remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get("https://login.yahoo.com/");
		
		WebElement chkbox=d.findElement(By.id("persistent"));
		try 
		{
			chkbox.click();
			
		} 
		catch (Exception e) 
		{
			System.out.println("checkbox selected?:-------"+chkbox.isSelected());
			System.out.println("checkbox selected?:-------"+chkbox.isEnabled());
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click()", chkbox);
		Thread.sleep(3000);
		}
		finally 
		{
			d.close();
		}
		
		
	}

}
