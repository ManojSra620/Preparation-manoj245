package Com_framework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_testing 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		ChromeDriver d=new ChromeDriver(op);
		d.get("https://www.google.com/");
		Actions ac=new Actions(d);
		
		
		
		

	}

}
