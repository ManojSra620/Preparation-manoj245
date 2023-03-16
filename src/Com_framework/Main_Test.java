package Com_framework;

public class Main_Test 
{
	public static void main(String[] args) // String[] args should be there
	{
		System.out.println("main1");
	}
	
	

}

class testing_main // extends Main_Test
{
	void c()
	{
		testing_main t=new testing_main();  // we can extend and run main method
		t.main(null);
		
	}
	
	 public static void main(String[] chk ) // this kind of word chk is allowed, but string alone is not allowed. string[] is allowed. Int/int[] is not allowed.
	 {
		System.out.println("child main");
	}
	
}
