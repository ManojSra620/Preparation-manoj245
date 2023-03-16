package Com_framework;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class FrameWork_class_Testng 
{
	@Test
	public static void frame_ng()   throws Exception
	{
		
		FileInputStream f=new FileInputStream("C:\\Selenium\\z.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		int rows=sh.getRows();
		//searchingfor_open  sr=new    searchingfor_open(dr);
		//Method_imple impl=new Method_imple();
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		//imp.Method_imple(dr);
		
		for (int i = 1; i < rows; i++) 
		{
			String cars=sh.getCell(0,i).getContents();
			WebDriver drv=new ChromeDriver();
						//WebDriver drv=new WebDriver();
			//ChromeDriver drv=new ChromeDriver();
			drv.get("https://www.google.com/");
			
			Method_imple_Testng imp_ng=new Method_imple_Testng(drv);   // compare this two lines with framework_class
			//System.out.println(cars);
			switch (cars) 
			{
			case "Open": 
			{
				imp_ng.searchingfor_open_Testng();
				imp_ng.close_testng(); 
// Here we r running testng from frame_ng class. So after method will be run if available in this class. So close method should be called separately to run 
				System.out.println("open is printed");
				 long k=Thread.currentThread().getId();
				 System.out.println("open 1 id is "+k);
				
				 
								break;
			}
			
			case "Close":
			{
			imp_ng.searchingfor_close_Testng();
			imp_ng.close_testng();
			System.out.println("close is printed");
			 long o=Thread.currentThread().getId();
			 System.out.println("close id is "+o);
			
				break;
			}
			
			
			case "val":
			{
			imp_ng.searchingfor_val_Testng();
			imp_ng.close_testng();
			System.out.println("val is printed");
			long p=Thread.currentThread().getId();
			 System.out.println("val id is "+p);
				break;
			}
			
			
			default:
				System.out.println("unmatched");
			}
		}
		
		
		
	}
 @Test
	public void parallel1()
	{
		
	 System.out.println("parallel1");
	 long i=Thread.currentThread().getId();
	 System.out.println("parallel 1 id is "+i);
	}
	
	@Test
	public void parallel2()
	{
		long j=Thread.currentThread().getId();
		 System.out.println("parallel 2 id is "+j);
		System.out.println("parallel2");
	}
	/*
	public static void main(String[] args) {
		System.out.println("main");
	}
	*/   // main method wont run using testng.
}
