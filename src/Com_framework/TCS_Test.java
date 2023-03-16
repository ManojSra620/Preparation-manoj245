package Com_framework;


abstract class vehicle1
{
	static String steeringwheel="leather";
	private int minspeed;
	public vehicle1()
	{
		this.minspeed=60;	
	}
	public void setter(int a)
	{
		minspeed=a;	
	}

	public int getter()
	{
		return minspeed;
	}

	protected void tyre(String tyresize)
	{
		System.out.println("vehicle tyre");
	}

	protected void body(String colour, String type)
	{

	}

}


public class TCS_Test extends vehicle1
{
	
	public  TCS_Test()
	{
		System.out.println("TCS_Test constructor");
	}
	
	
	public void dummy()
	{
		System.out.println("dummy");
	}
	
	
	public static void main(String[] args) 
	{
		vehicle1 t=new TCS_Test();   // tcs_test should have same methods/ variables, but must be implemented in vehicle
	//	TCS_Test tt=new vehicle();
		TCS_Test ttt=new TCS_Test();
	//	vehicle v=new vehicle();
		
		
		t.setter(70);
		System.out.println(t.getter());
	}

}


class Bus1 extends vehicle1
{
	public static void main(String[] args) 
	{
	Bus1 b=new Bus1();
	vehicle1 vv=new Bus1();
	vv.tyre(steeringwheel);  // this wont execute as method is over ridden. if not ovwe ridden it l execute vehicle tyre method.
	b.setter(80);
	System.out.println(b.getter());
	//b.tyre("abc");
	b.body("white", "bar");
	
	}
	
	public void tyre(String tyresize)
	{
    System.out.println("Bus tyre "+tyresize);
	}

	public void body(String colour, String type)
	{
		System.out.println("Bus body "+colour+type);
	}
	

}




