package Com_framework;

import org.openqa.selenium.WebElement;

class b // final class b means, u cant inherit class 'b'
{
	int i=10;
final void bm(int q)    
// final  public void bm() means,  u cant over ride bm ; but overload happened. 
//if u write final, we can still use it if we dont over ride. if u write bm of b as private u cant use any way
{
System.out.println("bm of b");
System.out.println(q);

}
}


public class Final_testing extends b
{
	public void bm(int a, int b)
	{
		
	System.out.println("bm of Final_testing");
	//return i=10;
	}
	
	public static void main(String[] args) 
	{
		Final_testing p=new Final_testing();
		b bb=new b();
	p.bm(2);
	p.bm(3);
	bb.bm(2);
	System.out.println(bb.i);
	System.out.println(bb.i++);  // final int i=10; wont allow operations on i as in line 30.
	
	}


}