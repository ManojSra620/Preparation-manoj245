package Com_framework;

public class Split_String 
{
	public static void main(String[] args) 
	{
		String S="Manoj in TCS";
		String[] D=S.split(" ");
		for (int i=2;i>=0;i--)
		{
			String sss=D[i];
			System.out.println(sss);	
		}
		
		System.out.println("sss");
		
	}

}
