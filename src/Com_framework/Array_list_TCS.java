package Com_framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.beust.jcommander.FuzzyMap;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class Array_list_TCS 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("English");
		s.add("Maths");
		s.add("History");
		s.add("Geography");
		s.add("Hindi");
		s.add("Science");
		
		System.out.println(s.subList(2, 5));
		if (s.contains("His"))
		{
			System.out.println("element is available");
		}
		else
		{
			System.out.println("element is not available");
		}
		//Collections.sort(s);
		//System.out.println(s);
		//System.out.println("List after the use of" +
       //         " Collection.sort() :\n" + s);
		String m;
		System.out.println("Choose from the list: Index, Object, RemoveAll, RemoveIf, Clear" );
		BufferedReader Z = new BufferedReader(new InputStreamReader(System.in)); 
		m= Z.readLine();
		switch (m)
		{ 
			case "Index": 
				Scanner A = new Scanner(System.in); 
				int i;
				System.out.println("Enter index no.");
				i=A.nextInt();
							s.remove(i);
				System.out.println(s);
			break;
			
			case "Object": 
				BufferedReader r = new BufferedReader(new InputStreamReader(System.in)); 
				String k;
				System.out.println("Enter String");
				k=r.readLine();
				
				s.remove(k);
				System.out.println(s);
			break; 
		
			case "RemoveAll": 
				
				
				s.removeAll(s);
				System.out.println(s);
			break; 
			
            case "RemoveIf": 
				
				
				s.removeIf(n -> (n.charAt(0)=='H'));
				System.out.println(s);
			break; 
			
            case "Clear": 
            	
            	s.clear();
            	System.out.println(s);
				
				
			break; 
			
			
			
			
			default: System.out.println("Invalid Entry!"); 
		} 
		
		int a[]= {1,2,3,4,5};
		Arrays.sort(a);
		System.out.println(a);
		System.out.println(a[a.length-1]);
		
	}

}
