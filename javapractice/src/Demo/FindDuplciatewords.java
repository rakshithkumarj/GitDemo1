package Demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplciatewords {

	public static void main(String[] args) {
		String s = "i am an am qa engineer an automation qa selenium java java selenium";
		String[] str = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();

		for (String tempString : str) {
			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			} else {
				hm.put(tempString, 1);
			}

		}
		System.out.println(hm);
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()) {
			String temp = it.next();
			if (hm.get(temp) > 1) {
				System.out.println("the word " + temp + "Occured" + hm.get(temp) + "number of times");
			}
		}

	}
}
