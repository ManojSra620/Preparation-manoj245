package Com_framework;

import java.util.HashMap;

public class no_of_occurances_hashmap 
{

	public static void main(String[] args) 
	{
		String s="Indian";
		HashMap<Character, Integer> h=new HashMap<>();
		//char[] c=new char[9];
		char c[]=s.toCharArray();
		
		for(char cc:c)
		{
		
		if(h.containsKey(cc))
		{
			
			h.put(cc, h.get(cc)+1);
			
		}
		else
		{
			h.put(cc, 1);
		}
		
				
		}
		System.out.println(s+" "+h);
	}

}
