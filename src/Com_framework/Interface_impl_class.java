package Com_framework;

public class Interface_impl_class implements Interface_Test {
	
	

		@Override
		public void int1() 
		{
			System.out.println("int 1 in class c");
			
		}

		@Override
		public void int2() 
		{
			System.out.println("int 2 in class c");
			
		}
		
		public void int4()
		{
			System.out.println("default non abs  int4 in class");
		}
		
		public static void main(String[] args)

		{
			//Interface_Test.
			
			Interface_impl_class c=new Interface_impl_class();
			c.int4();
		}
		
		
	

}
