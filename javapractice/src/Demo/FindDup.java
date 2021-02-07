package Demo;

import java.util.HashSet;
import java.util.Set;

public class FindDup {

	public static void main(String[] args) {
		String str = "evergreen";
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (set.add(c) == false) {
				sf.append(c);
			}
		}

		System.out.println(sf);
	}

}
