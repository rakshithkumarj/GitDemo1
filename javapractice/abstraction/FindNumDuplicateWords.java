package abstraction;

import java.util.HashMap;
import java.util.Iterator;

public class FindNumDuplicateWords {

	public static void main(String[] args) {
		String[] s1 = { "java", "pearl", "selenium", "testng", "java", "c++", "Sql", "linux", "testng" };
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String tempString : s1) {

			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			}

			else

			{

				hm.put(tempString, 1);

			}

		}
		Iterator<String> tempString = hm.keySet().iterator();
		while (tempString.hasNext()) {
			String temp = tempString.next();
			if (hm.get(temp) > 1) {
				System.out.println("The word" + temp + "appeared" + hm.get(temp) + "number of times");
			}
		}
	}
}
