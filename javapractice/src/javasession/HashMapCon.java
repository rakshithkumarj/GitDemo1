package javasession;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapCon {

	public static void main(String[] args) {
		String s1 = "engineer";
		char[] ch = s1.toCharArray();
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new HashSet<>();

		for (char c : ch) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}

		}
		System.out.println(sb);
	}
}
