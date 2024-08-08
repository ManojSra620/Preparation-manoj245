package Com_framework;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

public class Testng_xml_test 
{
	@Test
	public void t1()
	{
		System.out.println("t1");
	}
	
	
	@Test
	public void t11()
	{
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("t1 "+ldt.toString());
	}

}
