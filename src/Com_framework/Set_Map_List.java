package Com_framework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.collections.map.HashedMap;
import org.eclipse.jdt.internal.compiler.ast.CaseStatement;
import org.seleniumhq.jetty7.util.ArrayQueue;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

 class Set_Map_List // class need not be public for public main method
{

	public static void main(String[] args) 
	{
		String lig="Manojs";
		List<String> li=new ArrayList<>();
		li.add("Manojj");
		li.add("Sra");
		li.add(lig);
		
		for (int i = 0; i < li.size(); i++) 
		{
			
		
		System.out.println(li.get(i));
		//System.out.println(li.equals(lig));
	}
		
		
		Queue<String> q=new ArrayQueue<>();
		
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(2);
		in.add(2); // queue allows duplicates
		in.add(3);
		
		in.add(31);
		in.add(41);
		in.add(-2);
		//in.add("kj");
		System.out.println("Queue is "+in);
		in.remove(1);
		//System.out.println(in);
		
		List<String> ll=new LinkedList<>();
		ll.add("Benz");
		ll.add("audi");
		ll.add("VW");
		ll.add("Maruti");
		ll.remove(2);
		ll.remove("Maruti");
		System.out.println(ll);
		
		
	
		
		Set<String> s=new HashSet<>();  // treeset will save values in a sequence  // allows null (chk it ?)
		s.add("Pen");
		s.add("pencil");
		s.add("gen");
		//Iterator<String> i=s.iterator();
		//System.out.println(i.next());
		System.out.println("output is "+s);
		System.out.println("set contains o/p "+s.contains("geno"));
		Iterator<String> ii=s.iterator();
		System.out.println(ii.next());
		
		for (String j:s) 
		{
			System.out.println(j); 	
			
			
		}
		
		
		Set<String> s1=new LinkedHashSet<>();  // treeset will save values in a sequence  // allows null (chk it ?)
		s1.add("Penlink");
		s1.add("pencillink");
		s1.add("genlink");
		s1.add("linkedhash");
		
		
		//Iterator<String> i=s.iterator();
		//System.out.println(i.next());
		System.out.println("output is "+s1);
		System.out.println("linked hashset contains o/p "+s1.contains("geno"));
		Iterator<String> ins=s1.iterator();
		System.out.println(ins.next());
		
		for (String j:s1) 
		{
			System.out.println(j); 	
			
			
		}
		
		Set<Integer> ss=new TreeSet<>();  // output is shown in sorting order  // does not allows null (chk it ?)
		ss.add(1);
		ss.add(5);
		ss.add(2);
		ss.add(-3);
		ss.add(3);
		ss.add(7);
		ss.add(-1);
		System.out.println(ss);
		Iterator<Integer> iii=ss.iterator();
		while (iii.hasNext()) 
		{
			System.out.println("iterator Treeset "+iii.next());
			
		}
		
		// SortedSet and SortedMAp are interfaces
		
		
		
		Map<String, String> m=new TreeMap();  // does not allow null key, values (check it?)    // SortedMap<String, String> m=new TreeMap(); - worked
		Map<String, String> mmm=new HashedMap();
		m.put("Manoj", "545");
		m.put("Sra", "566");
		m.put("Dad", "533");
		m.put("Amma", "5556");
		//String k=m.get("Manoj");
		//System.out.println(k);
		System.out.println(m);
		/*
		Set<String> ll=m.keySet();
		for(String st:ll)
		{
		System.out.println(st+" "+m.get(st));	
		}
		*/
		
		// for every interface like sorted"map"/"set"  ... we have implemented class tree"map"/"set"
		
	
	}
	
}
