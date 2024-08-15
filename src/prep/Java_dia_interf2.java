package prep;

public interface Java_dia_interf2 
{
	
	public void intr1_1();
	
	static void intr1_2()
	{
		System.out.println("static intr1_2 in interface 2");
	}
	
	 default void intr2_1()
	{
		System.out.println("interface inter2_1");
	}
	 
	 default void intr1_4()
		{
			System.out.println("default non static body intr1_4 in interface 2");
		}

}
