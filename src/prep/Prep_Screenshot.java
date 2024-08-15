
package prep;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prep_Screenshot 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(6500);
		TakesScreenshot t;
		t=(TakesScreenshot)d;
		File src=t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\manoj\\OneDrive\\Desktop\\Writetoexcel\\samplepng"+".png"));
		
		d.close();
	//	Thread.sleep(10000);
	//	d.get("C:\\Users\\manoj\\OneDrive\\Desktop\\Manoj _ALL");

	}

}
