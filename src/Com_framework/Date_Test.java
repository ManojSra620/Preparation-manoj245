package Com_framework;

import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class Date_Test 
{
	@Test
	public void date_test()   // when protected isused @Test dint work
	{
		//Date d=new Date();
		//int f=d.getDate();
		//System.out.println(f);
		int i=Calendar.DAY_OF_MONTH;
		System.out.println(Calendar.getInstance());
		System.out.println(i);
		System.out.println("************day of the month is: "+i);
		
		
		//Calendar cl=new 
		Date dd=new Date();
		int hrs=dd.getHours();
		int dy=dd.getDay();
	int dte=	dd.getDate();
		System.out.println(hrs+"*********"+dy+"//////////"+dte);
		
	}
	

}
