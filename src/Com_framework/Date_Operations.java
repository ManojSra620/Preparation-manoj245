package Com_framework;

import java.time.LocalDateTime;
import java.util.Date;

public class Date_Operations 
{

	public static void main(String[] args) 
	{
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		String s=ldt.toString();
		System.out.println(s);  // 2023-10-19T13:53:18.132761100
	String ss=	s.replaceAll("T", "_").replaceAll(":", "").substring(0, 10);
	System.out.println(ss);
		
		Date d=new Date();
		
		long l=d.getTime();
		System.out.println(l);

		
		int y=d.getDay();
		//System.out.println(y);
	}

}
