package octpractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("selenium");
		set.add("testng");
		set.add("sql");
		set.add("linux");
		set.add("sql");
		System.out.println(set.size());

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		

	}

}
