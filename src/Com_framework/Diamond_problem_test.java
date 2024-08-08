package Com_framework;

abstract class aa
{
 public abstract void aa1();
 
 public abstract void ab1();
 
 public abstract void ab2();

}


abstract class bb
{
	public  void bb() {
	} 
	
	public abstract void bb1();
	
	public abstract void ab1();
	 
	public abstract void ab2();
}



interface inf1
{
	public void in1();
	
	public void in2();
}



interface inf2
{
	public void in1();
	
	public void in2();
}




public class Diamond_problem_test 
implements inf1, inf2
{

	@Override
	public void in1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void in2() {
		// TODO Auto-generated method stub
		
	}

	/*

	@Override
	public void ab1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ab2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bb1() {
		// TODO Auto-generated method stub
		
	}
	
*/
}
