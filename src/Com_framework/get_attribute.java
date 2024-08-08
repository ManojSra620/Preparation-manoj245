package Com_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class get_attribute 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\Selenium\\\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.setHeadless(true);
		WebDriver d=new ChromeDriver(op);
		d.get("http://omayo.blogspot.com/");
		WebElement wb=d.findElement(By.id("but2"));
		String s=wb.getText();
		System.out.println(s);
		String t=d.findElement(By.xpath("//div[@class='dropdown']//button")).getText();
		System.out.println("green button text value is: "+t);
		WebElement webtext=d.findElement(By.name("fname"));
		String text=webtext.getText();
		System.out.println("webtext : "+text);
		WebElement isdisplayed=d.findElement(By.id("but1"));
		Boolean b=isdisplayed.isDisplayed();
		System.out.println("true or flase: "+b);
		Boolean bb=isdisplayed.isEnabled();
		System.out.println("enabled: "+bb);
		
		
		d.close();

	}

}
