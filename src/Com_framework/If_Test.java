package Com_framework;


import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class If_Test 
{
@Test
	public void impo()
	{
		// TODO Auto-generated method stub
		int x=40;
		if (10<x && x<30) 
		{
			System.out.println("pass");	
		}
		else
		{
	assertFalse(10<x && x<30);
			System.out.println("msin fail");
		}
	}

}
