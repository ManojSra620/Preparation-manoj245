package prep;


public class preparation_palendrome
{

	public static void main(String[] args) 
	{
		String s="oyofgi";
		StringBuffer op=new StringBuffer();
		
		
		for (int i=(s.length())-1;i>=0;i--)
		{
			Character c=s.charAt(i);
			String ss= c.toString();
			op.append(ss);
			
		}
		
		System.out.println(op);
		String opp=op.toString();
		if (opp.equalsIgnoreCase(s)) 
		{
			System.out.println("palendrome");
		}
		
		else
		{
			System.out.println("not palendrome");
		}

	}

}
