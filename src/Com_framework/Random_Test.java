package Com_framework;

import java.util.Random;

public class Random_Test {

	public static void main(String[] args) 
	{
		
		int a[]=new int[6];
		Random r=new Random();
		int i=r.nextInt(9);
		//System.out.println(i);
		for(int j=0;j<5;j++)
		{
		a[j]=r.nextInt(6);	
		}
		
	for (int g:a)
	{
		System.out.println(g);
	}
	}

}
