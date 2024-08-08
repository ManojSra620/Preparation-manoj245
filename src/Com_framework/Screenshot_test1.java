package Com_framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class Screenshot_test1 
{
	//@Test
	//public void test_s() throws IOException, InterruptedException
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	
		//WebDriver d=WebDriverManager.chromedriver().create();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get("https://www.youtube.com/");
		
		TakesScreenshot sc=(TakesScreenshot)(d);
		File f=sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\test-output\\new"+".png"));
		Thread.sleep(2000);
		d.close();
	}

}
