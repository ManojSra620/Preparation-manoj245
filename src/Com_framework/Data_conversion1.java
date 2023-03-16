package Com_framework;

import org.testng.annotations.Test;

public class Data_conversion1 
{
	
	@Test
	
	public void con1()
	{
		int i=3;
		String s="abc";
		String n="4";
	//	System.out.println();
	    int j=Integer.parseInt(n);   // string to int
	    System.out.println(j);
	    Character ch='m';
	    String ss=ch.toString();          // char to string
	    System.out.println("to string"+ss);
	    String st=ch.toString(ch);
	    System.out.println(st);
	    
	    // char< int < float < double   -- lower level (ex: int) can be assigned to higher level implicitly. lower type to higher type is called widening conversion
	    // higher value to lower value is called narrowing that has to be done manually / explicitly. ex double d=855.35555d, float f= (float)d. d is object of double
	    
		
	}

}
