package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer,String>();
		hm.put(1, "java");
		hm.put(2, "selenium");
		hm.put(3, "testng");
		
		System.out.println(hm);
		
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		{
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		
		System.out.println("Other way");
		
	for(Entry<Integer, String> m:hm.entrySet())
	{
		if(m.getValue().equals("selenium"))
		{
		System.out.println(m.getKey() +" Value is "+m.getValue());
	}

	}
	}
}
