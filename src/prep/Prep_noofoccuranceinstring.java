package prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prep_noofoccuranceinstring 
{

	public static void main(String[] args) throws IOException 
	{
		String m="Manojkumarsadasi";
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int j=0;
		String f=b.readLine();
		
		for(int i=0;i<m.length();i++)
		{
			Character c=m.charAt(i);
			String r=c.toString();
			
			if(f.equalsIgnoreCase(r))
			{
				j++;
			}
			
		}
		System.out.println(j);
	}

}
