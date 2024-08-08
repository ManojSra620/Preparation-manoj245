package Com_framework;

class A1A
{
	public void a()
	{
		System.out.println("a");
	}
	
	public void man()
	{
		System.out.println("man");
	}
}


 class B1B extends A1A
{
	public void b()
	{
		System.out.println("b");
	}
	
	public void a()
	{
		System.out.println("a1 in class B");
	}
		
}


public class upcasting_test 
{

	public static void main(String[] args) 
	{
		A1A a=new A1A();
	    A1A n=new B1B();  // upcasting is done here automatically. A n= (A)new B(); is actual 
	    B1B b=new B1B();
	    
	    n.a();
	    
	    
	    // n.   will give only a, man of class AA but o/p of class BB, as a is over loaded. o/p og n.a(): a1 in class B
	    
	    
	    System.out.println("upcasting: done"); 
	    
	  // down casting
	    B1B nm= (B1B)n;   // down casting
	  //  nm.a1();
	   // nm.  will give BB related methods
	    nm.a();
	    
	    
	    
	    
	    
	
	}

}
