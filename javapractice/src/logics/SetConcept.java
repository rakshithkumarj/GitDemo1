package logics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class SetConcept {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("linux");
		set.add(null);
		set.add("java");
		set.add("testng");
		set.add("selenium");

		System.out.println(set);// set does not allow duplicate and size will be 5 in this case

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());// in set data are not stored in the form of indexes,So we have to use the
											// iterator concepts to fetch the values
		}

	}

}
