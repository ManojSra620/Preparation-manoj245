package prep;


public class Prep_reverseanint 
{

	public static void main(String[] args) 
	{
		int i=123;
		
		int j=0;
		while(i>0)
		{
		 j=i%10;   // 3
		
		
		
		i=i/10;  // 12
		int k=i%10; // 2
		j=j*10+k;
		

	}
		System.out.println(j);

}
}
