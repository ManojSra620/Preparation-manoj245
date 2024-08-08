package Com_framework;

public class copy_cons_test 
{
	
	int a=10;
	static char z='ç';
	int b;
	
	public void r1()   // cant use static method. because "this" is not allowed in static methods
	{
		System.out.println("r1 method "+this.z);
	}
	
	public copy_cons_test()
	{
		System.out.println("copy1");
	}
	
	public copy_cons_test(int m)
	{
		System.out.println("copy with parameters");
		b=m;
		System.out.println("int b value is: "+b);
		System.out.println(this.a);
		System.out.println(this.z);
	}
	
	public copy_cons_test(copy_cons_test c)
	{
		System.out.println("copy with constructor obj");
		int s=10+c.a;
		int k=22+this.a;
		System.out.println("value of k is : "+k);
		c.r1();
		System.out.println("copy cons value "+s);
		
	}
	
	public static void main(String args[]) 
	{
		copy_cons_test c1=new copy_cons_test();
		copy_cons_test c2=new copy_cons_test(2);
		c1.r1();
		copy_cons_test c3=new copy_cons_test(c1);// u can pass c2 which is also same object of class as c1. 
		
	}

}
