package Com_framework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Data_Provider 
{
	
	private String k;

	@Test(dataProvider="getdata")
	public void datap(String input1, String Input2, String Input3)
	{
		//WebDriverManager.chromedriver().setup();
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.findElement(By.name("q")).sendKeys(input);
		d.close();
		*/
		System.out.println(input1+Input2+Input3);
	}
	@DataProvider(name="getdata")
	//@Test
	public Object[][] dataprovidermethod()
	{
		/*
		Object[][] i=new Object[2][2];
		i[1][1]="Manoj";
		i[0][1]="kumar";
		return i;
		*/
		return new Object[][]
				{
			{"Manoj","Kumar","India"}
				};
		//l="Cost";
		
		/*
		List<String> l=new ArrayList<>();
		l.add("agni");
		l.add("prudhvi");
		l.add("Bhramos");
		l.add("astra");
		l.add("Nag");
		*/
	//	ArrayList<String> k = null;
		/*
		for(int i=0;i<4;i++) 
		{
		k= l.get(i);
		this.k=k;
		}
		*/
		
	}
	/*
	public static void main(String[] args) {
		TestNg_Data_Provider m=new TestNg_Data_Provider();
		System.out.println(m.dataprovidermethod());
		
	}
*/
}
