package Com_framework;

import org.testng.annotations.Test;

interface int_a
{
	public default   void a()
	{
		System.out.println("a in int_a");
	}
	
	public static void b()
	{
		System.out.println("b in int_a");
	}
}

interface int_b
{
	public default  void a()
	{
		System.out.println("a in int_b");
	}
}
// running testng at class level runs all pgms in class
@Test
public class Java_diamond_problem implements int_a, int_b
{

	public void a1() 
	{
		// TODO Auto-generated method stub
		//int_a.super.a();
		System.out.println("Hai, its diamond problem");
		
		
		//int_a.a();  can be used when a() is static
		int_a.super.a();
		
		// int_a.a(); this will hold for static method "a" in interface.
		//int_a.super.b();
		int_a.b();  // super is not needed as b is static 
		int_b.super.a();
		
	}
	
	public void a()  // over riders inta.a() as int_a is immediately after implements key word.
	// if int_b is immediately after implements key word, then this method could over ride inta.b() 
	{
	System.out.println("void a");	
	}
	

}
