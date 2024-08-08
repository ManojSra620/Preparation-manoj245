package Com_framework;


class bow
{
	final void run()
	{
		
		
		System.out.println("class b over ride");
	}
}



public class Final_testing2 extends bow
{
	 void run1()  // not allowed to over ride final method
	{
		System.out.println("run in final testing2");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
