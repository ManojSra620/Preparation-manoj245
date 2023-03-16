package Com_framework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Method_imple 
{
	WebDriver d;
	//this.d=null;
	
	
	//@BeforeMethod
public void Method_imple(WebDriver dd)  // 
{
	
	 this.d=dd;
	
	
}
	
	//@Test
	public void searchingfor_open()
	{
		
		d.findElement(By.name("q")).sendKeys("open");
		d.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		//return d;
		//return this.d=d;
		//System.out.println(d);
	}
	
	//@AfterMethod
	
	public void close()
	{
		d.close();
		
	}

	
	

}
