package javasession;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		String s1 = "selenium";
		char[] ch = s1.toCharArray();
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for (char c : ch) {
			if (set.add(c) == true) {
				set.add(c);
				sb.append(c);

			}
		}
		System.out.println(sb);
	}

}
