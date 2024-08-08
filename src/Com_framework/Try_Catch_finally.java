package Com_framework;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Try_Catch_finally 
{
int index=1;
	
	@Test

	public static int a()
	{
		int index=0;
		//System.out.println("Hi Test");
		return index;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		
		
		
		try 
		{
		//	System.out.println(1/0);
		//	System.out.println(a());
		//	System.out.println("try");
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
		finally 
		{
			System.out.println("finally block");
		}
		System.out.println("outside the block");
		
	}
	
	
}