package Com_framework;

public class String_operations 
{
	public static void main(String[] args) 
	{
		String s="Manoj";
		String m="kk";
		//s==m;
		
		StringBuffer sb=new StringBuffer(s);
		sb.append(" Kumar");
		sb.charAt(5);
		sb.substring(0, 7);
		System.out.println(sb);
		System.out.println(sb.substring(0, 7));
		System.out.println(sb.charAt(0));
		//sb.replace(0, 0, s)
		String st="100";  // cant give float value here
		Integer a= Integer.parseInt(st); // string to int
		System.out.println(a);
		int i=20;
		String s1=String.valueOf(i);  //integer to string
		System.out.println(s1);
		StringBuffer sbb=new StringBuffer(s1);
		sbb.append(22);
		System.out.println(sbb);
		
	
	}

}
