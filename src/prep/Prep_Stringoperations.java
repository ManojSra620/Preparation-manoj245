package prep;


public class Prep_Stringoperations 
{
static String dd="";
static int o=2;
	public static void main(String[] args) 
	{
		String s="manojsravanidevee";
		// no of characters
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=new StringBuffer("");
		char c='i';
		int i=0;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)==c)
			{
				i++;
			}
		}
			
		System.out.println("total no of char "+c+" is: "+i);
		
		System.out.println("Hi, static value is: "+dd);
		
		// remove given character and print rest of the string
		
		for(int j=0;j<s.length();j++)
		{
			if(!(s.charAt(j)==c))
			{
				
				sb1=sb1.append(s.charAt(j));
			}
		}
		System.out.println("after removing char "+c+" is "+sb1);

	}

}
