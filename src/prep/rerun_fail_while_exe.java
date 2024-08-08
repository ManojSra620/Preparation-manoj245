package prep;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

// @p_annotation_1   // not required actually
public class rerun_fail_while_exe 
{
	
	@p_annotation_1
	@Test
	public void f1()
	{
		System.out.println("f1");
		Assert.assertTrue(false);
		
	}
	
	
	@p_annotation_1
	@Test
	public void f2()
	{
		System.out.println("f2");
		Assert.assertTrue(false);
	}
	
	
	@p_annotation_1
	@Test
	public void f3()
	{
		System.out.println("f3");
		Assert.assertTrue(true);
	}
	
	@p_annotation_1
	@Test
	public void f4()
	{
		System.out.println("f4");
		Assert.assertTrue(false);
	}
	

}
