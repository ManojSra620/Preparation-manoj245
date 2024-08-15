package prep;


public class Prep_Palendrome 
{
	@p_annotation_1
	public static void main(String[] args) 
	{
		String s="wow";
		
		String r="";
		StringBuffer sb=new StringBuffer(r);
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			String d;
			
			sb.append(c);
			
		}
		r=sb.toString();
		if (r.equalsIgnoreCase(s)) 
		{
			System.out.println("Palemdrome");
			
		}
		else
		{
			System.out.println("not palendrome");
		}

	}

}
