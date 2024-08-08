package Com_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups_Test1 
{
	@Test(groups="A")
	public void a1()
	{
	System.out.println("a1");	
	}
	
	@Test(groups="A")
	public void a2()
	{
		System.out.println("a2");
	}
	
	@Test(groups="A")
	public void a3()
	{
		System.out.println("a3");
	//	Assert.fail(); fails the method 
	}
	
	@Test(groups="B")
	public void b1()
	{
		System.out.println("b1");
		Assert.fail();
	}

}
/*
class Groups_Test2
{
	@Test(groups="B")
	public void b2()
	{
		System.out.println("b2");
	}
	
	@Test(groups="B")
	public void b3()
	{
		System.out.println("b3");
	}
}
*/