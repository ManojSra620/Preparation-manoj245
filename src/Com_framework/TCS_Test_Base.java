package Com_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TCS_Test_Base 
{
	private WebDriver driver;
	private String name;
	//@Test
	public TCS_Test_Base(String name)
	{
		this.name=name;
		System.out.println(name);
	}
//	@Test
	
	//@Test
	public void chgetter(WebDriver dr)
	{
		
		this.driver=dr;
	}
	
	public WebDriver getter()
	{
		WebDriver drv;
		
	//	driver.get("https://phptravels.net/login");
		return driver; // this can also be this.driver. both driver, this.driver works
		
	}


}
