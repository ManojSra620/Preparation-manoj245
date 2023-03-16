package Com_framework;

class TCS_Test_Lion 
{
	public void eat()
	{
		
		System.out.println("animal eat");
	}
	
	public TCS_Test_Lion()
	{
		
		System.out.println("TCS_Test_Lion constructor");
	}

}


class Lion extends TCS_Test_Lion 
{
	 public void eat()
	{
		System.out.println("lion eat");
	}
	 
	 public Lion()
	 {
		 super(); // its ok if it is declared here. dont declare  below syso statement. it l give error
		 System.out.println("Lion constructor");
		// super(); dont declare here
	 }

	public static void main(String[] args) 
	{
		//super();
		Lion l=new Lion();
		l.eat();  // lion eat
		
		
		TCS_Test_Lion s=new TCS_Test_Lion();
		s.eat();  // animal eat
		
	//	lion ll=new TCS_Test_Lion();  // not working
		
	//TCS_Test_Lion li=new Lion();  // working
		
System.out.println("main");
	}

}


