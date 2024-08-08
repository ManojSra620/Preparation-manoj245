package Com_framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New_switch_and_Var_keyword
{

	public static void main(String[] args) throws IOException 
	{
		String month = null;
		String days=null;
		var a=false;
		var n=10;
		var k="man";
		System.out.println(a);
		System.out.println(n);
		System.out.println(k);
		System.out.println("enter month:  ");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String s=b.readLine();
		
		
		days=switch (s) 
				
		{
		case "August"  -> "zero days";
			
			
			
		case "September" ->	"one days";
			
			
			
		case "October" ->	"Three days";
			
		default ->	"not planned fot given month";
			
		};
		System.out.println("value is: "+days);
	}

}
