package Com_framework;

import org.testng.annotations.DataProvider;

public class Data_Sender_Test 
{
	
	
	
	@DataProvider (name="datasender")
	Object[][] data_sender_Method()
	{
		Object[][] i=new Object[3][3];
		i[0][0]="Manoj";
		i[0][1]=22;
		i[0][2]=96333.33f;
		
		
		return i;
	}

}
