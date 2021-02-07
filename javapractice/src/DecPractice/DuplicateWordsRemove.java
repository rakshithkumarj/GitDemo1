package DecPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsRemove {

	public static void main(String[] args) {
		String str = "i am am an qa software qa engineer engineer";
		String[] words = str.split(" ");
		Set<String> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for (String word : words) {
			if (!set.contains(word)) {
				set.add(word);
				sb.append(" " + word);
			}
		}
		System.out.println(sb);

	}

}
