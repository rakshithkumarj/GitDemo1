package octpractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UpperCase {

	public static void main(String[] args) {
		String[] str = { "rakshith", "rakshith", "java", "python", "automation", "C" };
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println("Duplicate element is::" + str[i]);
				}
			}
		}
		// method 2

		Set<String> store = new HashSet<>();
		for (String name : str)
			if (store.add(name) == false) {
				System.out.println("duplicate elemengts is::" + name);
			}
	}
}