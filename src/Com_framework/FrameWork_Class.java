package Com_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class FrameWork_Class  
{
	@Test
	public static void frame()   throws Exception
	{
		
		FileInputStream f=new FileInputStream("C:\\Selenium\\z.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		int rows=sh.getRows();
		//searchingfor_open  sr=new    searchingfor_open(dr);
		//Method_imple impl=new Method_imple();
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com/");
		
		Method_imple imp=new Method_imple();
		imp.Method_imple(dr);
		
		for (int i = 1; i < rows; i++) 
		{
		String cars=sh.getCell(0,i).getContents();
		//System.out.println(cars);
		switch (cars) 
		{
		case "Open": 
		{
			imp.searchingfor_open();
			imp.close();
			System.out.println("open is printed");
			break;
		}
		default:
			System.out.println("unmatched");
		}
		}
		
	}

}
