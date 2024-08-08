package Com_framework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class New_Tab 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.navigate().to("https://www.selenium.dev/");
		d.manage().window().maximize();
		Actions a=new Actions(d);
		//d.navigate().to("https://www.selenium.dev/");
		/*
		  Set<String> s=d.getWindowHandles();
		  //System.out.println();
		  Iterator<String> i=s.iterator();
		  String i1=i.next();
		  String i2=i.next();
		  String i3=i.next();
		  System.out.println(i1+" "+i2+" "+i3);
		 */
		String s=d.getWindowHandle();
		System.out.println(s); // CDwindow- 2973D9CE455C7548D283D7E36EAD1CFA (on 24-08-2023) 5B6773D25A8563642D5D34B318F206DB, CDwindow-B18BBFF6D0A4A75CEE5CE66EC1F5FB5A window handle id changes. its not constant

		if (!s.equalsIgnoreCase("CDwindow-82BE3419BC4F253B4B13B66C5CD2524E")) 
		{
             System.out.println("we can close window");
             d.close();
		}
		else 
		{
		System.out.println("cant close");	
		}
	//	d.close();
		
		


	}

}
