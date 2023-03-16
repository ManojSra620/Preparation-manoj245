package Com_framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.steadystate.css.util.Output;

public class Screenshot_Test 
{
	
	@Test
	public void ts() throws IOException   // only public is allowed for running testng.
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\Selenium\\\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
				File ff=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ff, new File("C:\\\\\\\\\\\\Selenium\\\\screenshots\\\\\shot"+".png"));
		d.close();
		
	
	}

}
