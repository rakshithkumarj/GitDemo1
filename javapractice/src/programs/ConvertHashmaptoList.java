package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ConvertHashmaptoList {

	public static void main(String[] args) {
		HashMap<String, Integer> comMap = new HashMap<>();
		comMap.put("Google", 1000);
		comMap.put("Amazon", 5000);
		comMap.put("Flipkart", 10000);
		comMap.put("Microsoft", 3000);
		comMap.put("Yahoo", 2000);
		
		System.out.println(comMap.size());
		
		Iterator it=comMap.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		List<String> compList= new ArrayList<String>(comMap.keySet());
	 for(String s:compList)
	 {
		 System.out.println("Company name is= "+s);
	 }
		
		

	}

}
