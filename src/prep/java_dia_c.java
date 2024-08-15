package prep;

import org.testng.annotations.Test;

public class java_dia_c extends java_dia_b implements Java_dia_interf1, Java_dia_interf2
{
	public void c1()
	{
		System.out.println("c1 in c class");
	}
	
	static void b1()
	{
		System.out.println("b1 in c class");
	}
	
	void b2()
	{
		System.out.println("b2 in c class");
	}
	
	public static void main(String[] args) 
	{
		java_dia_c c=new java_dia_c();
	//	c.b1();
	//	c.c1();
	//	c.b3();
		
		System.out.println(i1);
		
		c.intr2_1();
		
		c.intr1_1();
		
		c.intr1_3();
		
		Java_dia_interf1.intr1_2();
		
		Java_dia_interf2.intr1_2();
		
		
		
	}

	@Override
	public void intr2_1() {
		// TODO Auto-generated method stub
		System.out.println("inter2_1 in class c");
	}

	@Override
	public void intr1_1() {
		// TODO Auto-generated method stub
		System.out.println("intr1_1 impl in class c");
	}
	
	@Test
	@Override
	public void intr1_4() 
	{
		// java_dia_b.super.ab();  it wont take like this unlike interface below. with interface u can use like interface.super.method. 
		// but here with single child we cant differentiate two diff parent class methods(ab here) like java_dia_c.super.ab
		Java_dia_interf1.super.intr1_4();
		Java_dia_interf2.super.intr1_4();
		super.b1();
	}
	

}
