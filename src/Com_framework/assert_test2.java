package Com_framework;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test2 
{
	@Test
	public void assert1()
	{
		int a=2;
		int b=3;
		/*
		if (a==b) 
		{ 
			System.out.println("a equals b");
			
		}
		*/
		Assert.assertTrue(a==b);
	}
	
	@Test
	public void assert2()
	{
		//assert_test2 n=new assert_test2();
		// object n, if null it l pass
		
		//assert_test2 m=null;
		String s=null;
		
		Assert.assertNull(s);  // pass. for integers u cant assign null like string.
		
	}
	
	public void assert3()
	{
		
	}
	
	public void assert4()
	{
		
	}

}
