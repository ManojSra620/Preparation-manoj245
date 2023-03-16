package Com_framework;

import org.testng.annotations.Test;

public class Data_Provider_Test extends Data_Sender_Test
{
	
	@Test(dataProvider = "datasender")
	public static void f1(String name, int age, float salary)
	{
		System.out.println("Fullname: "+name);
		System.out.println("Actual age: "+age);
		System.out.println("monthly salary: "+salary);
	}

}
