package Com_framework;

interface Interface_Test 
{
	// by default methods in interface are public abstract. By default variables in interface are final, static.
	// abstract methods cant be static. b/c u have to extend n define abstract methods. if u extend its like over riding. if u make it static then u cant define.
	int i1=10,
	i=20;
	
	
	public void int1();
	
	void int2();
	
	public static void int3()
	{
		System.out.println("public static non abs int3");
	}
	
	   static void int4()
	{
		System.out.println("default non abs  int4");
	}
	

}

