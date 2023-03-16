package Com_framework;

import org.testng.annotations.Test;

public class Testng_Groups 
{
	@Test (groups = {"gold"})
	public void testa()
	{
		System.out.println("gold testa");
	}
	
	@Test (groups = {"gold","iron"})
	public void testb()
	{
		System.out.println("gold and iron testb");
	}
	
	@Test (groups = {"gold"})
	public void testc()
	{
		System.out.println("gold testc");
	}
	
	@Test (groups = {"silver"})
	public void testd()
	{
		System.out.println("silver testd");
	}
	
	@Test (groups = {"silver"})
	public void teste()
	{
		System.out.println("silver teste");
	}
	
	@Test
	public void testf()
	{
		System.out.println("testf");
	}
	
	@Test
	public void testg()
	{
		System.out.println("testg");
	}
	

}
