package Com_framework;

import org.testng.annotations.Test;

public class Access_modifiers_Test4 
{
	/*
	@Test
	public void a4()
	{
		
		Access_Modifiers_Test1 a=new Access_Modifiers_Test1();
		a.puba1();
		a.pubstb1();
		a.protc1();
		a.nomodd1();	
	}
	*/
	
	public static void main(String[] args) 
	{
		
		Access_Modifiers_Test1 a=new Access_Modifiers_Test1();
		a.puba1();
		
		a.pubstb1();
		a.protc1();
		a.nomodd1();
	
		// private access modifier methods, we r not able to call here
		
		imp ii=new imp();
		ii.abs1();
	}

}


 