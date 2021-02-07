package javasession;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("java", 1);
		hm.put("java", 2);
		hm.put("Selenium", 3);
		hm.put("TestNG", 4);
		hm.put("Linux", 5);
		hm.put("Maven", 6);
		hm.put(null, 7);
		hm.put("sql", null);
		hm.put("postman", null);

		Iterator<Entry<String, Integer>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + " Value is " + m.getValue());
		}

	}

}
