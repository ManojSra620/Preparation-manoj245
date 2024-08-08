package Com_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class sample_keyworddriven //extends Sample_keyworddriven2
{
	WebDriver d;
	//@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver dd=new ChromeDriver(op);
		dd.get("https://www.hindustanpetroleum.com/");
		dd.manage().window().maximize();
		this.d=dd;
	}
	
	@Test
	
	public void pgm() throws IOException, InterruptedException
	{
		
		Sample_keyworddriven2 ss=new Sample_keyworddriven2();
		
		//FileInputStream fff=new File
		
		FileInputStream f=new FileInputStream("C:\\Selenium\\HPCL links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheetAt(0);
		for(int i=1;i<=2;i++)
		{
			
		
		XSSFRow row=sh.getRow(i);
		XSSFCell cell=row.getCell(0);
		String s=cell.getStringCellValue();
		System.out.println("cell value is: "+s);
		
		switch(s)
		{
		
		case "CSR":
			System.out.println("Key CSR found");
			launch();
			//d.findElement(By.linkText("CSR")).click();
			ss.pgm2(d);
			close();
			break;
			
			
		case "Newsroom":
			System.out.println("Key newsroom found");
			launch();
			Thread.sleep(10000);
			ss.pgm3(d);
			close();
			break;
			
			default:
				System.out.println("key not found");
		
		}
		
		}
		//ss.pgm2(d);
		
	}
	
//	@AfterMethod
	public void close()
	{
		System.out.println("closing all tabs");
		d.close();
	}
	
	

}
