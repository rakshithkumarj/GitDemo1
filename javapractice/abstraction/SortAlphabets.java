package abstraction;

import java.util.Arrays;

public class SortAlphabets {

	public static void main(String[] args) {
		String s1= "automation";
		char[] ch=s1.toCharArray();
		Arrays.sort(ch);
		for (char c : ch) {
			 System.out.println(c);
		}
	}

}
