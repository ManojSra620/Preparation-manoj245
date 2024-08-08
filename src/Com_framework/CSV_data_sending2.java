package Com_framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSV_data_sending2 
{
	public static int csvrows() throws CsvValidationException, IOException
	{
		CSVReader rd=new CSVReader(new FileReader("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\csvfile2.csv"));
		int count=0;
		while((rd.readNext())!=null)
		{
			count++;
		}
		return count;
	}
	
	
	 @DataProvider(name="datasend2")
	public  Object[][] data() throws CsvValidationException, IOException
	{
		CSVReader rd=new CSVReader(new FileReader("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\csvfile2.csv"));
		String data[];
		
		data=rd.readNext();
		Object[][] a=new Object[csvrows()-1][data.length]; 
		System.out.println("row count ****"+csvrows());
		
		
		
			for(int i=0;i<(csvrows()-1) && (data=rd.readNext())!= null;i++) 
			{
					
				for( int j=0;j<(data.length)-1;j++) 
				{
				
				a[i][j]=data[j];      
				a[i][j+1]=data[j+1];  
				
				   //	System.out.print(data[i]+"                ");
				System.out.println(a[i][j]+"  "+a[i][j+1]);
				}
			
			}
			return a;
			
		
			
			
		
	}

}
