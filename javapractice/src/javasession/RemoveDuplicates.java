package javasession;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "evergreen";
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new HashSet<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}

		}
		System.out.println(sb);
	}

}
