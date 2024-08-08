package Com_framework;

public class Access_Modifiers_Test1 
{
	public void puba1()
	{
		System.out.println("puba1");
	}
	
	public static void pubstb1()
	{
		System.out.println("pubstb1");
	}
	
	protected void protc1()
	{
		System.out.println("protc1");
	}
	
	void nomodd1()
	{
		System.out.println("nomodd1");
	}
	
	private void prive1()
	{
		System.out.println("prive1");
	}

}
 
class abc
{
	public static void mm()
	{
		Access_Modifiers_Test1 v=new Access_Modifiers_Test1();
		// v. will not give private methods
	}
	 
}
