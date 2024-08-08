package Com_framework;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

public class Testng_xml_test2 
{
	@Test
	public void t2()
	{
		System.out.println("t2");
	}
	
	
	@Test
	public void t22()
	{
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("t2 "+ldt.toString());
	}

}
