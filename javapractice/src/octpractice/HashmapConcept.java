package octpractice;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("java", 1);
		hm.put("selenium", 2);
		hm.put("testng", 3);
		hm.put("sql", 4);
		hm.put("api", 5);
		hm.put("linux", 6);

		System.out.println(hm.get("testng"));
		System.out.println(hm);
		Iterator<Entry<String, Integer>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + "value is " + m.getValue());
		}

	}
}
