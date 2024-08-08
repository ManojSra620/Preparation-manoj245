package prep;

import java.util.Collections;

import org.testng.annotations.Test;

public class altimetrik_com_test 
{
	@Test
	public void a()
	{
	int a[]={1,0,1,0,1,0,1,0,1,0,1,0,1,0};
	System.out.println();
	int j=0;
	int k=0;
	int b[]=new int[a.length];
	Collections c;
	
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==1)
		{
			
			
					b[j]=a[i];
					System.out.print(b[j]);
					j++;
					
		}
		
		
		
	}
	
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]==0)
		{
			
			
					b[j]=a[i];
					System.out.print(b[j]);
					j++;
					
		}
		 
		
	}
	
	System.out.println();
	
	
	}

}
