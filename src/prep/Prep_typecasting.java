package prep;



import org.openqa.selenium.TakesScreenshot;

public class Prep_typecasting 
{

	public static void main(String[] args) 
	{
		int i=5;
		String g="man";
		double d=i;
		float f=i;
		System.out.println("double: int to double-widening-implicit:: "+d);
		System.out.println("float: int to float-widening-implicit:: "+f);
		
		double dd=5.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000;
		int ii;
		ii=(int)dd;
		
		System.out.println("int: double to int-narrowing-explicit:: "+ii);
		
		
		

	}

}
