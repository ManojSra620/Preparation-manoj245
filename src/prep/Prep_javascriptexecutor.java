package prep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prep_javascriptexecutor 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		try {
			
		
		d.get("https://www.google.com/");
		d.findElement(By.id("APjFqb")).sendKeys("idrw"+Keys.ENTER);
		WebElement wd=d.findElement(By.xpath("(//div[@class='byrV5b']//cite[text()='https://idrw.org'])[2]"));
		WebDriverWait wb=new WebDriverWait(d, Duration.ofSeconds(20));
		wb.until(ExpectedConditions.visibilityOf(wd));
		
	}
finally 
{
		
	d.close();
}
		
		/*
		JavascriptExecutor  js=(JavascriptExecutor)d;
		js.executeScript("argument[0].click()", args);
		*/
		// document, window: scroll by, argument
		

	}

}
