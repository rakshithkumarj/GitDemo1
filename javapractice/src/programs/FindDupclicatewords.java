package programs;

import java.util.HashSet;
import java.util.Set;

public class FindDupclicatewords {

	public static void main(String[] args) {
		String str = "i am am an software software engineer";
		String[] words = str.split(" ");
		Set<String> set = new HashSet<>();
		for (String s : words) {
			if (set.add(s) == false) {
				System.out.println("duplicate word is::" + s);
			}
		}
	}

}
