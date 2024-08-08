package Com_framework;

import org.openqa.selenium.JavascriptExecutor;

public class Singleton_Test  
{
 
	public static void main(String[] args) 
	{
		ant a=ant.m();  // we can create only one reference 
		//ant b=new ant();
		a.m();
		
	}

}

class ant
{
	static ant obj1=new ant();
	
	
	ant obj2=new ant();
	
	private ant()
	{
		System.out.println("ant constructor");
		//JavascriptExecutor
	}
	
	public static ant m()
	{
		System.out.println("m");
		return obj1;
	}
	
	
	
}
