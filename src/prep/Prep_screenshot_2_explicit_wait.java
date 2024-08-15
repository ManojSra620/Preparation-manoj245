package prep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prep_screenshot_2_explicit_wait
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		
		d.get("https://opensource-demo.orangehrmlive.com/");
		WebDriverWait w=new WebDriverWait(d, Duration.ofSeconds(15));
		w.until(ExpectedConditions.titleContains("OrangeHRM"));
		Thread.sleep(5000);
		// WebElement w=d.findElement(By.name("abc"));
		TakesScreenshot sc=(TakesScreenshot)d;
		File src=sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Selenium\\abc.jpg"));
		
		d.close();
		  FluentWait<WebDriver> fw=new FluentWait<WebDriver>(d);
		  fw.withTimeout(Duration.ofSeconds(10));
		  fw.pollingEvery(Duration.ofSeconds(15));
		  fw.ignoring(FileNotFoundException.class);
		  
		  fw.until(ExpectedConditions.alertIsPresent());  // ex on how to use fluentwait
		

	}

}
