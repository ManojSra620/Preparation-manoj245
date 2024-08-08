package Com_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class propfileusage 
{
	@Test
	public void prop() throws IOException
	{
		File f=new File("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\allprop.properties");
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fi);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.addArguments("--incognito-mode");
		WebDriver dd=new ChromeDriver(op);
		dd.get(p.getProperty("url"));
		dd.close();
		//p.remove("url");
	}

}
