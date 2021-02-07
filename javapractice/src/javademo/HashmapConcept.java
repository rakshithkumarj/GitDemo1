package javademo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {
	HashMap<Integer,String > hm= new HashMap<Integer,String>();
	hm.put(1, "java");
	hm.put(2, null);
	hm.put(3, "linux");
	hm.put(4, null);
	hm.put(5, "api");
	hm.put(null, "testng");
	

	
	System.out.println(hm.get(4));
	System.out.println(hm);
	
	/*Iterator<Entry<Integer, String>> m=hm.entrySet().iterator();
	while(m.hasNext())
	{
		System.out.println(m.next());
	}
*/
	for(Entry<Integer, String> m:hm.entrySet())
	{
		if(m.getValue().equals("testng"))
		{
			System.out.println(m.getKey()+"::"+m.getValue());
		}
	}

}}
