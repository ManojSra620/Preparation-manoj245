package prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Prep_Set_Map_List 
{

	public static void main(String[] args) 
	{
	String[] strarr=new String[3];
	
	
List<Integer> l=new ArrayList<>();
l.add(2);
l.add(3);
l.add(4);
l.add(9);
l.add(23);
l.size();

Set<Integer> s=new HashSet<>();
s.add(6);
s.add(5);
	
	strarr[0]="abc";
	strarr[1]="bca";
	l.addAll(s);  // strarr is not allowed
	System.out.println(l);
	
	
	Map<Integer,String> mp=new HashMap<>();
	mp.put(1,"Dad");
	mp.put(2,"Amma");
	mp.put(3,"All");
	System.out.println(mp.get(1));
	int[] a;
	//=mp.keySet();
	Set<Integer> st=mp.keySet();
	for(int e:st)
	{
		System.out.println(mp.get(e));
	}
	
	
	
	
	
	
	
	
	
	}

}
