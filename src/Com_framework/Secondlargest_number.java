package Com_framework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Secondlargest_number {

	public static void main(String[] args) 
	{
		int a[]= {1,3,45,78,78,9};
		int len=a.length;
		Arrays.sort(a);
		
		
		for(int i=len-2;i>=0;i--)
		{
		if(a[i]!=a[len-1])
		{
			System.out.println("second largest element is: "+a[i]);
			return;
		//	break; break is also working
		}
		}
		//System.out.println(a[len-2]);
		
		

	}

}
