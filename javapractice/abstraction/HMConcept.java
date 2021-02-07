package abstraction;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HMConcept {

	public static void main(String[] args) {
		
		HashMap<String , String> hm= new HashMap<>();
		hm.put("A", "Java");
		hm.put("B", "Selenium");
		hm.put("C", "Testng");
		System.out.println(hm);
		
		
		//using entry set for each loop
		for(Entry m:hm.entrySet()) {
			
			System.out.println(m);
			System.out.println(m.getKey()+ " Value is "+m.getValue());
			
			
			Iterator<Entry<String,String>> it=hm.entrySet().iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
	                   Iterator<String> it1=hm.keySet().iterator();
			{
				while (it1.hasNext()) {
					System.out.println(it1.next());
					
				}
			}
		}
		
		
		

	}

}
