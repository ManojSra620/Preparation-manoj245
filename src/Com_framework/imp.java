package Com_framework;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract class ii
{
	int ab1=1;
	static int ab3;
	static int ab2=5;
	abstract void abs1();
	public void abs3()
	{
	System.out.println("abstract abs3"); // if u want to declare body, it can be static or non static methods. 
	}
	
	public static void abs2()
	{
		System.out.println(" abstract's abs2");
	}
	
	public void abs4()
	{
		System.out.println("abstract abs4");
	}
	
	public void absint1()
	{
		System.out.println("abstract absint1");
		
		
	}
	 
		
	}

 interface  imp_interface   // **************** By default every method in interface is public abstract ************
{
	 int in1=2;
	 //int i; we have to initialize
	 static int in2=3;
	 String in3=null;
	abstract void int1();  //  body is not allowed for abstract methods
	   public void int2();
	 
	   
//if u want to define body, u must use static methods. u can make public, normal with non  static w/o body. if private n non static is used, it should have body
	 public static  void int3()  
	 // public private normal (w/o any acces.modi.) static with body allowed. protected static/ non static is not allowed. defaul. only non static mthd can have body
	 {
		 System.out.println("int3");
	 }
	 
	 public default  void int4()
	 {
		 System.out.println("int4 in interface");
	 }
	
	default void int5()
	 {
		 System.out.println("int5 in interface");
	 }
	
	public static void absint1()
	{
		System.out.println("interface absint1");
	}
	// protected is not allowed.
	 //interface cannot have constructor unlike abstract
	 //  public static void b(); - if we want body, public static can allow body. normal public void methods wont allow body. 
	 //
// implemented method int3 can be used directly by using  imp_interface.int3(); reference is not required.
}

class imp extends ii implements imp_interface
{
public void abs1()
{
	System.out.println("imp class abs1");
}

public void abs3()
{
	System.out.println("abs3 in imp class");
	

}
public void int1()
{
	System.out.println("int1");
}
public void int2()
{
	System.out.println("int2");
}

public static  void int3()
{
	 System.out.println(" class lo int3");
}
// in interface if int3 is static, we can over ride static in imp. by a non static method int3. i,e static methods in interface can be over ridden in imp class 
 public  void int4()  // *********** in interface default public is declared. so we can override by using public void. for overriding int4, args should be same
{
	System.out.println("int4 in imp class");
	
}

public void int5()
{
	 System.out.println(" ");
}


public static void abs2()
{
	System.out.println("imp class abstract2");
}


public static void main(String[] args) 
{
	imp i=new imp();
	
	System.out.println("variables are: "+i.ab1+i.ab2+i.in1+i.in2);  // static, non static variables are allowed in interface n abstract
	i.abs3();
	i.abs1();
	i.abs2();  // prints imp class abs2 method (left side method impl. is printed). But in interface u cant print int3 though u define in this imp class
	i.int1();
	i.int3();  // class lo int3
	i.int2();
	ii.abs2(); // ************directly getting static method of abstract************
	i.absint1();  // abstract method o/p shown: abstract absint1
	

	
	
	imp_interface.int3();
	
	
	
	
	
	
    // imp_interface. will give implemented/ assigned variables in1, in2,in3, methods int3(). 
	//int 1,2 is implemented in other class n int4, int5 are non static. so wont show int1 4 5
	// showing absint1 when entered imp_interface.

	
	System.out.println("interface variables are: "+imp_interface.in1);
	System.out.println("interface variables are: "+imp_interface.in2);
	System.out.println("abstract class variable "+ii.ab2);    // ii.ab1 wont come since we r calling non static in static main method.
	
	imp_interface imp=new imp();
	  
	
	
	imp.int4();  // o/p: int4 in imp class
	imp.int5();  // o/p: int5 in imp class
	// only imp_interface methods but defined body (int1, int2) in imp(); so int1, int2 only will populate here for "imp." int3 wont show.
	// if u want to access int3, absint1 then use imp_interface.
	//imp impl=new imp_interface(); wont work. cant create reference to interface.
	ii ih=new imp();
	//imp im=new ii(); wont work
	// ii in=new ii(); 
	
	
	//ih.ab1, ih.ab2 both variables l come
	ih.abs2(); // **********IMP**********   prints  the left hand side (ii) method implementation that is "abstract's abs2", since not over ridden (static class)
	//ii n=new ii(); wont work
	ih.abs4();  // prints abstract method implementation though not in imp
	// ih. will show absint1 of abstract class
	ih.abs1();
	ih.abs3();  // prints abs3 in imp class as int3 is overridden. if not over ridden it could have printed ii's abs3 i,e. "abstract abs3"

	WebDriver d=new ChromeDriver();
	
	
}
}
 
class imp2  implements imp_interface
{
public void int1()
{
	System.out.println("imp2-int1");
}
public void int2()
{
	System.out.println("imp2-int2");
}
public static void main(String[] args) 
{
	imp_interface i2=new imp2();
	i2.int1();
	i2.int2();
	
	
}
}


class imp3 extends ii
{
	public void abs1()
	{
		System.out.println("imp3-abs1");
	}
	

	public static void main(String[] args) 
	{
		ii i3=new imp3();
		i3.abs1();
		
	}	


}





 
 
 