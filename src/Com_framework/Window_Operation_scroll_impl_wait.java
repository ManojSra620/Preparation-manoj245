package Com_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Window_Operation_scroll_impl_wait 
{
	// https://www.skoda-auto.co.in/models/kushaq-monte-carlo/kushaq-monte-carlo
	@Test
	public void win() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	    d.get("https://www.skoda-auto.co.in/models/kushaq-monte-carlo/kushaq-monte-carlo");
	    d.manage().window().fullscreen();
	    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebDriverWait wait=new WebDriverWait(d, 10);
	    
	   // Thread.sleep(5000);
	    Actions a=new Actions(d);
	    WebElement w=d.findElement(By.id("onetrust-accept-btn-handler"));// //button[text()="Accept All Cookies"],  //button[contains(text(),"Accept All Cookies")]
	    a.moveToElement(w).click().perform();
	   // Thread.sleep(5000);
	    JavascriptExecutor j= (JavascriptExecutor) d;
	    j.executeScript("window.scrollBy(0,1400)");
	  //  Thread.sleep(3000);
	    
	    d.findElement(By.xpath("//*[@id=\"ImporterV2HeaderModule-a4b4cb58\"]/div/nav/div/div/div[2]/div/a/div")).click();
	   // Thread.sleep(3000);
	    
	   // d.findElement(By.cssSelector("div::after")).click();
	    d.close();
	    
	    
		
	}

}
