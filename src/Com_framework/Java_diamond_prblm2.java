package Com_framework;

import org.testng.annotations.Test;

class Java_diamond_prblm2 
{
	public void a()
	{
		System.out.println("a in diamond");
	}
	
	public void b()
	{
		System.out.println("b in diamond");
	}
	
	public void c()
	{
		System.out.println("c in diamond");
	}

}


class classa
{
	public void a()
	{
		System.out.println("a in classa");
	}
	
	public void b()
	{
		System.out.println("b in classa");
	}
	
	public static void d()
	{
		System.out.println("d static in classa");
	}
}


 class m extends classa
{
	@Test
	public void e()
	{
		System.out.println("e in class m");
		
		super.a();
		super.b();
		super.d();
	}
	/*
	public static void main(String[] args) 
	{
		m m=new m();
		m.d();
		//m.super.b(); not allowed
		
		
		
	}
	
	*/
}
