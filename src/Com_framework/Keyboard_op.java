package Com_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard_op 
{
	@Test
	public void key() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get("https://www.google.com/");
		//d.navigate().
		d.manage().window().maximize();
		//d.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.chord(Keys.SHIFT+"abcd"));
		//d.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.chord(Keys.SHIFT+"abc",Keys.BACK_SPACE));
		WebElement w= d.findElement(By.xpath("//textarea[@class='gLFyf']"));
		Actions ac=new Actions(d);
		
		ac.keyDown(Keys.SHIFT).sendKeys("abcd").keyUp(Keys.SHIFT).perform(); // =  d.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.chord(Keys.SHIFT+"abcd"));
		Thread.sleep(3000);
		
		ac.sendKeys("abcdd").perform();
		Thread.sleep(3000);
		d.close();
		
	}


}
