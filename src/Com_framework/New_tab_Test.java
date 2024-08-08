package Com_framework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class New_tab_Test 
{
	@Test
	public void tab() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get("http://omayo.blogspot.com/");
		d.manage().window().fullscreen();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//a[@id='link2'])[2]")).click();
		Set<String> tabs=d.getWindowHandles();
		Iterator<String> i=tabs.iterator();
		String parent=i.next();
		String child=i.next();
		
		d.switchTo().window(parent);
	// closing parent and child windows
		Thread.sleep(3000);
		d.close();
		
        d.switchTo().window(child);
		
		Thread.sleep(3000);
		d.close();
		
		//d.close();
		
	}

}
