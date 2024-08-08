package Com_framework;

import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;

public class CSV_data_reading2 extends CSV_data_sending2
{
	
	@Test(dataProvider = "datasend2")
	public void dataread(String u, String p) throws CsvValidationException, IOException
	{
		
		String [] d=new String[5];
		String a[];
		//data();
	//	while (u!=null && p!=null)
	//	{
			
		
		System.out.println("user name "+u);
		System.out.println("password "+encrypt_decrypt.decryptstring(p));
		//}
	}

}
