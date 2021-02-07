package DecPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingLetters {

	public static void main(String[] args) {
		String word = "Automation";
		String[] s = word.split("");
		String[] allLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

		List<String> s1 = new ArrayList<String>(Arrays.asList(s));
		List<String> s2 = new ArrayList<String>(Arrays.asList(allLetters));
		s2.removeAll(s1);
		System.out.println("Missing letters in the string is" + s2);
	}

}
