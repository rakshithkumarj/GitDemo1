package logics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapConcept {

	// hashmap store the values in the key and value pairs;
	// hashmap store one null key and multiple null values;
	// we use iterator to fetch the values of key and values;
	// hashmap uses put method to store the values inside the map
	

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("a", "java");
		hm.put("b", "selenium");
		hm.put("c", "api");
		hm.put("d", null);
		hm.put("e", "java");
		hm.put(null, "java");
		hm.put("f", null);
		hm.put("g", "testng");
		hm.put(null, "linux");
		hm.put("b", "sql");
		
		
		System.out.println(hm.get("b"));
		
		System.out.println(hm);
		
		
		for(Entry<String, String> m:hm.entrySet())//using the entry set inside for each loop
		{
			System.out.println(m.getKey()+ " Value is "+m.getValue());
		}
		
		Iterator<Entry<String, String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
