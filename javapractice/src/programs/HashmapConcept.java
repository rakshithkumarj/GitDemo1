package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("a", "java");
		hm.put("b", "selenium");
		hm.put("c", "java");
		hm.put("d", null);
		hm.put("e", null);
		hm.put(null, "linux");
		hm.put(null, "pearl");
		/*System.out.println(hm);*/

		/*
		 * Iterator<Entry<String, String>> it=hm.entrySet().iterator();
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */

		for (Entry<String, String> m : hm.entrySet()) {
			if (m.getValue().equals("selenium")) {
				System.out.println(m.getKey());/* + "Value is" + m.getValue());*/
			}
		}

	}
}
