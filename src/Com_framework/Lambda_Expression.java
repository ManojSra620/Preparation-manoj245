package Com_framework;

interface i
{
	void fn();
}

public class Lambda_Expression 
{
/*
	public static void main(String[] args) 
	{
		i ii=() ->	// lambda expression
	{
	
		System.out.println("fn");
			
			
	};
	ii.fn();
		
	}
*/
	public static void main(String[] args) 
	{
		i ii=new i() 
	{
		public void fn()
		{
		System.out.println("fn");
		}
			
			
	};
	ii.fn();
		
	}


}


/*

*/