package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_prep 
{

	public static void main(String[] args) 
	{
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=9;
		// System.out.println(a[0]);
		List<Integer>  li=Arrays.asList(1,2,3,4,5,6);
		
		int b[][]=new int[2][3];
		b[0][1]=56;
		b[1][2]=23;

for(int i=0;i<b.length;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(b[i][j]);
	}
}
		

	}

}
