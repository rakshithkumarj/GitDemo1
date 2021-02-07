import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintMissingCharacters {

	public static void main(String[] args) {
		String str = "selenium";
		String[] s1 = str.split("");
		String[] allAlphabets = "abcdefghijklmnopqrstuvwxyz".split("");
		List<String> l1 = new ArrayList<>(Arrays.asList(s1));
		List<String> l2 = new ArrayList<>(Arrays.asList(allAlphabets));
		l2.removeAll(l1);
		System.out.println(l2);

	}

}
