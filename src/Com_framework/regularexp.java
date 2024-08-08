package Com_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class regularexp 
{
@Test
	public  void main1() 
	{
		String s="masterdc@tcs.com";
		boolean t=s.matches("masterdc@tcs.com");
		System.out.println("output...");
		Assert.assertTrue(t);    // after assert fails the next line will not be executed. If asserttrue is pass then next line will be executed
		System.out.println("output...");  

	}

}
