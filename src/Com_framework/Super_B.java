package Com_framework;// when const. is created super() is automatically available

abstract class Super_A
{

	public Super_A()
	{
		//super();
		System.out.println("A");
	}
	
	public Super_A(int a)
	{
		System.out.println(a+"int A");
	}
	
}

class Super_B extends Super_A
{

	public Super_B()
	{
		//super(9);  np even if u comment super. but default super_A() is also executed when object is created for super_B, super_B(2).
		System.out.println("B");
	}
	/*
	public Super_B(int b)
	{
		
		//super(3);
		System.out.println(b+"int B");
	}
	
	*/
	public static void main(String[] args) 
	{
		
		//Super_B b=new Super_B(2);  // if u want to create object then implement in child also?
		Super_B bb=new Super_B();		
	}
}
