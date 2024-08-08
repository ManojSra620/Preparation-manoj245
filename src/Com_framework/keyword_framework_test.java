package Com_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class keyword_framework_test extends Keyword_frame_actions
{
	
	WebDriver d;
	Keyword_frame_actions k=new Keyword_frame_actions();
	//@BeforeClass
	public void launch1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		d=new ChromeDriver(op);
		d.get("https://www.pwc.in/");
		//this.d=dd;
		
	}
	
	@Test
	public void testing() throws IOException, InterruptedException
	{
		
		
		for(int i=1;i<=3;i++)
		{
			FileInputStream f=new FileInputStream("C:\\Selenium\\PWC.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet sh=wb.getSheetAt(0);
		XSSFRow row=sh.getRow(i);
		XSSFCell cell=row.getCell(0);
		String s=cell.getStringCellValue();
		System.out.println(s);
		
		
		switch (s) 
		{
		case "blogs": 
		{
			launch1();
		
			k.blogs(d);
			Thread.sleep(5000);
			close();
			
			break;
		}
		
		case "aboutus": 
		{
			System.out.println("aboutus************");
			launch1();
			k.aboutus(d);
			Thread.sleep(5000);
			close();
			break;
		}

		case "careers": 
		{
	
			break;
		}
		default:
		
		}
		
	
		}
	
	}
	
	
	//@AfterClass
	public void close()
	{
		d.quit();
	}
	
	
	
	
	
	
	
	

}
