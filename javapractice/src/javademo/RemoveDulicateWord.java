package javademo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDulicateWord {

	public static void main(String[] args) {
		
		String[] words = { "java", "selenim", "maven", "linux", "testng", "java", "api", "selenium" };
		Set<String> set = new HashSet<String>();
		
		/* * for (String str : words) {
		 * 
		 * 
		 * if (set.add(str) == false) { System.out.println("Duplicate word is::" + str);
		 * }
		 * 
		 * }*/
		 

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String tempString : words) {
			{
				if (hm.get(tempString) != null) {
					hm.put(tempString, hm.get(tempString) + 1);
				} else {
					hm.put(tempString, 1);
				}
			}

		}
		System.out.println(hm);
		Iterator<String> tempString=hm.keySet().iterator();
		while(tempString.hasNext())
		{
			String temp=tempString.next();
			if(hm.get(temp)>1)
			{
				System.out.println("The word"+temp+ "occured"+hm.get(temp)+"number of times");
			}
		}
	}

}
