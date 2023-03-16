package Com_framework;


abstract class ship
{
	private static String paintcolour="Yellow";
	private int maxspeed;
	 public ship(int maxspeed)
	 {
		 this.maxspeed=maxspeed;
	 }
	 
	 public void setter(int maxspeed)
	 {
		 this.maxspeed=maxspeed;
	 }
	
	public int getter()
	{
		return maxspeed;
	}
	
	public String ptclr()
	{
		return paintcolour;
	}
	
}

class Submarine extends ship
{

	private int maxdepth;
	boolean is_submerged;
	public Submarine(int maxspeed) 
	{
		super(30);
		this.maxdepth=15000;
	}
	
	public Submarine(int maxspeed, int maxdepth) 
	{
		super(maxspeed);
		this.maxdepth=maxdepth;
		System.out.println("maxspeed is "+maxspeed);
		System.out.println("max depth is "+maxdepth);
		//super(maxdepth);
		
	}
	
	void dive()
	{
		is_submerged=true;
		System.out.println("submarine is now maxdepth");
	}
	
	
	void resurface()
	{
		is_submerged=false;
		System.out.println("submarine is now on surface");
	}
	
}



class Captain
{

	public static void main(String[] args) 
	{
		 Submarine s=new Submarine(40,20000);
		 s.dive();
		 s.resurface();
		System.out.println( s.ptclr());
		 
		
		
	}
	
	
	
	
	
	
}



















