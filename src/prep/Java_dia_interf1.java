package prep;

public interface Java_dia_interf1
{
	// by default methods in interface are public abstract
	// by default variables in interface are static, final.
	
	int i1=0;
	String i2=null;
	
	
	public void intr1_1();
	
	static void intr1_2()
	{
		System.out.println("static intr1_2 in interface 1");
	}
	
	default void intr1_3()
	{
		System.out.println("default non static body intr1_3");
	}
	
	
	default void intr1_4()
	{
		System.out.println("default non static body intr1_4 in interface 1");
	}
	
	
	
	
	

}
