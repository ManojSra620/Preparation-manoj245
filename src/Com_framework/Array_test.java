package Com_framework;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array_test {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(2);
		a.add(3);
		a.add(1, 5); // adding 5 in index 1. starts with index 0.
		System.out.println(a);
		a.add(2, 9);
		a.add(3);
		a.add(3);  // arraylist allow duplicate, u can remove data in arraylist unlike array
		
		
		System.out.println(a);
		
		
		int[] a1= {1,2,2};
		
		
		
		System.out.println("**************** "+a1);  // will not give o/p as 1,2,2
		

	}

}
