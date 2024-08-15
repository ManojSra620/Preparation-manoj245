package prep;

import org.testng.annotations.Test;

@Test
public class prep_transpose_matrix
{
	public void transpose()
	{
		int[][] h=new int[3][2];
		h[0][0]=12;
		h[0][1]=112;
		h[1][0]=2;
		h[1][1]=4;
		h[2][0]=55;
		h[2][1]=98;
		
		for (int i = 0; i < h[0].length; i++)
		{
			for(int j = 0; j < h.length; j++)
			{
				
				System.out.print(h[j][i]+" ");
				
			}
			System.out.println();
			
		}
		
		
		String[][] h1= {{"qw","we","rt"},{"zx","df","nh"},{"mn","yt","po"},{"df","yh","hj"}};
		System.out.println(h1[3][0]);
		
		
		
		
		
	}
	

}
