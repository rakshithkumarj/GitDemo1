package Demo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str = "Evergreen";
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new HashSet<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			/*if (!set.contains(c)) {
				set.add(c);
				sb.append(c);

			}*/
			if(set.add(c)==false)
			{
				System.out.println("duplicate character is"+c);
			}
		}
		/*System.out.println(sb);*/

	}

}
