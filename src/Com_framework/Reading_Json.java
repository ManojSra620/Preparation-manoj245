package Com_framework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.google.gson.JsonParseException;

public class Reading_Json 
{
	public  JSONObject jsondata() throws IOException, ParseException
	{
		File f=new File("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\sample.json");
		String s=FileUtils.readFileToString(f,"UTF-8");
		Object o=new JSONParser().parse(s);
		JSONObject j=(JSONObject)o;
		return j;

	}
	
	@Test
	public void google() throws IOException, ParseException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get(getjsondata("url"));
		
		d.close();
	}
	
	public String getjsondata(String key) throws IOException, ParseException
	{
		String testdata=(String) jsondata().get(key);
		return testdata;
	}
	
	
	
	

}
