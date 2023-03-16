package Com_framework;

class OverRide_Test 
{
	public static  void a()  // private and static methods cant be over ridden
	{
		System.out.println("OverRide_Test");
	}
	
	public void b()
	{
		
	}
	
	

}

class testing_override extends OverRide_Test
{

	public static void a()
	{
		System.out.println("testing_o");
	}
	
	public static void main(String[] args) 
	{
		testing_override o=new testing_override();
		o.a();
		testing_override.a();
		OverRide_Test ot=new testing_override();
		ot.a();
		
		
	}
}
