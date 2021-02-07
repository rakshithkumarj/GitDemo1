package javademo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HshmapTest {
	public static void main(String[] args) {
		HashMap<Integer,String > hm= new HashMap<Integer,String>();
		hm.put(1, "java");
		hm.put(2, "selenium");
		hm.put(3, "linux");
		hm.put(4, "maven");
		hm.put(5, "api");
		
		for(Entry<Integer,String> m:hm.entrySet())
		{
			if(m.getValue().equalsIgnoreCase("maven"))
			{
				System.out.println(m.getKey()+"::"+m.getValue());
			}
		}
		
	}

}
