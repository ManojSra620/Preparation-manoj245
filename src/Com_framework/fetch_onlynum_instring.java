package Com_framework;

public class fetch_onlynum_instring 
{

	public static void main(String[] args) 
	{
		String s="dam1234567890ap2i95ndia1";
		StringBuffer sbb=new StringBuffer(s);
		
		for(int i=0;i<s.length();i++)
		{
			Character c=s.charAt(i);
			//System.out.println(c);
			
int a=c.hashCode();
if(a>=48 && a<=57)
{
	System.out.println(c);
}

		}
		
	}

}
