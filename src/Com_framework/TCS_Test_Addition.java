package Com_framework;

public class TCS_Test_Addition 
{
	public  void add (int a, int b)
	{
	int sum;
	sum=a+b;
	System.out.println(sum);
	}
	
	public  void add (int a, int b, int c)
	{
	int sumof3;
	sumof3=a+b+c;
	System.out.println("sum of three="+sumof3);
	}
	public static void main(String[] args) 
	{
		TCS_Test_Addition s=new TCS_Test_Addition();
		
		s.add(2, 3);
		s.add(2, 3, 4);
	}

}
