package javademo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("selenium");
		set.add("testng");
		set.add("webservices");
		set.add("Linux");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			{
				System.out.println(it.next());
			}

		}

	}

}
