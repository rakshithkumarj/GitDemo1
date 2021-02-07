package javasession;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
	
		HashMap<String ,String> hm= new HashMap<>();
		
	  hm.put("A", "java");
	  hm.put("B", "Selenium");
	  hm.put("C", "API");
	  hm.put("D", "TestNG");
	  hm.put("E", "SQL");
	  
	  System.out.println(hm);
	  
	  Iterator<Entry<String , String>> it=hm.entrySet().iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  
	  
	for(Entry<String , String> m  :hm.entrySet())
	{
		if(m.getValue().equals("SQL"))
		{
		
		System.out.println(m.getKey());
	  
	  
		

	}

	}}}
