package octpractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		String str = "selenium automation engineer";
		for (int i = 0; i < str.length(); i++)

		{
			Character c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
