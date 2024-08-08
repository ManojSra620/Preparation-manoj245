package prep;

import org.testng.annotations.Test;

public class Prep_Static_nonstatic extends Prep_Extent_Setup
{
	 int i;

	@Test
public static void static_non1() 
	{
	//ext.createTest("static_nonstatic_test");
		
		Prep_Static_nonstatic p=new Prep_Static_nonstatic();
		Prep_Static_nonstatic q=new Prep_Static_nonstatic();
		Prep_Static_nonstatic r=new Prep_Static_nonstatic();
		//int j=++p.i;
		
		//System.out.println(++p.i);   //o/p: 1, o/p is 1 when I is non-static
		//System.out.println(++q.i);	 // o/p: 2, o/p is 1 when I is non-static
		//System.out.println(++r.i);   // o/p: 3, o/p is 1 when I is non-static
		// value I is shared among all when static. 
		// So when I became 1 for ++p.i, it (1) is shared among other objects (q,r).  so second time when object is created and I incremented from 1 n became 2.	
	//	i=0;
		System.out.println(p.i); // o/p 0 when non st method, variable. Also when sta method, sta variable?
		++p.i;
		++p.i;
		System.out.println(p.i);  // o/p 2  when non st method, variable. Also when sta method, sta variable?  
	}
	
	@Test
	public  void static_non4() 
	{
	//ext.createTest("static_nonstatic_test");
		
		//Prep_Static_nonstatic p=new Prep_Static_nonstatic();
		//Prep_Static_nonstatic q=new Prep_Static_nonstatic();
		//Prep_Static_nonstatic r=new Prep_Static_nonstatic();
		//int j=++p.i;
		
		//System.out.println(++p.i);   //o/p: 1, o/p is 1 when I is non-static
		//System.out.println(++q.i);	 // o/p: 2, o/p is 1 when I is non-static
		//System.out.println(++r.i);   // o/p: 3, o/p is 1 when I is non-static
		// value I is shared among all when static. 
		// So when I became 1 for ++p.i, it (1) is shared among other objects (q,r).  so second time when object is created and I incremented from 1 n became 2.	
	//	i=0;
		System.out.println(i); // o/p 0 when non st method, variable. Also when sta method, sta variable?
		++i;
		++i;
		System.out.println(i);  // o/p 2  when non st method, variable. Also when sta method, sta variable?  
	}
	
	
	
	@Test
	public static void static_non2() 
		{
		//ext.createTest("static_nonstatic_test");
			
		Prep_Static_nonstatic p=new Prep_Static_nonstatic();
			Prep_Static_nonstatic q=new Prep_Static_nonstatic();
			Prep_Static_nonstatic r=new Prep_Static_nonstatic();
			//int j=++p.i;
			
			//System.out.println(++p.i);   //o/p: 1, o/p is 1 when I is non-static
			//System.out.println(++q.i);	 // o/p: 2, o/p is 1 when I is non-static
			//System.out.println(++r.i);   // o/p: 3, o/p is 1 when I is non-static
			// value I is shared among all when static. 
			// So when I became 1 for ++p.i, it (1) is shared among other objects (q,r).  so second time when object is created and I incremented from 1 n became 2.	
		//	i=0;
			System.out.println(p.i); // o/p 0 when non st method, variable. Also when sta method, sta variable?
			++p.i;
			++p.i;
			System.out.println(p.i);  // o/p 2  when non st method, variable. Also when sta method, sta variable?  
		}
		
	
	@Test
	public  void static_non3() 
		{
		//ext.createTest("static_nonstatic_test");
			
			Prep_Static_nonstatic p=new Prep_Static_nonstatic();
			Prep_Static_nonstatic q=new Prep_Static_nonstatic();
			Prep_Static_nonstatic r=new Prep_Static_nonstatic();
			//int j=++p.i;
			
			//System.out.println(++p.i);   //o/p: 1, o/p is 1 when I is non-static
			//System.out.println(++q.i);	 // o/p: 2, o/p is 1 when I is non-static
			//System.out.println(++r.i);   // o/p: 3, o/p is 1 when I is non-static
			// value I is shared among all when static. 
			// So when I became 1 for ++p.i, it (1) is shared among other objects (q,r).  so second time when object is created and I incremented from 1 n became 2.	
		//	i=0;
			System.out.println(i); // o/p 0 when non st method, variable. Also when sta method, sta variable?
			++i;
			++i;
			System.out.println(i);  // o/p 2  when non st method, variable. Also when sta method, sta variable?  
		}
	
	
	
	

}
