package Com_framework;

import org.testng.annotations.Test;

public class Constructor_inherit_2 extends Constructor_inherit_1
{
//when u write extends by default parent constructor is inherited and when u execute it gets executed, even if u dont write super or dont even declare constructor
	@Test
	
	private Constructor_inherit_2()
	{
		super(2);
		System.out.println("Constructor_inherit_2");
	}
	
	
	
	@Test
	public void cc1()
	{
		System.out.println("cc2");
		Constructor_inherit_2 c2=new Constructor_inherit_2();
		
	}

}
