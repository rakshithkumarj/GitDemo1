import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String str = "Evergreen forest forest amazon forest nature amazon";
		String[] st = str.split(" ");
		Set<String> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		char[] ch = str.toCharArray();
		for (String s : st) {
			if (set.add(s) == true) {
				System.out.println(s);
			}
		}

	}

}
