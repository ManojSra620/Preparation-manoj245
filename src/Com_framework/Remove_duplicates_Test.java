package Com_framework;

import java.util.Iterator;

public class Remove_duplicates_Test 
{

	public static void main(String[] args) 
	{
		String s="Indiannational";
		String r="";
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<s.length();i++)
		{
		Character c=s.charAt(i);
		
		String ss=c.toString();
		if (!r.contains(ss)) 
		{
			
			sb=sb.append(c);
		}
		r=sb.toString();
		}
System.out.println(r);
System.out.println(sb);
	}

}
