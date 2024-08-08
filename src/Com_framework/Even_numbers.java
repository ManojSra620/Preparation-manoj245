package Com_framework;

import java.util.Arrays;
import java.util.List;

public class Even_numbers {

	public static void main(String[] args) 
	{
		List<Integer> li=Arrays.asList(2,4,7,99,23,56);
		for(int i=0;i<li.size();i++)
		{
		if (li.get(i)%2==0) 
		{
			System.out.println(li.get(i)+" is an even number");
		} 
		else 
		{
			System.out.println(li.get(i)+" is an odd number");
		}
		}
	

	}

}
