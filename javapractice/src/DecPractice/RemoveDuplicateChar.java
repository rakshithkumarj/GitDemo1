package DecPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str = "Evergreen";
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for (char c : ch) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
