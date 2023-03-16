package Com_framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCS_Testing 
{
	//WebDriver dd;
	@Test
	public void starting()
	{
		/*
		TCS_Test_Base b=new TCS_Test_Base("Manoj");
		b.chromedriver();
		b.getter();
	//	dd= b.getter();
	 * */
		
		TCS_Test_Pagefactory tt=new TCS_Test_Pagefactory("Manoj");
	//	tt.chrome();
	//	tt.getter();
		tt.login("agent@phptravels.com", "demoagent");
		tt.close();
	}
	
//	@Test
	public void testing()
	{
		//TCS_Test_Pagefactory nn=new TCS_Test_Pagefactory("Manoj");
		//nn.login("agent@phptravels.com", "demoagent");
	//	dd.close();
	}
	
	
	/*
	@AfterMethod
	public void close()
	{
		dd.close();
	}
	*/

}
