package Com_framework;

public class overloading_test 
{

	public static void main(String[] args) 
	{
System.out.println("String array");
main(2);

	}
	
	
	public static void main(int args) 
	{
		System.out.println("int string ");


	}
	
	
	
	public void test(String s)
	{
		System.out.println("test string arg");
		//overloading_test.
	}
	
	public static int test(int i)
	{
		System.out.println("test int arg");
		return i;
	}

}
