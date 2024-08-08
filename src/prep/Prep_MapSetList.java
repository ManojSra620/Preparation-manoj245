package prep;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.HashedMap;

public class Prep_MapSetList 
{

	public static void main(String[] args) 
	{
		
		Set<String> s=new HashSet<>();
		s.add("sds");
		s.add("Kumar");
		s.add("Sadasivuni");
		s.add("Sadasivuni");
		System.out.println(s);  // it l print all those added.
		
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		Map<Integer, String> m=new HashedMap();
		m.put(1, "man");
		m.put(2, "oj");
		m.put(3, "sads");
		Set<Integer> ss=m.keySet();
		System.out.println(m.get(1));
	//	System.out.println(m.get(ss));  // wont work like set. it l give null   // iterator wont work here
		for(int k:ss)
		{
			System.out.println(m.get(k));
		}
		
		
		
		
		
		
	}

}
