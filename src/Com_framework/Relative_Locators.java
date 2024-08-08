package Com_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locators {

	public static void main(String[] args, Object Cookie) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get("https://www.google.com/");
		//WebElement wb=d.findElement(By.className("gNO89b"));
		Thread.sleep(3000);
		By c=RelativeLocator.with(By.id("APjFqb")).above(By.className("gNO89b"));
		//WebElement wb2=d.findElement(withid("APjFqb")).above(wb);
		Thread.sleep(3000);
		d.findElement(c).sendKeys("abc");
		Thread.sleep(3000);
		d.close();

	
	}

	

}
