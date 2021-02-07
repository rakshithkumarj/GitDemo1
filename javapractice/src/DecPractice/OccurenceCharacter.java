package DecPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class OccurenceCharacter {

	public static void main(String[] args) {
		String str = "aaaautomation";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();

		for (char c : ch) {
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		System.out.println(hm);
		Iterator<Character> it = hm.keySet().iterator();
		while (it.hasNext()) {
			Character temp = it.next();
			if (hm.get(temp) > 1)

			{
				System.out.println("the characer" + temp + "occured" + hm.get(temp) + "number of times");
			}
		}
	}

}
