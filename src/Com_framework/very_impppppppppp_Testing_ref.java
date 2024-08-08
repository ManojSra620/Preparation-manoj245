package Com_framework;
public class very_impppppppppp_Testing_ref extends test
{	
	public void a()
	{
		System.out.println("a in ref test");
	}
	
	public void b()
	{
		System.out.println("b in ref test");
	}
	public void c()
	{
		System.out.println("c in ref test");
		super.a();
		// test.super(); wrong syntax. test.super.a(); is also wrong syntax... but for interface we can fo like interfaceAname.super.a(); interfaceB.super.a(); this differentiates method a in two interfaces interfaceA, interfaceB. 
		// super. will give a,d,e methods. in static methods we cant use super, this
		//this. will give a b c d e methods
	}
	
	public static void main(String[] args) 
	{
		test t=new test();
		
		
		t.d();
		
		very_impppppppppp_Testing_ref ref=new very_impppppppppp_Testing_ref();
		System.out.println("ref object i,e very_impppp");
		
		
		ref.a(); // a in ref test test i,e child class overridden is printed  //Testing_ref n=new test(); not working  //test tt=new Testing_ref(); not working
		ref.c();
		
		
		test r= new very_impppppppppp_Testing_ref();
		System.out.println("r ref started");
		r.a(); // o/p: a in ref test
		r.d();  // o/p:  d in test
		
		
// r. will give a,d,e for "test" class. but as 'a' is over ridden r.a() will give overridden o/p i,e. a in ref test. r. will nt give b,c methods f very_impppppppppp_Testing_ref
		
		
		
	}
}

class test
{
	public void a()
	{
		System.out.println("a in test");
	}
	
	public void d()
	{
		System.out.println("d in test");
	}
	
	public void e()
	{
		System.out.println("e in test");
	}
}
