package prep;


public class arrays_prep_transpose
{

	public static void main(String[] args) 
	{
		
		String[] a= {"abc","bcd"};
		// System.out.println(a[0]);
		
		String b[]=new String[6];
		b[0]="mnk";
		b[1]="jfh";
		
		
		
		String[] ad=new String[5];
		ad[0]="234";
		ad[1]="rt";
	//	System.out.println(ad[1]);
		
	//	System.out.println(ad.length);
		
		String[][] str = {{"1,2,3"},{"4,5,6"}}; 
		// System.out.println(str.length);
		// str[1][2]="sdf";
		// System.out.println(str[1][0]);
		
		for(int j=0;j<1;j++)
		{
			for(int i=0;i<str.length;i++)
			{
				// System.out.print(str[j][i]+" ");
			}
		}
		
		int s[][]= {{1,2,3},{4,5,6}};
		// System.out.println(s.length);
		for (int j=0;j<3;j++)
		{
			
			for(int i=0;i<s.length;i++)
			{
				System.out.print(s[i][j]+" ");    // transpose
			}
			System.out.println();
			
		}
		// System.out.println(i[1][2]);
		
		
	}

}
