package Com_framework;

import org.openqa.selenium.SearchContext;

public class filtercharinstring_prep 
{

	public static void main(String[] args) 
	{
		String s="defence@245"; 
		String ss=s.replaceAll("[^a-z]", "");
		System.out.println(ss);
		
	

	}

}
