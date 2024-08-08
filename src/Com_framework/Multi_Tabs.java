package Com_framework;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Multi_Tabs 
{
@Test
	public static void multitb_mrth() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.stqatools.com/demo/Windows.php");
		
	//	d.switchTo().newWindow(WindowType.TAB);  
		//when selenium java 4 (selenium 4) is oinstalled and jars are added and then selenium java ja2 version 2 is removed then new window is coming
		
		
		//d.switchTo().newWindow(WindowType.WINDOW);
		String parwin=d.getWindowHandle();
		System.out.println(parwin);
		//Thread.sleep(2000);
		//d.switchTo().window(parwin);
		d.findElement(By.xpath("//button[contains(text(),'Click to open new Window')]")).click();
		Thread.sleep(3000);
		Set<String> s=d.getWindowHandles();
		for (String m:s)
		{
			System.out.println(m);
		}
		Iterator<String> i=s.iterator();
		String win1=i.next();
		String win2=i.next();
		d.switchTo().window(win2);
		d.close();
		d.switchTo().window(win1);
		//d.switchTo().newWindow(WindowType.TAB).switchTo();
		d.close();

	}

}
