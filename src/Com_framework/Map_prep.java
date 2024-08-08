package Com_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections.map.HashedMap;

public class Map_prep 
{

	public static void main(String[] args) 
	{
		Map<String, String>  mp=new HashMap();   // in treemap u cant have null as key . but u can have null as value. But in hashmap u canu have null key, value
		mp.put("town", "asd");
		mp.put("city", null);
		mp.put(null, "rtr");
		mp.put("state", "hyh");
		
		System.out.println(mp.get(null));
		
		

	}

}
