package DecPractice;

import java.util.HashMap;
import java.util.Iterator;

public class CountDuplicates {

	public static void main(String[] args) {
		String s1 = "evergreen";
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] ch = s1.toCharArray();
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
			char temp = it.next();
			if (hm.get(temp) > 1) {
				System.out.println("the character " + temp + " occured " + hm.get(temp) + " number of times");
			}
		}
	}
}
