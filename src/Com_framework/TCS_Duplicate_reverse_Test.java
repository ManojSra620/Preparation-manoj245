 package Com_framework;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TCS_Duplicate_reverse_Test 
{
	//Reverse Differentiate
	//remove duplicate
	/*
	 for (int i = s.length();i>0; i--) //13
	{			System.out.print(s.charAt(i-1)); 
		
	}
	*/
	//int i = 0;
	
	public static void main(String[] args) 
	{
		String s="SravaniManoj";
		StringBuffer sb=new StringBuffer();
		//System.out.println(s.codePointCount(0, 5));
		sb.append(s.charAt(0));
		
		for (int i=1; i<s.length();i++)
		{
		
			char c= s.charAt(i) ;
			
			String m= String.valueOf(c);  // char to string.
			String sra=sb.toString();  // string buffer to string
			if (!sra.contains(m)) 
			{
				sb.append(m);
				//System.out.println(sb);
			}
			
			
		
	}
		System.out.println(sb);
	}

}
