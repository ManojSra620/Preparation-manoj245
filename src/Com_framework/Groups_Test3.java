package Com_framework;

import org.testng.annotations.Test;

public class Groups_Test3 
{
	@Test(groups="C")
	public void c1()
	{
		System.out.println("c1");
	}
	
	@Test(groups="C")
	public void c2()
	{
		System.out.println("c2");
	}
	
	
	@Test(groups="B")
	public void b1()
	{
		System.out.println("b1");
	}

}
