package Com_framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSV_data_sending 
{
	static String test;
	public static int csvrows() throws CsvValidationException, IOException
	{
		CSVReader rd=new CSVReader(new FileReader("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\csvfile.csv"));
		int count=0;
	// rd.readNext();
	 Iterator<String[]> ss=rd.iterator();
	 
		
	 while((ss.next())!=null);
		{
			String[] s=rd.readNext();
			while(s[0].equalsIgnoreCase(test))
			{
		
		//while((rd.readNext()).toString().equalsIgnoreCase(test))
		System.out.println("***********"+s[0]);
		System.out.println("*****xml para******"+test);
		
			count++;
			s=rd.readNext();
			}
		}
		
		return count;
	}
	
	public CSV_data_sending(String test1)
	{
		this.test=test1;
	}
	
	
	 @DataProvider(name="datasend1")
	public  Object[][] data() throws CsvValidationException, IOException
	{
		CSVReader rd=new CSVReader(new FileReader("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\csvfile.csv"));
		String data[];
		int k=0;
		
		data=rd.readNext();
		Object[][] a=new Object[csvrows()][data.length]; // actualcsvrows
		
		
		System.out.println("row count ****"+csvrows());
			for(int i=0;i<(csvrows()-1);i++) 
			{
				data=rd.readNext();
				for( int j=0;j<1;j++) 
				{
					// System.out.println("***********"+a[i][0].toString().equalsIgnoreCase(test));
					if(data[0].equalsIgnoreCase(test))  // to string is not needed
						
				{
				
				a[k][j]=data[j];      
				a[k][j+1]=data[j+1];
				a[k][j+2]=data[j+2];
				
				   //	System.out.print(data[i]+"                ");
				System.out.println(a[k][j]+"  "+a[k][j+1]+" "+a[k][j+2]);
				k++;
				}
				}
			
			}
			return a;
			
		
			
			
		
	}
	 
	 
	 
	 
	 
	 
	 

}
