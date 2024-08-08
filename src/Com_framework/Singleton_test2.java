package Com_framework;

public class Singleton_test2 
{
	public static void main(String[] args) 
	{
		b c=b.m();  // creating object for b , by returning(  b.m()  ) an object
		System.out.println("hi "+c);
	//	b=n=new b(); cant  create. 
	
		

		
	}

}

class b
{
	static b b1=new b();
	
	public static b m()
	{
		return b1;
	}
	
	private b()  // creating a pvt constructor. because i should not allow b k=new b(); 
//when u r trying to create an object like this, it l call a constructor which is "private". 
	//if constructor is public then u can create an object
	{
			
	
	}
	
	
	
	
	
	
	
}
