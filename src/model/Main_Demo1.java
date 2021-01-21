package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main_Demo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> countries=new HashMap<>();
		countries.put(15, "Australia");
		countries.put(1, "India");
		countries.put(5, "Sri lanka");
		countries.put(8, "Japan");
		countries.put(6, "Pakistan");
		countries.put(5, "Ceylon");
		countries.put(null, "USA");
		countries.put(null, "America");
		Set<Integer> keys = countries.keySet();
//		for(Integer key:keys)
//			System.out.println(countries.get(key));
		
//		Collection<String> values = countries.values();
//		for(String c:values)
//			System.out.println(c);

		for(Entry<Integer, String> e:countries.entrySet())
			System.out.println(e);
	
		
	}

}
