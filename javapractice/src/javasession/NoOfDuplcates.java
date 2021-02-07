package javasession;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NoOfDuplcates {

	public static void main(String[] args) {
		String str = "evergreen";

		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char tempChar : ch) {

			if (hm.get(tempChar) != null) {
				hm.put(tempChar, hm.get(tempChar) + 1);
			} else {

				hm.put(tempChar, 1);

			}

		}
		Iterator<Character> tempChar=hm.keySet().iterator();
		while(tempChar.hasNext())
		{
			Character temp=tempChar.next();
			if(hm.get(temp)>1)
			{
				System.out.println("The character"+temp+ "occured"+hm.get(temp) +"number of times");
			}
		}
			
		

	}

}
