package Com_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class second_biggest {

	public static void main(String[] args) 
	{
		
		Set<Integer>  se=new HashSet<>();
		//Set<String> st=new Set<String>();
		se.add(3);
		se.add(6);
		se.add(89);
		se.add(69);
		se.add(5);
		//se.
		//System.out.println(se);
		Iterator<Integer> i=se.iterator();
		for (int j=0;j<=4;j++)
		{
		System.out.println(i.next());
		}
		
		
		int[] s=new int[4];
		s[0]=1;
		s[1]=2;
		s[2]=4;
		s[3]=67;
		
		for (int j=0; j<=3;j++)
		{
			if(s[j]<s[j+1])
			{
				System.out.println(s[j+1]);
			}
			
		}
		
		
		
		
	}

}
