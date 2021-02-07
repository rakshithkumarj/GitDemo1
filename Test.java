package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		
		HashMap<String, String> hm= new HashMap<String,String>();
		
		hm.put("A","java");
		hm.put("B","Selenium");
		hm.put("C","Testng");
		hm.put("D","Linux");
		
		System.out.println(hm);
		
		String object=hm.get("C");
		System.out.println(object);
		/*Iterator<Entry<String, String>> it=hm.entrySet().iterator();
		{
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }
		}*/
		
		
	//specific value from 
    for(Entry<String ,String> m:hm.entrySet())
    {
    	if(m.getValue().equals("Testng"))
    	{
    	     System.out.println(m.getKey()+ "="+m.getValue());
    	}

    }
	
		

	}

}
