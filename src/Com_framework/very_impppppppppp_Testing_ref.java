package Com_framework;
public class very_impppppppppp_Testing_ref 
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
	}
	
	public static void main(String[] args) 
	{
		test t=new test();
		t.a();
		t.d();
		very_impppppppppp_Testing_ref ref=new very_impppppppppp_Testing_ref();
		ref.a(); //Testing_ref n=new test(); not working  //test tt=new Testing_ref(); not working
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
