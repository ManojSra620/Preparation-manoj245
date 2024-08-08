package prep;


public class Prep_ClassB_diamond 
{

	public static void main(String[] args) 
	{
		Prep_ClassA_diamond a=new Prep_ClassA_diamond ();
		a.x();  // even without inheritance we can call methods by creating reference.
		
	}
	
	public void y()
	{
		System.out.println("y in B");
		
	}

}
