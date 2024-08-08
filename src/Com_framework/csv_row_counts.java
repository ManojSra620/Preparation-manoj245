package Com_framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class csv_row_counts 
{
	public static int csvrows1() throws CsvValidationException, IOException
	{
		CSVReader rd=new CSVReader(new FileReader("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\csvfile.csv"));
		int count=0;
		while((rd.readNext())!=null)
		{
			count++;
		
		}
		return count;
		
	}
	
	public static void main(String[] args) throws CsvValidationException, IOException 
	{
		System.out.println(csvrows1());
		System.out.println(actualrow());
		
	}
	
	@Test
	public static int actualrow() throws CsvValidationException, IOException
	{
		CSVReader rd=new CSVReader(new FileReader("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\csvfile.csv"));
		rd.readNext();
		int rcount = 0;
		for(int i=1;i<csvrows1();i++)
		{
			String[] s=rd.readNext();
			if(s[0].equalsIgnoreCase("500"))
			{
				rcount++;
			}
		}
		return rcount;
	}

}
