package com.Accessmodifier;

import Com_framework.Access_Modifiers_Test1;
import Com_framework.Access_modifiers_Test4;

public class Access_Modifier2 extends Access_Modifiers_Test1
{
	public void puba2()
	{
		System.out.println("puba2");
	}
	
	public static void pubstb2()
	{
		System.out.println("pubstb2");
	}
	
	protected void protc2()
	{
		System.out.println("protc2");
	}
	
	void nomodd2()
	{
		System.out.println("nomodd2");
	}
	
	private void prive2()
	{
		System.out.println("prive2");
	}
	
	public static void main(String[] args) 
	{
		Access_Modifiers_Test1 am=new Access_Modifiers_Test1();
		am.pubstb1();
		am.puba1();
		// u dont get aa.protc1 here.
Access_Modifiers_Test1 m=new Access_Modifier2();//none of the methods of Access_Modifiers_Test1 can be called except public methods in Access_Modifiers_Test1

	
		
		
		Access_Modifier2 aa=new Access_Modifier2();
		aa.protc1(); // u l get protected only when u extend. use only child reference to get protc1 method. default access modifiers  u dont get in other package
		aa.puba1();
		aa.pubstb1();
		
		
		
		
		
		
	}

}
