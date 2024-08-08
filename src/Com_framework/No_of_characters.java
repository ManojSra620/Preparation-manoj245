package Com_framework;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class No_of_characters 
{
	static int j=0;

	public static void main(String[] args) 

	{
		String fn="manoj kumar sadasivuni";
		
		for (int i = 0; i <fn.length(); i++) 
		{
			Character c=fn.charAt(i);
			String ss=c.toString();
			if (ss.equalsIgnoreCase("a")) 
			{
				System.out.println("char found");
				
					j++;
				
			}
			
		}
		System.out.println("total "+j);
	}
@Test
	public void hs()
	{
		Map<String, String> m=new HashMap<>();
		m.put("1", "Maanoj");
		String s= m.get("1");
		System.out.println(s);
		System.out.println(m);
		System.out.println("Hi");
	}


}
