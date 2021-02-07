package javasession;

import java.util.HashMap;
import java.util.Iterator;

public class HashmapCountWords {

	public static void main(String[] args) {
		String s1 = "i am am an  qa software an engineer automation software qa ";
		String[] str = s1.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for (String tempString : str) {
			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			} else {
				hm.put(tempString, 1);
			}

		}

	  Iterator<String > tempString= hm.keySet().iterator();
	  while(tempString.hasNext())
	  {
		  String temp=tempString.next();
		  if(hm.get(temp)>=1)
		  {
			  System.out.println("The word"+temp+ "Occured"+hm.get(temp)+" Number of times");
		  }
	  }

	}

}
