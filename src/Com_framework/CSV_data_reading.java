package Com_framework;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;

public class CSV_data_reading extends CSV_data_sending
{
	
	@Test(dataProvider = "datasend1")
	// @Parameters({"u"})
	public void dataread(String tcc, String u, String p) throws CsvValidationException, IOException
	{
		//data();
	//	while (u!=null && p!=null)
	//	{
		// if(tcc.equalsIgnoreCase("500") && tcc!=null)
		if(tcc.equalsIgnoreCase("500"))
		{
			
		System.out.println("testcas "+tcc);
		System.out.println("user name "+u);
		System.out.println("password "+p);
		//}
	}
	}
	
	@Parameters({"TC"})
	public CSV_data_reading(String testcase)
	{
		super(testcase);
	}

}
