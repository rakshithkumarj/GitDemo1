package programs;

import java.util.HashMap;
import java.util.Iterator;

public class FindNumDupHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();

		String s = "i am an qa qa engineer qa a an automation engineer";
		String[] str = s.split(" ");
		for (String tempString : str) {
			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			} else {
				hm.put(tempString, 1);
			}
		}

	Iterator<String> tempString=hm.keySet().iterator();
	while(tempString.hasNext())
	{
		String temp=tempString.next();
		if(hm.get(temp)>1)
		{
			System.out.println("duplicate word "+temp+ "has occured"+hm.get(temp)+ " number of times");
		}
	}
	}

}
