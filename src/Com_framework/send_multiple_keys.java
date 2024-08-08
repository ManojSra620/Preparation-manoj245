package Com_framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class send_multiple_keys 
{
	
	@Test
	public void key() throws IOException, ParseException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get(getjsondata("url"));
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search=d.findElement(By.xpath("//textarea[@class='gLFyf']"));
		d.switchTo().frame(0);
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@jsname='ZUkOIc']")).click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		//Alert a=d.switchTo().alert();
		//a.dismiss();
		Thread.sleep(3000);
		//search.click();
		//Thread.sleep(3000);
	// 	JavaScriptExecutor jse=(JavaScriptExecutor)d;
		// ((RemoteWebDriver) jse).executeScript("arguments[0].setAttribute('style','border: solid 5px red');",search);
		// d.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.chord(Keys.SHIFT)+Keys.CONTROL+"m");
		//search.sendKeys(Keys.chord(Keys.SHIFT+"m")+Keys.chord(Keys.SHIFT));
		//Actions ac=new Actions(d);
		// ac.keyDown(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		//ac.keyDown(Keys.SHIFT).sendKeys("a").build();
		//ac.keyDown(Keys.CONTROL).build();
		//ac.keyUp(Keys.CONTROL).build();
		//ac.keyUp(Keys.SHIFT).build().perform();
	//	search.sendKeys(Keys.chord(Keys.NUMPAD1,Keys.SHIFT,"a"));
		//WebElement e=d.findElement(By.xpath("//img[@class='lnXdpd']"));
		//e.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"a")); it worked with numpad1 instead of control
		
		Actions ac=new Actions(d);
		// ac.keyDown(Keys.SHIFT).keyDown(Keys.LEFT_CONTROL).keyDown(Keys.DELETE).build().perform();
		ac.keyDown(Keys.chord(Keys.LEFT_SHIFT,Keys.LEFT_CONTROL,"a")).build().perform();
		
	}
	
	
	public  JSONObject jsondata() throws IOException, ParseException
	{
		File f=new File("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\sample.json");
		String s=FileUtils.readFileToString(f,"UTF-8");
		Object o=new JSONParser().parse(s);
		JSONObject j=(JSONObject)o;
		return j;

	}
	
	public String getjsondata(String key) throws IOException, ParseException
	{
		String testdata=(String) jsondata().get(key);
		return testdata;
	}

}
