package Com_framework;

import org.testng.annotations.Test;

public class Testng_Priority_Test 
{									// if no priority is given it l execute the alphabetic order which are having not set priority.
	@Test 
	public static void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public static void test2()
	{
		System.out.println("test2");
	}
	
	@Test(priority=0)
	public static void test3()
	{
		System.out.println("test3");
	}
	
	
	@Test(priority=1)
	public static void test6()
	{
		System.out.println("test6");
	}
	
	
	@Test(priority=1)
	public static void test5()
	{
		System.out.println("test5");
	}

}
