package Com_framework;

import org.testng.annotations.Test;

abstract class Question_Tcs_bank 
{
	 static String amount="INR";
	 private int rateofinterest;
	 
	 
	  
	 protected void reporate()
	 {
		 
	 }
	 
	 
	 
	 protected void reversereporate()
	 {
		 
	 }
	 
	 public void setter()
	 {
		this.rateofinterest=6; 
	 }
	 
	 
	 public int getter()
	 {
		return rateofinterest;
	 }
	
}



class cbn extends Question_Tcs_bank
{
	@Test
	public cbn()
	{

	cbn c=new cbn();
	System.out.println(c.getter());
	}
	
	
}

