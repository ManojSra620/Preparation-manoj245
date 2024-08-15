package prep;


public class Prep_remove_spaces 
{

	public static void main(String[] args) 
	{
		String s="my name is";
		String[] ss=s.split(" ");
		for(int i=0;i<ss.length;i++)
		{
			System.out.print(ss[i]);
		}
		
		System.out.println(s.replaceAll(" ", ""));  // this also works
		
	}

}
