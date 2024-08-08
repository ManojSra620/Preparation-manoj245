package Com_framework;

import org.openqa.selenium.WebElement;

class b1 // final class b means, u cant inherit class 'b'
{
	int i=10;
final void bm(int q)    
// final  public void bm() means,  u cant over ride bm ; but overload happened. 
//if u write final, we can still use it if we dont over ride. if u write bm of b as private u cant use any way
{
System.out.println("bm of b1");
System.out.println(q);

}
}



public class Final_testing extends b1
{
	public void bm(int a, int b)
	{
		
	System.out.println("bm of Final_testing");
	//return i=10;
	}
	
	final void bm()
	{
		
	}
	
	
	
	public static void main(String[] args) 
	{
		final int j;
		String s="i am indian";
		
		j=50;
		Final_testing p=new Final_testing();
		b1 bb=new b1();
	p.bm(2);
	p.bm(3);
	bb.bm(2);
	System.out.println(bb.i);
	System.out.println(bb.i++);  // final int i=10; wont allow operations on i as in line 30.
	System.out.println("******"+j);
	
	}


}