package prep;


public class Prep_getcharfromstring 
{

	public static void main(String[] args) 
	{
		String s="!weaareh@uman3";
		//System.out.println(s.matches("[a-zA-Z]"));
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));

	}

}
