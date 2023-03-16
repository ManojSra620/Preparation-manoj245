package Com_framework;

class Ref_Test2 
{
	public void a()
	{
		System.out.println("a in ref test2");
	}
	
	public void b()
	{
		System.out.println("b in ref test2");
	}
	
	public void c()
	{
		System.out.println("c in ref test2");
	}

}

class Ref_Test1 extends Ref_Test2 
{
	public void a()
	{
		System.out.println("a in ref test1");
	}
	
	public void d()
	{
		System.out.println("d in ref test1");
	}
	
	public void e()
	{
		System.out.println("e in ref test1");
	}
	 public static void main(String[] args) 
	{
		 Ref_Test1 z=new Ref_Test1();
		 z.a();  // a in ref test1
		 z.b(); // b in ref test2
		 
		// Ref_Test1 y=new Ref_Test2();
		 Ref_Test2 x=new Ref_Test1(); 
		// Ref_Test1 v=new Ref_Test2(); wont work
// here Ref_Test1 methods a d e wont come. "x." means all in Ref_Test2 (a b c). but if they r impl in Ref_Test1 it l give that impl (a) or else it l give Ref_Test2 impl
		 x.a();  // a in ref test1
		 x.b();   // b in ref test2
		 
		 
		 
		 
		
	}
	
	
	

}
