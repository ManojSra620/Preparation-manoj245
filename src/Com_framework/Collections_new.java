package Com_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.collections.map.HashedMap;

public class Collections_new 
{

	public static void main(String[] args) 
	{
		int  a[]= {1,2,31};
		System.out.println(a[2]);
		
		int[] b= {2,445,7};
		
		
		
		
		List<Integer> l=new ArrayList<>();
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(20000);
		l.add(8520);
		l.add(null);
		// System.out.println(l);
		
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
		
		List<int[]> lis=Arrays.asList(b);
		System.out.println(lis.get(0));
		
		Set<Integer> s=new  TreeSet<>();
		
		s.add(2);
		s.add(3);
		s.add(3);
		s.add(56);
		// s.add(null);
		Iterator it=s.iterator();
		//System.out.println(it.next());
	//	System.out.println(it.next());
	//	System.out.println(it.next());
		// System.out.println(it.next());
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		// List<String> add=new ArrayList<>(s);
		
		Set<String>  ss=new TreeSet<>();
		ss.add("abc");
		ss.add("cds");
		ss.add("potti");
		
		
		Map<Integer,String> m=new HashedMap();
	//	m.put(1, "man");
		m.put(1, "hero");
		m.put(2, "man");
		m.put(3, null);
		// System.out.println(m.get(1));
		Set<Integer>  se=m.keySet();
		
		for(int key:se)
		{
			System.out.println(m.get(key));
		}
		

	}

}
