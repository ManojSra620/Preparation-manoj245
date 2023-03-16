package Com_framework;

public class Pre_Post_Incre {

	public static void main(String[] args) 
	{
	int i=2;
	/*
	System.out.println(i++);
	System.out.println(i++);
	System.out.println(i++);
	*/
	System.out.println(++i);//3
	System.out.println(++i);//4
	System.out.println(i);//4
	System.out.println(i++);//4
	System.out.println(i);//5
	
	System.out.println(i++);//5
	System.out.println(i);//6
	System.out.println(++i);//7
	System.out.println(i);//7
	System.out.println(++i);//8
	}

}
