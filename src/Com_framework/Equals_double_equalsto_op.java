package Com_framework;

public class Equals_double_equalsto_op 
{

	public static void main(String[] args) 
	{
		String s1="test";
		String s2="test";
		String s3=new String("test");
		String s4=new String("test");
		//s1="head";
	//	String s3=new String("test1");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s4==s3);
		System.out.println(s3.equals(s4));
		

	}

}
