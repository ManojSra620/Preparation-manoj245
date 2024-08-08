package Com_framework;

import org.testng.annotations.Test;

class a
{
  public void aa()
  {
	  System.out.println("aa in class a");
  }
  
  public static void bb()
			  
  {
	  System.out.println("bb in class a");
	  
  }
  
  public static void cc()
  
  {
	  System.out.println("cc in class a");
	  
  }
}


@Test
public class Inheritance_Test extends a{

	public static void main(String[] args) 
	{
		Inheritance_Test i=new Inheritance_Test();
		a ii=new Inheritance_Test();  // ii. will give methods of a(left side - parent), but if overridden, then over riddenmethods will be shown
		
		a iii=new a();
		
		ii.aa();
		ii.bb();
		
		// Inheritance_Test iii=new a(); invalid
		
		// bb();  // calling static in static directly. we cant call non static w/o ref in static 
		// i.aa();
		// i.bb();
		// i.in();
		

	}
	@Test
	 void in()
	 {
		 System.out.println("in");
		 in2();  // calling static and non static methods directly in NON STATIC methods 
		 aa();
		 bb();
		 super.aa();  // parent class method. i,e method aa ( "aa in class a") in parent class a
		 this.aa();
		 
	 }
	
	 public static void bb()  // static methods cant be overridden
	  
	  {
		  System.out.println("bb in class inherit");
		  
	  }
	 
	  public void aa()
	  {
		  System.out.println("aa in class inheri");
	  }
	 
	 void in2()
	 {
		 System.out.println("in2");
	 }

}
