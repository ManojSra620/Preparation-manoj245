package Com_framework;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Test 
{
	
	@BeforeMethod
	public void beforemethod1()
	{
		System.out.println("beforemethod1");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
	
	@BeforeMethod
	public void beforemethod2()
	{
		System.out.println("beforemethod2");
	}
	
	
	@BeforeMethod
	public void beforemethod3()
	{
		System.out.println("beforemethod3");
	} 
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}

}
