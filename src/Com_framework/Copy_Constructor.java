package Com_framework;

import java.util.Date;

public class Copy_Constructor 
{
//	Date d=10/07/2022;
	int b;
	public void cns()
	{
		Copy_Constructor cc=new Copy_Constructor(3);
		System.out.println("CNS");
		
	}
	
	Copy_Constructor(int a)  // constructor cant be static   
	{
		System.out.println("para cons"+a);
		this.b=a;
		int k=b;
	}
	
	public static void main(String[] args) 
	{
		Copy_Constructor c1=new Copy_Constructor(6);
		
		Copy_Constructor c2=new Copy_Constructor(c1);
		
		Copy_Constructor c3=new Copy_Constructor();
		
		// r.sagar@wipro.com
	}
	
	Copy_Constructor (Copy_Constructor c)
	{
		int g=c.b;  // if int g=b is used, line 38 will print g value as 0. this.b will give 0.
		c.cns();
		System.out.println("copy cons    ---"+g);
	//	System.out.println("k value  ---"+c.k); c.k wont work
		
		
	}
	
	Copy_Constructor ()
	{
		int g=this.b;
		cns();// this.cns also works
		System.out.println("simple constructor "+g);
		// prints simple constructor0.  this.b can not be used to refer global variable b. so c.b is used and so the copy constructor

		
	}
	

}
