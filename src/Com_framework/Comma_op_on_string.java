package Com_framework;

import org.testng.annotations.Test;

public class Comma_op_on_string 
{
	@Test
	public void test()
	{
		
		String s="Manoj";
		String k=s.toUpperCase();
		System.out.println(k);
		for(int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);
		System.out.print(c);
		
		System.out.print(",");
		
		}
	}

}
