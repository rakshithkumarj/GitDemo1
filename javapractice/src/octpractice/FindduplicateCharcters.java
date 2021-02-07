package octpractice;

import java.util.HashMap;
import java.util.Iterator;

public class FindduplicateCharcters {

	public static void main(String[] args) {
		HashMap<Character, Integer> hm = new HashMap<>();
		String str = "evergren";
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else

			{
				hm.put(c, 1);
			}
		}
		Iterator<Character> c=hm.keySet().iterator();
		while(c.hasNext())
		{
			Character temp=c.next();
			if(hm.get(temp)>1)
			{
				System.out.println("the character "+temp+ "has occured"+hm.get(temp)+ "number of times");
			}
		}

	}

}
